package me.sourceform.commands;

import me.sourceform.vaults.Vaults;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuHandler implements Listener {

    Vaults plugin;
    private final String VAULT_MENU = ChatColor.AQUA + "Player Vaults";

    public MenuHandler(Vaults plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player player = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(VAULT_MENU)){
            player.sendMessage("Opening Vault " + e.getCurrentItem().getItemMeta().getCustomModelData());
            player.closeInventory();
            plugin.openVault(e.getCurrentItem().getItemMeta().getCustomModelData(), player);
        }
    }
}
