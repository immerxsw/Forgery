package net.immerxsw.forgerymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.immerxsw.forgerymod.ForgeryMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_TIN = registerItem("raw_tin",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item INGOT_TIN = registerItem("ingot_tin",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ForgeryMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ForgeryMod.LOGGER.debug("Registering Mod Items for " + ForgeryMod.MOD_ID);
    }
}
