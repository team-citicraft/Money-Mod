package com.shadow.tbmm.core.init;

import com.shadow.tbmm.MoneyMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoneyMod.MOD_ID);

    public static final RegistryObject<Item> ONEDOLLAR_ITEM = ITEMS.register("onedollar",
            () -> new Item(new Item.Properties().group(MoneyMod.TAB)));
    public static final RegistryObject<Item> TWODOLLAR_ITEM = ITEMS.register("twodollar",
            () -> new Item(new Item.Properties().group(MoneyMod.TAB)));
    public static final RegistryObject<Item> FIVEDOLLAR_ITEM = ITEMS.register("fivedollar",
            () -> new Item(new Item.Properties().group(MoneyMod.TAB)));
    public static final RegistryObject<Item> TENDOLLARITEM = ITEMS.register("tendollar",
            () -> new Item(new Item.Properties().group(MoneyMod.TAB)));
    public static final RegistryObject<Item> TWENTYDOLLARITEM = ITEMS.register("twentydollar",
            () -> new Item(new Item.Properties().group(MoneyMod.TAB)));
    public static final RegistryObject<Item> FIFTYDOLLAR_ITEM = ITEMS.register("fiftydollar",
            () -> new Item(new Item.Properties().group(MoneyMod.TAB)));
    public static final RegistryObject<Item> ONEHUNDREDDOLLAR_ITEM = ITEMS.register("onehundreddollar",
            () -> new Item(new Item.Properties().group(MoneyMod.TAB)));
}
