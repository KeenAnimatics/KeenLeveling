
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.keen.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class KeenModTabs {
	public static CreativeModeTab TAB_KEEN_LEVELING;

	public static void load() {
		TAB_KEEN_LEVELING = new CreativeModeTab("tabkeen_leveling") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KeenModItems.SKILL_CARTRIDGE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
