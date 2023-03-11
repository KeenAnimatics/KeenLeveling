
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.keen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.keen.item.SkillCartridgeItem;
import net.mcreator.keen.KeenMod;

public class KeenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KeenMod.MODID);
	public static final RegistryObject<Item> SKILL_CARTRIDGE = REGISTRY.register("skill_cartridge", () -> new SkillCartridgeItem());
}
