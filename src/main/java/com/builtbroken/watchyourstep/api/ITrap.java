package com.builtbroken.watchyourstep.api;

import com.builtbroken.mc.api.ISave;
import com.builtbroken.mc.api.event.TriggerCause;
import net.minecraft.world.World;

/**
 * Instance of a trap contained in an {@link ITrapContainer}
 *
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 4/28/2016.
 */
public interface ITrap extends ISave
{
    /**
     * Called to get the container of the trap
     *
     * @return - container
     */
    ITrapContainer getTrapContainer();

    /**
     * Called to set the trap's container
     *
     * @param container - container
     */
    void setTrapContainer(ITrapContainer container);

    /**
     * Called to trigger the trap
     *
     * @param world     - world triggered in
     * @param x         - location
     * @param y         - location
     * @param z         - location
     * @param container - contain holding the trap, ensure you check if its a tile, entity, or item
     * @param cause     - what trigger the trap
     * @return true if the trap was triggered
     */
    boolean trigger(World world, int x, int y, int z, ITrapContainer container, TriggerCause cause);

    /**
     * Can this trigger cause trigger the trap
     *
     * @param cause - cause of the trap trigger
     * @return true if it can trigger
     */
    boolean canTrigger(TriggerCause cause);
}
