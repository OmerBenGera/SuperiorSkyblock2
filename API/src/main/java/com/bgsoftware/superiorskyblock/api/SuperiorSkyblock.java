package com.bgsoftware.superiorskyblock.api;

import com.bgsoftware.superiorskyblock.api.handlers.BlockValuesManager;
import com.bgsoftware.superiorskyblock.api.handlers.CommandsManager;
import com.bgsoftware.superiorskyblock.api.handlers.FactoriesManager;
import com.bgsoftware.superiorskyblock.api.handlers.GridManager;
import com.bgsoftware.superiorskyblock.api.handlers.KeysManager;
import com.bgsoftware.superiorskyblock.api.handlers.MenusManager;
import com.bgsoftware.superiorskyblock.api.handlers.MissionsManager;
import com.bgsoftware.superiorskyblock.api.handlers.ModulesManager;
import com.bgsoftware.superiorskyblock.api.handlers.PlayersManager;
import com.bgsoftware.superiorskyblock.api.handlers.ProvidersManager;
import com.bgsoftware.superiorskyblock.api.handlers.SchematicManager;
import com.bgsoftware.superiorskyblock.api.handlers.UpgradesManager;
import com.bgsoftware.superiorskyblock.api.scripts.IScriptEngine;

import javax.annotation.Nullable;

public interface SuperiorSkyblock {

    /**
     * Get the grid of the core.
     */
    GridManager getGrid();

    /**
     * Get the blocks manager of the core.
     */
    BlockValuesManager getBlockValues();

    /**
     * Get the schematics manager of the core.
     */
    SchematicManager getSchematics();

    /**
     * Get the players manager of the core.
     */
    PlayersManager getPlayers();

    /**
     * Get the missions manager of the core.
     */
    MissionsManager getMissions();

    /**
     * Get the menus manager of the core.
     */
    MenusManager getMenus();

    /**
     * Get the keys manager of the core.
     */
    KeysManager getKeys();

    /**
     * Get the providers manager of the core.
     */
    ProvidersManager getProviders();

    /**
     * Get the upgrades manager of the core.
     */
    UpgradesManager getUpgrades();

    /**
     * Get the commands manager of the core.
     */
    CommandsManager getCommands();

    /**
     * Get the objects factory of the plugin.
     */
    FactoriesManager getFactory();

    /**
     * Get the modules manager of the plugin.
     */
    ModulesManager getModules();

    /**
     * Get the script engine of the plugin.
     */
    IScriptEngine getScriptEngine();

    /**
     * Set the script engine of the plugin.
     * @param scriptEngine The script engine to set.
     *                     When null, the default java script engine will be set instead.
     */
    void setScriptEngine(@Nullable IScriptEngine scriptEngine);

}
