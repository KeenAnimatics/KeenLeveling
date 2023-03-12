
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.keen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.keen.item.SkillCartridgeItem;
import net.mcreator.keen.KeenMod;

public class KeenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KeenMod.MODID);
	public static final RegistryObject<Item> BATTERY_TIER_1 = block(KeenModBlocks.BATTERY_TIER_1, KeenModTabs.TAB_KEEN_LEVELING);
	public static final RegistryObject<Item> SKILL_CARTRIDGE = REGISTRY.register("skill_cartridge", () -> new SkillCartridgeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
