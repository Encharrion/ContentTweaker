package com.teamacronymcoders.contenttweaker.modules.vanilla.resources.sounds;

import com.teamacronymcoders.contenttweaker.api.ICTObject;
import crafttweaker.annotations.ZenRegister;
import net.minecraft.util.SoundEvent;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenRegister
@ZenClass("mods.contenttweaker.SoundEvent")
public interface ISoundEventDefinition extends ICTObject<SoundEvent> {
    @ZenMethod
    String getSoundName();

    SoundEvent getInternal();
}
