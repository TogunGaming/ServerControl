package eu.togun;

import eu.togun.commands.pingCommand;
import eu.togun.commands.controlCommand;
import net.md_5.bungee.api.plugin.Plugin;

public final class serverControl extends Plugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
            getProxy().getPluginManager().registerCommand(this, new pingCommand());
            getProxy().getPluginManager().registerCommand(this, new controlCommand());
            getLogger().info("Plugin Loaded");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
