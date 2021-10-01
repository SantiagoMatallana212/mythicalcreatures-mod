package com.github.santiagomatallana212.mythicalcreatures;

import com.github.santiagomatallana212.mythicalcreatures.client.renderer.RenderBoar;
import com.github.santiagomatallana212.mythicalcreatures.client.renderer.RenderCentaur;
import com.github.santiagomatallana212.mythicalcreatures.client.renderer.RenderMinotaur;
import com.github.santiagomatallana212.mythicalcreatures.client.renderer.RenderOrc;
import com.github.santiagomatallana212.mythicalcreatures.entity.MCEntityRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = MythicalCreatures.MOD_ID, value = Dist.CLIENT)
public class ClientProxy extends CommonProxy {

    public void init() {

    }

    public void clientInit() {
        EntityRenderers.register(MCEntityRegistry.ORC, RenderOrc::new);
        EntityRenderers.register(MCEntityRegistry.BOAR, RenderBoar::new);
        EntityRenderers.register(MCEntityRegistry.MINOTAUR, RenderMinotaur::new);
        EntityRenderers.register(MCEntityRegistry.CENTAUR, RenderCentaur::new);
    }

    public Player getClientSidePlayer() {
        return Minecraft.getInstance().player;
    }
}
