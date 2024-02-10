package com.cjarv94.talon;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	public static <T extends Item> T register(T item, String ID) {
		Identifier itemID = new Identifier(Talon.MOD_ID, ID);
		
		T registeredItem = Registry.register(Registries.ITEM, itemID, item);
		
		return registeredItem;
	}
}
