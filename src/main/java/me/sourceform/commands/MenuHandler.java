package me.sourceform.commands;

import me.sourceform.playervaults.PlayerVaults;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuHandler implements Listener {

    PlayerVaults plugin;

    public MenuHandler(PlayerVaults plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player player = (Player) e.getWhoClicked();
        final String VAULT_MENU = ChatColor.AQUA + "Player Vaults";
        if(e.getView().getTitle().equalsIgnoreCase(VAULT_MENU)){
            switch(e.getCurrentItem().getType()){
                case DIAMOND_BLOCK:
                    player.sendMessage("Opening Vault One");
                    player.closeInventory();
                    plugin.openVault1(player);
                    break;
                case GOLD_BLOCK:
                    player.sendMessage("Opening Vault Two");
                    player.closeInventory();
                    plugin.openVault2(player);
            }
        }
    }
}
