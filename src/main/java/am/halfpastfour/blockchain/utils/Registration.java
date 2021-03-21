package am.halfpastfour.blockchain.utils;

import am.halfpastfour.blockchain.BlockChain;
import am.halfpastfour.blockchain.blocks.AbstractBlock;
import am.halfpastfour.blockchain.blocks.MinerBlock;
import am.halfpastfour.blockchain.items.AbstractItem;
import am.halfpastfour.blockchain.items.ConfiguratorItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockChain.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlockChain.MOD_ID);

    private static final Logger LOGGER = LogManager.getLogger();

    private static final AbstractItem[] items = {
            new ConfiguratorItem()
    };

    private static final AbstractBlock[] blocks = {
            new MinerBlock()
    };

    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        for (AbstractItem item : items) {
            item.register();
        }

        for (AbstractBlock block : blocks) {
            block.register();
        }
    }
}
