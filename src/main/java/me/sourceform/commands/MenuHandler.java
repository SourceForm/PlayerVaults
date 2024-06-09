package me.sourceform.commands;

import me.sourceform.vaults.Vaults;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuHandler implements Listener {

    Vaults plugin;
    private final String VAULT_MENU = ChatColor.AQUA + "Main Menu";

    public MenuHandler(Vaults plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player player = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(VAULT_MENU)){
            player.closeInventory();
            plugin.openVaultMenu(e.getCurrentItem().getItemMeta().getCustomModelData(), player);
        }
    }
}
