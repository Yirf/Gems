package com.developedmade.gems.Storage;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class PlayerStorage extends ConfigFile {


    public PlayerStorage(String path) {
        super(path);
    }

    public void setGems(Player p, int amount) {
        get().set(String.valueOf(p.getUniqueId()), amount);
        save();
    }

    public int getGems(OfflinePlayer p) {
        return get().getInt(p.getUniqueId().toString(), 0);
    }

    @Override
    public void onFirstLoad() {
        save();
    }
}
