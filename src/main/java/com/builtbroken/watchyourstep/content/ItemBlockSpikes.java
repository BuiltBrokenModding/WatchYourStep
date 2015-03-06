package com.builtbroken.watchyourstep.content;

import com.builtbroken.mc.prefab.tile.BlockTile;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlockSpikes extends ItemBlock
{
    public ItemBlockSpikes(Block block)
    {
        super(block);
        this.setHasSubtypes(true);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b)
    {
        if(field_150939_a instanceof BlockTile)
        {
            if(((BlockTile)field_150939_a).staticTile instanceof TileSpikes)
            {
                ((TileSpikes) ((BlockTile)field_150939_a).staticTile).addInformation(stack, player, list, b);
            }
        }
    }

    @Override
    public int getMetadata(int damage)
    {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        return this.getUnlocalizedName() + "." + itemstack.getItemDamage();
    }
}
