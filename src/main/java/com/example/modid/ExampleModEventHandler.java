package com.example.modid;

import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.event.MaterialRegistryEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Tags.MOD_ID)
public class ExampleModEventHandler {

    public static void onMaterialRegistry(MaterialRegistryEvent event) {
        GregTechAPI.materialManager.createRegistry(Tags.MOD_ID);
    }

}
