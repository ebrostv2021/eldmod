
package net.mcreator.elfgirl.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.elfgirl.itemgroup.ElfgirlItemGroup;
import net.mcreator.elfgirl.ElfgirlModElements;

@ElfgirlModElements.ModElement.Tag
public class ElfHoeItem extends ElfgirlModElements.ModElement {
	@ObjectHolder("elfgirl:elf_hoe")
	public static final Item block = null;
	public ElfHoeItem(ElfgirlModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 0, -3f, new Item.Properties().group(ElfgirlItemGroup.tab)) {
		}.setRegistryName("elf_hoe"));
	}
}
