package com.Dolphinbob.TestMod.items;

import com.Dolphinbob.TestMod.Referance;

import net.minecraft.item.ItemSword;

public class DirtSword extends ItemSword{

	public DirtSword() {
		super(ToolMaterial.IRON);
		setUnlocalizedName(Referance.Items.DIRTSWORD.getUnlocalizedName());
		setRegistryName(Referance.Items.DIRTSWORD.getRegistryName());
	}

}
