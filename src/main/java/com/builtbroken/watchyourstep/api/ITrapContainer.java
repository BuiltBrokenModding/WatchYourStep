package com.builtbroken.watchyourstep.api;

import java.util.List;

/**
 * Applied to objects that act as trap containers
 *
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 4/28/2016.
 */
public interface ITrapContainer
{
    /**
     * Lists all traps contained, reguardless of settings or side
     *
     * @return list, or empty list
     */
    List<ITrap> getAllTraps();
}
