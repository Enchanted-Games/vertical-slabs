package games.enchanted.registry.types;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class TestType extends HorizontalFacingBlock {
    public static final BooleanProperty SINGLE = BooleanProperty.of("single_slab");

    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(SINGLE);
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    public TestType(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(SINGLE, true));
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {

        // changes hitbox depending on block state

        Direction dir = state.get(FACING);
        if(!state.get(SINGLE)){
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


    /*@Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(player.isHolding(ModItems.TEST_BLOCKSTATE) ){
            player.playSound(SoundEvents.BLOCK_RESPAWN_ANCHOR_CHARGE, 1, 1);
            world.setBlockState(pos, state.with(SINGLE, true));
        }else{

        }

        return ActionResult.CONSUME_PARTIAL;
    }*/

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        // checks if player clicked on block with same item type
        // i know this is a bad way to do it but this is my first time
        if (player.getAbilities().allowModifyWorld && player.getStackInHand(hand).isItemEqual(new ItemStack(this)) && (Boolean)state.get(SINGLE)) {
            world.setBlockState(pos, state.with(SINGLE, false));

            // checks if player is in creative and removes 1 item if not
            boolean isInCreative = player.getAbilities().creativeMode;
            if(!isInCreative){
                player.getStackInHand(hand).setCount( player.getStackInHand(hand).getCount() - 1 );
            }

            // makes arm swing
            return ActionResult.success(world.isClient);
        } else {
            return ActionResult.PASS;
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        // gets player rotation
        return this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing());
    }

}
