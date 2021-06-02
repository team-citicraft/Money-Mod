package com.shadow.tbmm.core.init;

import com.shadow.tbmm.MoneyMod;
import com.shadow.tbmm.common.block.Printer;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            MoneyMod.MOD_ID);

    public static final RegistryObject<Block> PRINTER_BLOCK = BLOCKS.register("printer",
            () -> new Printer());


}