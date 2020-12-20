package me.naete.kit;

import me.naete.kit.command.KitCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register the command in onEnable method.
        Bukkit.getPluginCommand("kit").setExecutor(new KitCommand());

        // For future reference, you can register events like this:
        // Bukkit.getPluginManager().registerEvents(new YourEventListener(), this);
    }

}
