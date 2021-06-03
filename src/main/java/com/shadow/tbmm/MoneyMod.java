package com.shadow.tbmm;


import com.shadow.tbmm.core.init.BlockInit;
import com.shadow.tbmm.core.init.ContainerTypesInit;
import com.shadow.tbmm.core.init.ItemInit;
import com.shadow.tbmm.core.init.TileEntityTypesInit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//testing to see if it changed over to the new thing

@Mod("tbmm")
@Mod.EventBusSubscriber(modid = MoneyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoneyMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tbmm";

    public MoneyMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
        TileEntityTypesInit.TILE_ENTITY_TYPE.register(bus);
        ContainerTypesInit.CONTAINER_TYPES.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            event.getRegistry().register(new BlockItem(block, new Item.Properties().group(MoneyMod.TAB))
                    .setRegistryName(block.getRegistryName()));
        });
    }

    public static final ItemGroup TAB = new ItemGroup("MoneyModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.ONEHUNDREDDOLLAR_ITEM.get());
        }
    };
}
