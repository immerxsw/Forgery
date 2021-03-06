package net.immerxsw.forgerymod;

import net.fabricmc.api.ModInitializer;
import net.immerxsw.forgerymod.block.ModBlocks;
import net.immerxsw.forgerymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForgeryMod implements ModInitializer {
	public static final String MOD_ID = "forgerymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
