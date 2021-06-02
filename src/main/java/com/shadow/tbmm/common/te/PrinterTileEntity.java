package com.shadow.tbmm.common.te;

import com.shadow.tbmm.core.init.TileEntityTypesInit;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.NonNullList;

public class PrinterTileEntity extends TileEntity{ //extends LockableLootTileEntity {

    public static int slots = 1;

    protected NonNullList<ItemStack> items = NonNullList.withSize(slots, ItemStack.EMPTY);

    public PrinterTileEntity(TileEntityType<?> p_i48289_1_) {
        super(p_i48289_1_);
    }

    public PrinterTileEntity(){
        this(TileEntityTypesInit.PRINTER_TILE_ENTITY_TYPE.get());
    }

    /*@Override
    public int getSizeInventory() {
        return slots;
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> itemsIn) {
        this.items = itemsIn;
    }

    @Override
    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container." + MoneyMod.MOD_ID + ".printer");
    }

    @Override
    protected Container createMenu(int id, PlayerInventory player) {
        return new PrinterContainer(id, player, this);
    }

    @Override
    public CompoundNBT write(CompoundNBT compound){
        super.write(compound);
        if(!this.checkLootAndWrite(compound)) {
            ItemStackHelper.saveAllItems(compound, this.items);
        }
        return compound;
    }

    @Override
    public void read(BlockState state, CompoundNBT nbt) {
        super.read(state, nbt);
        this.items = NonNullList.withSize(getSizeInventory(), ItemStack.EMPTY);
        if(!this.checkLootAndRead(nbt)){
            ItemStackHelper.loadAllItems(nbt, this.items);
        }
    }*/
}
