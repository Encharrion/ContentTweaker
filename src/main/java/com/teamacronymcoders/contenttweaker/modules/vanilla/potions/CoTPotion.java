package com.teamacronymcoders.contenttweaker.modules.vanilla.potions;

import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.api.potions.IPotion;
import crafttweaker.mc1120.potions.MCPotion;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;

public class CoTPotion extends Potion {

	public PotionFunctions.PerformEffect performEffect = null;
	public PotionFunctions.IsReady isReady = null;
	
	public final IPotion thisPotion = new MCPotion(this);
	
	
	protected CoTPotion(boolean isBadEffectIn, int liquidColorIn) {
		super(isBadEffectIn, liquidColorIn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void performEffect(EntityLivingBase entityLivingBaseIn, int amplifier) {
		performEffect.handle(CraftTweakerMC.getIEntityLivingBase(entityLivingBaseIn), amplifier);
	}
	
	@Override
	public boolean isReady(int duration, int amplifier) {
		return isReady.handle(duration, amplifier);
	}

}
