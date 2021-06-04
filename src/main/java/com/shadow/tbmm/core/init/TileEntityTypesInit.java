package com.shadow.tbmm.core.init;

import com.shadow.tbmm.MoneyMod;
import com.shadow.tbmm.common.te.PrinterTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypesInit {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
            .create(ForgeRegistries.TILE_ENTITIES, MoneyMod.MOD_ID);

    public static final RegistryObject<TileEntityType<PrinterTileEntity>> PRINTER_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
            .register("printer", () -> TileEntityType.Builder.of(PrinterTileEntity::new, BlockInit.PRINTER_BLOCK.get()).build(null));

}
