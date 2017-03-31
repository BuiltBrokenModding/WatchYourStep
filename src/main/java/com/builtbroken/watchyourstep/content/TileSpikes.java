package com.builtbroken.watchyourstep.content;

import com.builtbroken.mc.lib.helper.LanguageUtility;
import com.builtbroken.mc.imp.transform.region.Cube;
import com.builtbroken.mc.prefab.tile.Tile;
import com.builtbroken.watchyourstep.WatchYourStep;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

import java.util.ArrayList;
import java.util.List;

/** Abstract spike that is used to create new spike blocks
 * Created by robert on 3/5/2015.
 */
public abstract class TileSpikes extends Tile
{
    public static DamageSource spikes = new DamageSource("spikes");

    public TileSpikes(Material material)
    {
        super("spikes", material);
        this.itemBlock = ItemBlockSpikes.class;
    }

    ///Block Method
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b)
    {
        list.add(LanguageUtility.getLocalName("tile." + WatchYourStep.PREFIX + "spikes" +".info.damage") + ": " + getDamage(stack));
    }

    public float getDamage(ItemStack stack)
    {
        return 1;
    }

    @Override
    public Iterable<Cube> getCollisionBoxes(Cube intersect, Entity entity)
    {
        //We want everything to be able to walk threw the spikes
        return new ArrayList();
    }

    @Override
    public void onCollide(Entity entity)
    {
        entity.attackEntityFrom(spikes, 1);
    }
}
