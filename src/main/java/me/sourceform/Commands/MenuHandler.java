package me.sourceform.Commands;

import me.sourceform.PlayerVaults.PlayerVaults;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuHandler implements Listener {

    private final PlayerVaults plugin;
    private final String VAULT_MENU = ChatColor.AQUA + "Player Vaults";

    public MenuHandler(PlayerVaults plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player player = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(VAULT_MENU)){
            player.sendMessage("Opening " + e.getCurrentItem().getItemMeta().getItemName());
            player.closeInventory();
            plugin.openVault(e.getCurrentItem().getItemMeta().getCustomModelData(), player);
        }
    }
}
