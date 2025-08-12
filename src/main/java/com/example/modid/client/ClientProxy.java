package com.example.modid.client;

import com.example.modid.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.CLIENT)
public class ClientProxy extends CommonProxy {

    public ClientProxy() {}

}
