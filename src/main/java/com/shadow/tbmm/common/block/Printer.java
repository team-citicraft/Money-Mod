package com.shadow.tbmm.common.block;


import com.shadow.tbmm.core.init.TileEntityTypesInit;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;


public class Printer extends Block {
    public Printer() {
        super(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY)
                .strength(4.0F, 5F).harvestLevel(3).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()
                .sound(SoundType.METAL));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return TileEntityTypesInit.PRINTER_TILE_ENTITY_TYPE.get().create();
    }
}
