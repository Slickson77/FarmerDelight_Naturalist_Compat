package net.slickson.farmerd_naturalist_compat;

import net.minecraft.world.item.CreativeModeTabs;
import net.slickson.farmerd_naturalist_compat.item.ModCreativeModTabs;
import net.slickson.farmerd_naturalist_compat.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
//import vectorwing.farmersdelight.common.registry.ModEffects;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Farmerd_naturalist_compat.MOD_ID)
public class Farmerd_naturalist_compat {
    public static final String MOD_ID = "farmerd_naturalist_compat";
    //public static final Logger LOGGER = LogUtils.getLogger();

    public Farmerd_naturalist_compat(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            /*
            event.accept(ModItems.DUCK_CUTS);
            event.accept(ModItems.COOKED_DUCK_CUTS);
            event.accept(ModItems.BUSHMEAT_STRIPS_COOKED);
            event.accept(ModItems.BILTONG);
            event.accept(ModItems.VENISON_STRIPS);
            event.accept(ModItems.DEER_JERKY);
            event.accept(ModItems.BUSHSTEAK_AND_POTATOES);
             */
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    //@EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    //public static class ClientModEvents {
        //@SubscribeEvent
        //public static void onClientSetup(FMLClientSetupEvent event) {

        //}
    //}
}
