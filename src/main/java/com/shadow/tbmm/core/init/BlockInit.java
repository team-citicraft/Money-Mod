package com.shadow.tbmm.core.init;

import com.shadow.tbmm.MoneyMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            MoneyMod.MOD_ID);

    public static final RegistryObject<Block> PRINTER_BLOCK = BLOCKS.register("printer",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY)
                    .strength(4.0F, 5F).harvestLevel(3).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));
}
