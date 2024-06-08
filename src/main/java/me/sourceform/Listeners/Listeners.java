package me.sourceform.Listeners;

import me.sourceform.PlayerVaults.PlayerVaults;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;


public class Listeners implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();

        PersistentDataContainer data = player.getPersistentDataContainer();

        if (!data.has(new NamespacedKey(PlayerVaults.getPlugin(), "vault1"), PersistentDataType.STRING)) {
            data.set(new NamespacedKey(PlayerVaults.getPlugin(), "vault1"), PersistentDataType.STRING, "");
        }
    }
}
