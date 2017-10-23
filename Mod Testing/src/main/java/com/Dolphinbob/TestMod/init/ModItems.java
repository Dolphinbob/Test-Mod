package com.Dolphinbob.TestMod.init;

import com.Dolphinbob.TestMod.items.DirtSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemSword dirtsword;
		public static void init() {
			dirtsword = new DirtSword();
		}
		
		public static void register() {
			RegistryEvent.Register(dirtsword);
		}
		
		public static void registerRenders() {
			registerRender();
		}
		
		public static void regiterRender(Item item) {
			System.out.println(item.getRegistryName());
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
}
