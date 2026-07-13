package net.slickson.farmerd_naturalist_compat.item;

import net.slickson.farmerd_naturalist_compat.Farmerd_naturalist_compat;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Farmerd_naturalist_compat.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("naturalist_delight",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DUCK_CUTS.get()))
                    .title(Component.translatable("Naturalist Delight"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DUCK_CUTS.get());
                        pOutput.accept(ModItems.VENISON_STRIPS.get());
                        pOutput.accept(ModItems.BUSHMEAT_STRIPS.get());
                        pOutput.accept(ModItems.BUSHMEAT_STRIPS_COOKED.get());
                        pOutput.accept(ModItems.COOKED_DUCK_CUTS.get());
                        pOutput.accept(ModItems.BILTONG.get());
                        pOutput.accept(ModItems.DEER_JERKY.get());
                        pOutput.accept(ModItems.BUSHMEAT_STRIP_SANDWICH.get());
                        pOutput.accept(ModItems.BUSHSTEAK_AND_POTATOES.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
