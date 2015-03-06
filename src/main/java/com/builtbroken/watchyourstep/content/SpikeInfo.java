package com.builtbroken.watchyourstep.content;

import com.builtbroken.mc.core.content.damage.DamageSources;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;

/**
 * Created by robert on 3/5/2015.
 */
public class SpikeInfo
{
    private float damage = 1;
    private DamageSource source;
    private Potion potion;

    public SpikeInfo(float damage)
    {
        this.damage = damage;
    }

    public float damage()
    {
        return damage;
    }
}
