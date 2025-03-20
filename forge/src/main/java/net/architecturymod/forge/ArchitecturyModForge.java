package net.architecturymod.forge;

import dev.architectury.platform.forge.EventBuses;
import net.architecturymod.ArchitecturyMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ArchitecturyMod.MOD_ID)
public class ArchitecturyModForge {
    public ArchitecturyModForge(FMLJavaModLoadingContext context) {
        EventBuses.registerModEventBus(ArchitecturyMod.MOD_ID, context.getModEventBus());
        ArchitecturyMod.init();
    }
}
