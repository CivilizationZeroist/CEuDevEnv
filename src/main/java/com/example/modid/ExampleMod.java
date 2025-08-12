package com.example.modid;

import com.example.modid.Tags;
import com.example.modid.api.utils.ExampleModLog;
import com.example.modid.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import gregtech.GTInternalTags;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION, dependencies = GTInternalTags.DEP_VERSION_STRING)
public class ExampleMod {

    @SidedProxy(
            clientSide = "com.example.modid.client.ClientProxy",
            serverSide = "com.example.modid.common.CommonProxy"
    )
    private static CommonProxy proxy;

    /**
     * <a href="https://cleanroommc.com/wiki/forge-mod-development/event#overview">
     *     Take a look at how many FMLStateEvents you can listen to via the @Mod.EventHandler annotation here
     * </a>
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ExampleModLog.LOGGER.info("Hello From {}!", Tags.MOD_NAME);
    }

}
