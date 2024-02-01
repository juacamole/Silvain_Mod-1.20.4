package net.kuan.smod.Item;

import net.kuan.smod.SMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SMod.MODID);

    public static final RegistryObject<CreativeModeTab> SILVAIN_TAB = CREATIVE_MODE_TABS.register("silvain_items_tab",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.IRON_SPOON.get()))
                    .title(Component.translatable("creativetab.silvain_items_tab"))
                    .displayItems(((p_270258_, p_259752_) -> {
                        p_259752_.accept(ModItems.WOODEN_SPOON.get());
                        p_259752_.accept(ModItems.GOLDEN_SPOON.get());
                        p_259752_.accept(ModItems.IRON_SPOON.get());
                        p_259752_.accept(ModItems.DIAMOND_SPOON.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
