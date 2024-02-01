package net.kuan.smod.Item;


import net.kuan.smod.SMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SMod.MODID);

    public static final RegistryObject<Item> IRON_SPOON = ITEMS.register("iron_spoon",
            ()-> new Item((new Item.Properties())));

    public static final RegistryObject<Item> WOODEN_SPOON = ITEMS.register("wooden_spoon",
            ()-> new Item((new Item.Properties())));

    public static final RegistryObject<Item> GOLDEN_SPOON = ITEMS.register("golden_spoon",
            ()-> new Item((new Item.Properties())));

    public static final RegistryObject<Item> DIAMOND_SPOON = ITEMS.register("diamond_spoon",
            ()-> new Item((new Item.Properties())));

    public static final RegistryObject<Item> KIWI_FRUITS = ITEMS.register("kiwi_fruit",
            () -> new Item(new Item.Properties().food(ModFood.KIWI_FRUIT)));


    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
