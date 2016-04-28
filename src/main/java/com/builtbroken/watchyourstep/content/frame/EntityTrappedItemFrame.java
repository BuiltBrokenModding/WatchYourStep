package com.builtbroken.watchyourstep.content.frame;

import com.builtbroken.watchyourstep.api.ITrap;
import com.builtbroken.watchyourstep.api.ITrapContainer;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

/**
 * Trapped version of {@link EntityItemFrame}
 *
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 4/28/2016.
 */
public class EntityTrappedItemFrame extends EntityItemFrame implements ITrapContainer
{
    private final List<ITrap> traps = new ArrayList();

    public EntityTrappedItemFrame(World world)
    {
        super(world);
    }

    public EntityTrappedItemFrame(World world, int x, int y, int z, int direction)
    {
        super(world, x, y, z, direction);
    }

    @Override
    public boolean interactFirst(EntityPlayer player)
    {
        //TODO shift + right click to open trap menu, only for owner
        return super.interactFirst(player);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nbt)
    {
        super.writeEntityToNBT(nbt);
        //TODO save owner
        //TODO save traps
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nbt)
    {
        super.readEntityFromNBT(nbt);
    }

    @Override
    public List<ITrap> getAllTraps()
    {
        return traps;
    }
}
