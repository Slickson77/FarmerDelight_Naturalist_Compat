package net.slickson.farmerd_naturalist_compat.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
//import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.slickson.farmerd_naturalist_compat.Farmerd_naturalist_compat;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Farmerd_naturalist_compat.MOD_ID);

    public static final Supplier<CreativeModeTab> NATURALIST_DELIGHT_TAB = CREATIVE_MODE_TAB.register("naturalist_delight",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DUCK_CUTS.get()))
                    .title(Component.translatable("Naturalist Delight"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DUCK_CUTS);
                        pOutput.accept(ModItems.VENISON_STRIPS);
                        pOutput.accept(ModItems.BUSHMEAT_STRIPS);
                        pOutput.accept(ModItems.BUSHMEAT_STRIPS_COOKED);
                        pOutput.accept(ModItems.COOKED_DUCK_CUTS);
                        pOutput.accept(ModItems.BILTONG);
                        pOutput.accept(ModItems.DEER_JERKY);
                        pOutput.accept(ModItems.BUSHMEAT_STRIP_SANDWICH);
                        pOutput.accept(ModItems.BUSHSTEAK_AND_POTATOES);
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
