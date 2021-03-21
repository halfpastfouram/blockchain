package am.halfpastfour.blockchain.blocks;

import am.halfpastfour.blockchain.utils.Registration;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public abstract class AbstractBlock {
    public void register () {}

    protected static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    protected static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> value = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(value.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

        return value;
    }
}
