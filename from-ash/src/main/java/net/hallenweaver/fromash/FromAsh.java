package net.hallenweaver.fromash;

import net.fabricmc.api.ModInitializer;

import net.hallenweaver.fromash.block.ModBlocks;
import net.hallenweaver.fromash.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FromAsh implements ModInitializer {
	public static final String MOD_ID = "fromash";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}