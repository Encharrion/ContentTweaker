package com.teamacronymcoders.contenttweaker.modules.vanilla.potions;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.potions.IPotion;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenClass("mods.contenttweaker.potions.PotionBuilder")
@ZenRegister
public class PotionBuilder {
	
	@ZenProperty
	public boolean isBadEffect = false;
	
	@ZenProperty
	public int liquidColor = 0xFFFFFFFF;
	
	@ZenProperty
	public String name;

	@ZenProperty
	public PotionFunctions.PerformEffect performEffect = null;
	
	@ZenProperty
	public PotionFunctions.IsReady isReady = null;
	
	@ZenProperty
	public String domain = "contenttweaker";
	
	public PotionBuilder(String name) {
        this.name = name;
    }
	
	@ZenMethod
	public static PotionBuilder create(String name) {
		return new PotionBuilder(name);
	}
	
	@ZenMethod
	public IPotion register() {
		CoTPotion potion = new CoTPotion (isBadEffect, liquidColor);
		
		potion.performEffect = this.performEffect;
		potion.isReady = this.isReady;
		
		if (name == null) {
			CraftTweakerAPI.logError("Trying to register a Potion with null name! Aborting...");
		} else {
			potion.setPotionName(name);
            potion.setRegistryName(domain, name);
            ForgeRegistries.POTIONS.register(potion);
		}
		return potion.thisPotion;
	}
}
