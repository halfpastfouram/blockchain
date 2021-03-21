package am.halfpastfour.blockchain.data.client;

import am.halfpastfour.blockchain.BlockChain;
import am.halfpastfour.blockchain.blocks.MinerBlock;
import am.halfpastfour.blockchain.items.ConfiguratorItem;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, BlockChain.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(MinerBlock.BLOCK_NAME, modLoc(MinerBlock.BLOCK_LOCATION));
        withExistingParent(ConfiguratorItem.ITEM_NAME, modLoc(ConfiguratorItem.ITEM_LOCATION));

        getBuilder(ConfiguratorItem.ITEM_NAME)
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/item_configurator");
    }
}
