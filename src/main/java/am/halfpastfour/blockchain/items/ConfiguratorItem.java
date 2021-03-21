package am.halfpastfour.blockchain.items;

import am.halfpastfour.blockchain.utils.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ConfiguratorItem extends AbstractItem {
    public static final String ITEM_NAME = "item_configurator";
    public static final String ITEM_LOCATION = "item/" + ITEM_NAME;
    public static final RegistryObject<Item> ITEM_CONFIGURATOR = Registration.ITEMS.register(
            ITEM_NAME,
            () -> new Item(
                    new Item.Properties().tab(ItemGroup.TAB_TOOLS)
            )
    );
}
