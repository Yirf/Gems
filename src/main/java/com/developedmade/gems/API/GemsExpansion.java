package com.developedmade.gems.API;

import com.developedmade.gems.Gems;
import com.developedmade.gems.Storage.PlayerStorage;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

public class GemsExpansion extends PlaceholderExpansion {
    public static final PlayerStorage storage = new PlayerStorage("data.yml");

    private final Gems plugin;
    public GemsExpansion(Gems plugin) {
        this.plugin = plugin;
    }

    @Override
    public String getAuthor() {
        return "Yirf";
    }
    @Override
    public String getIdentifier() {
        return "gems";
    }
    @Override
    public String getVersion() {
        return "1.0.0";
    }
    @Override
    public boolean persist() {
        return true; // This is required or else PlaceholderAPI will unregister the Expansion on reload
    }

    @Override
    public @Nullable String onRequest(OfflinePlayer player, String params) {
        if(params.equalsIgnoreCase("balance")) {
            return "" + storage.getGems(player);
        }
        return null;
    }
}