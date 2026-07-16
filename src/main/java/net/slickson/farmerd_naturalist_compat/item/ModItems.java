package net.slickson.farmerd_naturalist_compat.item;

import net.slickson.farmerd_naturalist_compat.Farmerd_naturalist_compat;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    //public static final DeferredRegister<Item> ITEMS =
    //        DeferredRegister.create(ForgeRegistries.ITEMS, Farmerd_naturalist_compat.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Farmerd_naturalist_compat.MOD_ID);

    public static final DeferredItem<Item> DUCK_CUTS = ITEMS.register("duck_cuts",
            () -> new Item(new Item.Properties().food(ModFoods.DUCK_CUTS)));

    public static final DeferredItem<Item> COOKED_DUCK_CUTS = ITEMS.register("cooked_duck_cuts",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_DUCK_CUTS)));

    public static final DeferredItem<Item> BUSHMEAT_STRIPS = ITEMS.register("bushmeat_strips",
            ()-> new Item(new Item.Properties().food(ModFoods.BUSHMEAT_STRIPS)));

    public static final DeferredItem<Item> BUSHMEAT_STRIPS_COOKED = ITEMS.register("bushmeat_strips_cooked",
            ()-> new Item(new Item.Properties().food(ModFoods.BUSHMEAT_STRIPS_COOKED)));

    public static final DeferredItem<Item> BILTONG = ITEMS.register("biltong",
            ()-> new Item(new Item.Properties().food(ModFoods.BILTONG)));

    public static final DeferredItem<Item> VENISON_STRIPS = ITEMS.register("venison_strips",
            ()-> new Item(new Item.Properties().food(ModFoods.VENISON_STRIPS)));

    public static final DeferredItem<Item> DEER_JERKY = ITEMS.register("deer_jerky",
            ()-> new Item(new Item.Properties().food(ModFoods.DEER_JERKY)));

    public static final DeferredItem<Item> BUSHMEAT_STRIP_SANDWICH = ITEMS.register("bushmeat_strip_sandwich",
            ()-> new Item(new Item.Properties().food(ModFoods.BUSHMEAT_STRIP_SANDWICH)));

    public static final DeferredItem<Item> BUSHSTEAK_AND_POTATOES = ITEMS.register("bushsteak_and_potatoes",
            ()-> new Item(new Item.Properties().food(ModFoods.BUSHSTEAK_AND_POTATOES)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
