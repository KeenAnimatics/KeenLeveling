
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.keen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.keen.block.BatteryTier1Block;
import net.mcreator.keen.KeenMod;

public class KeenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KeenMod.MODID);
	public static final RegistryObject<Block> BATTERY_TIER_1 = REGISTRY.register("battery_tier_1", () -> new BatteryTier1Block());
}
