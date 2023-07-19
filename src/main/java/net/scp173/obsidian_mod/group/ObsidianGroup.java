package net.scp173.obsidian_mod.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ObsidianGroup extends ItemGroup {
    public ObsidianGroup() {
        super("obsidian_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.OBSIDIAN);
    }
}
