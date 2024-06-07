package com.developedmade.gems;

import com.developedmade.gems.API.GemsExpansion;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Gems extends JavaPlugin implements Listener {

    public static final Logger log = Bukkit.getLogger();

    public static final PluginManager pm = Bukkit.getPluginManager();

    public static Gems instance;

    @Override
    public void onEnable() {
        instance = this;
        if(Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            new GemsExpansion(this).register();
        } else {
            log.severe("Could not find PlaceholderAPI! This plugin is required.");
            Bukkit.getPluginManager().disablePlugin(this);
        }

    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
