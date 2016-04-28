package com.builtbroken.watchyourstep.content.frame;

import net.minecraft.entity.EntityHanging;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

/**
 * Version of the item frame that can be trapped to kill players
 *
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 4/28/2016.
 */
public class ItemTrappedFrame extends Item
{
    public ItemTrappedFrame()
    {
        setHasSubtypes(true);
        setMaxStackSize(1);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        if (side == 0)
        {
            return false;
        }
        else if (side == 1)
        {
            return false;
        }
        else
        {
            int direction = Direction.facingToDirection[side];
            EntityHanging entityhanging = new EntityTrappedItemFrame(world, x, y, z, direction);

            if (!player.canPlayerEdit(x, y, z, side, stack))
            {
                return false;
            }
            else
            {
                if (entityhanging != null && entityhanging.onValidSurface())
                {
                    if (!world.isRemote)
                    {
                        world.spawnEntityInWorld(entityhanging);
                    }

                    --stack.stackSize;
                }

                return true;
            }
        }
    }
}
