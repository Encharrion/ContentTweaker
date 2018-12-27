package com.teamacronymcoders.contenttweaker.modules.vanilla.potions;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.entity.IEntityLivingBase;
import stanhebben.zenscript.annotations.ZenClass;

public final class PotionFunctions {

	@ZenClass("mods.contenttweaker.potions.PerformEffect")
	@ZenRegister
	public interface PerformEffect {
		void handle(IEntityLivingBase entityLivingBaseIn, int amplifier);
	}
	
	@ZenClass("mods.contenttweaker.potions.IsReady")
	@ZenRegister
	public interface IsReady {
		boolean handle(int duration, int amplifier);
	}
	
	
}
