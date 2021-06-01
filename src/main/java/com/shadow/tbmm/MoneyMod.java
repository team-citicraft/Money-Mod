package com.shadow.tbmm;


import com.shadow.tbmm.core.init.BlockInit;
import com.shadow.tbmm.core.init.ItemInit;
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


@Mod("tbmm")
public class MoneyMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tbmm";

    public MoneyMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(MoneyMod.TAB))
                    .setRegistryName(block.getRegistryName()));
        });
    }

    public static final ItemGroup TAB = new ItemGroup("MoneyModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.ONEHUNDREDDOLLAR_ITEM.get());
        }
    };
}
