package games.enchanted.verticalSlabs.util;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockAndBlockItem {
  private final Block block;
  private final BlockItem blockItem;
  
  public BlockAndBlockItem(Block block, BlockItem blockItem) {
    this.block = block;
    this.blockItem = blockItem;
  }

  public Block asBlock() {
    return this.block;
  }

  public BlockItem asBlockItem() {
    return this.blockItem;
  }
}
