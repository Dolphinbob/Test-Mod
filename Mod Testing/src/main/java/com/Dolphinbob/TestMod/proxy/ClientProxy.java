package com.Dolphinbob.TestMod.proxy;

import com.Dolphinbob.TestMod.init.ModItems;

public class ClientProxy implements CommonProxy{
	@Override
	public void init() {
		ModItems.registerRenders();
	}
}
