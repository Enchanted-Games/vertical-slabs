package games.enchanted.verticalSlabs.blockTypes;

import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;


public class OxidizableVerticalSlab extends CombinableVerticalSlabBlock implements Oxidizable {
    private final OxidationLevel oxidizationLevel;

    public OxidizableVerticalSlab(OxidationLevel oxidizationLevel, Settings settings) {
        super(settings);
        this.oxidizationLevel = oxidizationLevel;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    @Override
    public OxidationLevel getDegradationLevel() {
        return this.oxidizationLevel;
    }
}
