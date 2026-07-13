package net.slickson.farmerd_naturalist_compat.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.FoodValues.MEDIUM_DURATION;

public class ModFoods {
    public static final FoodProperties DUCK_CUTS = (new FoodProperties.Builder())
            .nutrition(1).saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).meat().fast().build();

    public static final FoodProperties BUSHMEAT_STRIPS = (new FoodProperties.Builder())
            .nutrition(1).saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).meat().fast().build();

    public static final FoodProperties VENISON_STRIPS = (new FoodProperties.Builder())
            .nutrition(1).saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).meat().fast().build();

    public static final FoodProperties COOKED_DUCK_CUTS = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.6f).meat().fast().build();

    public static final FoodProperties BUSHSTEAK_AND_POTATOES = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();

    public static final FoodProperties BUSHMEAT_STRIPS_COOKED = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.8f).meat().fast().build();

    public static final FoodProperties BUSHMEAT_STRIP_SANDWICH = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.8f).build();

    public static final FoodProperties BILTONG = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.8f).meat().fast().build();

    public static final FoodProperties DEER_JERKY = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.8f).meat().fast().build();
}
