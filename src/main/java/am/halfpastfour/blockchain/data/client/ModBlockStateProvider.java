package am.halfpastfour.blockchain.data.client;

import am.halfpastfour.blockchain.BlockChain;
import am.halfpastfour.blockchain.blocks.MinerBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, BlockChain.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ResourceLocation bottom = modLoc("block/block_miner_bottom");
        ResourceLocation front = modLoc("block/block_miner_front");
        ResourceLocation side = modLoc("block/block_miner_side");
        ResourceLocation top = modLoc("block/block_miner_top");
        simpleBlock(
                MinerBlock.BLOCK_MINER.get(),
                models().cube(MinerBlock.BLOCK_NAME, bottom, top, front, side, side, side).texture("particle", front)
        );
    }
}
