package games.enchanted.verticalSlabs.blockTypes;

import org.jetbrains.annotations.Nullable;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class CombinableVerticalSlabBlock extends HorizontalFacingBlock implements Waterloggable {
    public static final MapCodec<? extends CombinableVerticalSlabBlock> CODEC = createCodec(CombinableVerticalSlabBlock::new);
    public static final BooleanProperty SINGLE = BooleanProperty.of("single_slab");

    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(SINGLE);
        stateManager.add(Properties.HORIZONTAL_FACING);
        stateManager.add(Properties.WATERLOGGED);
    }

    public CombinableVerticalSlabBlock(Settings settings) {
        super(settings);
        setDefaultState(stateManager.getDefaultState().with(SINGLE, true));
        setDefaultState(stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        setDefaultState(stateManager.getDefaultState().with(Properties.WATERLOGGED, false));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        if( !state.get(SINGLE) ) {
            return VoxelShapes.fullCube();
        }
        switch (state.get(FACING)) {
            case Direction.NORTH:
                return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f);
            case Direction.EAST:
                return VoxelShapes.cuboid(0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            case Direction.SOUTH:
                return VoxelShapes.cuboid(0.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f);
            case Direction.WEST:
                return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 1.0f);
            default:
                return VoxelShapes.fullCube();
        }
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    protected boolean canReplace(BlockState state, ItemPlacementContext context) {
        ItemStack itemStack = context.getStack();
        if ( !state.get(SINGLE) || !(itemStack.isOf(this.asItem())) ) {
            return false;
        }
        if ( !context.canReplaceExisting() ) {
            return true;
        }

        double hitposX = context.getHitPos().getX() - (double)context.getBlockPos().getX();
        double hitposZ = context.getHitPos().getZ() - (double)context.getBlockPos().getZ();

        Direction facingDirection = state.get(Properties.HORIZONTAL_FACING);
        switch (facingDirection) {
            case Direction.NORTH:
                return hitposZ >= 0.5;
            case Direction.EAST:
                return hitposX <= 0.5;
            case Direction.SOUTH:
                return hitposZ <= 0.5;
            case Direction.WEST:
                return hitposX >= 0.5;
            default:
                return false;
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        BlockState replacingBlockState = ctx.getWorld().getBlockState(blockPos);
        FluidState replacingFluidState = ctx.getWorld().getFluidState(blockPos);

        // if replacing a vertical slab, turn existing slab into double slab
        if (replacingBlockState.isOf(this)) {
            return replacingBlockState
                .with(SINGLE, false)
                .with(Properties.WATERLOGGED, false);
        }
        
        // normal placement logic
        return this.getDefaultState()
            .with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing())
            .with(Properties.WATERLOGGED, replacingFluidState.getFluid() == Fluids.WATER);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        if ( state.get(Properties.WATERLOGGED).booleanValue() ) {
            return Fluids.WATER.getStill(false);
        }
        return state.getFluidState();
    }
    
    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        if ( state.get(SINGLE) ) {
            return Waterloggable.super.tryFillWithFluid(world, pos, state, fluidState);
        }
        return false;
    }

    @Override
    public boolean canFillWithFluid(@Nullable PlayerEntity player, BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        if ( state.get(SINGLE) ) {
            return Waterloggable.super.canFillWithFluid(player, world, pos, state, fluid);
        }
        return false;
    }
    
    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if ( state.get(Properties.WATERLOGGED).booleanValue() ) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }
    
    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return !state.get(SINGLE);
    }

    @Override
    protected MapCodec<? extends CombinableVerticalSlabBlock> getCodec() {
        return CODEC;
    }
}
