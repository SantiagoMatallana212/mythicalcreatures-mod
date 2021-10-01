package com.github.santiagomatallana212.mythicalcreatures;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MythicalCreatures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonProxy {

    public void init() {

    }

    public void clientInit(){

    }

    public Player getClientSidePlayer() {
        return null;
    }
}
