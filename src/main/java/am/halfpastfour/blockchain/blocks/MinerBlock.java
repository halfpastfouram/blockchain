package am.halfpastfour.blockchain.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class MinerBlock extends AbstractBlock {
    public static final String BLOCK_NAME = "block_miner";
    public static final String BLOCK_LOCATION = "block/" + BLOCK_NAME;
    public static final RegistryObject<Block> BLOCK_MINER = register(
            BLOCK_NAME,
            () -> new Block(
                    net.minecraft.block.AbstractBlock.Properties.of(Material.STONE)
                            .harvestLevel(4)
                            .sound(SoundType.CHAIN)
                            .harvestTool(ToolType.PICKAXE)
                            .strength(2f)
            )
    );
}
