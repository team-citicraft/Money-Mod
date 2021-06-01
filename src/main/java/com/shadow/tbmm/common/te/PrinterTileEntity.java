package com.shadow.tbmm.common.te;

import com.shadow.tbmm.core.init.TileEntityTypesInit;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class PrinterTileEntity extends TileEntity {
    public PrinterTileEntity(TileEntityType<?> p_i48289_1_) {
        super(p_i48289_1_);
    }
    public PrinterTileEntity(){
        this(TileEntityTypesInit.PRINTER_TILE_ENTITY_TYPE.get());
    }
}
