package net.architecturymod.fabric;

import net.fabricmc.api.ModInitializer;
import net.architecturymod.ArchitecturyMod;

public class ArchitecturyModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ArchitecturyMod.init();
    }
}
