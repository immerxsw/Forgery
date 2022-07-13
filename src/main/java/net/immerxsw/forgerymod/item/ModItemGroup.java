package net.immerxsw.forgerymod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.immerxsw.forgerymod.ForgeryMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FORGERY = FabricItemGroupBuilder.build(
            new Identifier(ForgeryMod.MOD_ID, "forgery"), () -> new ItemStack(ModItems.INGOT_BRONZE));
}
