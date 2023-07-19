package net.scp173.obsidian_mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.scp173.obsidian_mod.items.ItemRegistry;

@Mod(Utils.MOD_ID)
public class ObsidianMod {
    public ObsidianMod() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
