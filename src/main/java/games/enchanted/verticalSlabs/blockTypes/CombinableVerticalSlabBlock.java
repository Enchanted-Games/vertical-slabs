package games.enchanted.verticalSlabs.blockTypes;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.*;
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

        // changes hitbox depending on block state

        Direction dir = state.get(FACING);
        if (!state.get(SINGLE)) {
            return VoxelShapes.fullCube();
        } else if (dir == Direction.NORTH) {
            return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f);
        } else if (dir == Direction.SOUTH) {
            return VoxelShapes.cuboid(0.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f);
        } else if (dir == Direction.EAST) {
            return VoxelShapes.cuboid(0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else if (dir == Direction.WEST) {
            return VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 1.0f);
        }
        return VoxelShapes.fullCube();

    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    protected boolean canReplace(BlockState state, ItemPlacementContext context) {
        ItemStack itemStack = context.getStack();
        if (!state.get(SINGLE) && !(itemStack.isOf(this.asItem()))) {
            return false;
        }

        double hitposX = context.getHitPos().x - (double)context.getBlockPos().getX();
        double hitposZ = context.getHitPos().z - (double)context.getBlockPos().getZ();

        Direction facingDirection = state.get(Properties.HORIZONTAL_FACING);
        switch (facingDirection.toString()) {
            case "north":
                return hitposZ >= 0.5;
            case "east":
                return hitposX <= 0.5;
            case "south":
                return hitposZ <= 0.5;
            case "west":
                return hitposX >= 0.5;
            default:
                return false;
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos());
        if (blockState.isOf(this)) {
            return blockState.with(SINGLE, false).with(Properties.WATERLOGGED, false);
        }
        return this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        if (state.get(SINGLE) != false) {
            return Waterloggable.super.tryFillWithFluid(world, pos, state, fluidState);
        }
        return false;
    }
    @Override
    public FluidState getFluidState(BlockState state) {
        if (state.get(Properties.WATERLOGGED).booleanValue()) {
            return Fluids.WATER.getStill(false);
        }
        // return state.getFluidState();
        return state.getFluidState();
    }

    @Override
    protected MapCodec<? extends CombinableVerticalSlabBlock> getCodec() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCodec'");
    }

}
