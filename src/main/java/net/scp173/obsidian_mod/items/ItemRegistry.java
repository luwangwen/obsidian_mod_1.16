package net.scp173.obsidian_mod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.scp173.obsidian_mod.Utils;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS =  DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", ObsidianIngot::new);
}
