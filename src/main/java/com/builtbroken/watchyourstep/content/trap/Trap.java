package com.builtbroken.watchyourstep.content.trap;

import com.builtbroken.mc.api.event.TriggerCause;
import com.builtbroken.watchyourstep.api.ITrap;
import com.builtbroken.watchyourstep.api.ITrapContainer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**
 * Object that holds information about how a trap functions
 *
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 4/28/2016.
 */
public class Trap implements ITrap
{
    public final String name;
    private ITrapContainer container;

    public Trap(String name)
    {
        this.name = name;
    }

    @Override
    public ITrapContainer getTrapContainer()
    {
        return container;
    }

    @Override
    public void setTrapContainer(ITrapContainer container)
    {
        this.container = container;
    }

    public boolean trigger(World world, int x, int y, int z, ITrapContainer container, TriggerCause cause)
    {
        return false;
    }

    @Override
    public boolean canTrigger(TriggerCause cause)
    {
        return false;
    }

    @Override
    public void load(NBTTagCompound nbt)
    {

    }

    @Override
    public NBTTagCompound save(NBTTagCompound nbt)
    {
        return nbt;
    }
}
