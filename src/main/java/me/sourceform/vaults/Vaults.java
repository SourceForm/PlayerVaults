package me.sourceform.vaults;

import me.sourceform.commands.MenuHandler;
import me.sourceform.commands.VaultCommand;
import me.sourceform.model.Vault;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vaults extends JavaPlugin {

    private static Vaults plugin;

    public static Vaults getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        getCommand("playervault").setExecutor(new VaultCommand(this));
        getServer().getPluginManager().registerEvents(new MenuHandler(this), this);
        plugin = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        saveConfig();
    }

    public void openVault(Player player){
        Inventory vault_menu = Bukkit.createInventory(player, 9, ChatColor.AQUA + "Player Vaults");

        // Create vaults
        Vault[] vaults = {
            new Vault(Material.DIAMOND_BLOCK, ChatColor.DARK_GREEN, 1),
            new Vault(Material.GOLD_BLOCK, ChatColor.DARK_GREEN, 2),
            new Vault(Material.EMERALD_BLOCK, ChatColor.DARK_GREEN, 3),
            new Vault(Material.IRON_BLOCK, ChatColor.DARK_GREEN, 4),
            new Vault(Material.REDSTONE_BLOCK, ChatColor.DARK_GREEN, 5),
            new Vault(Material.LAPIS_BLOCK, ChatColor.DARK_GREEN, 6),
            new Vault(Material.COPPER_BLOCK, ChatColor.DARK_GREEN, 7),
            new Vault(Material.BEACON, ChatColor.DARK_GREEN, 8),
            new Vault(Material.END_CRYSTAL, ChatColor.DARK_GREEN, 9),
        };

        // Add vaults to menu
        for (int i = 0; i < vaults.length; i++) {
            vault_menu.setItem(i, vaults[i].getVault());
        }

        player.openInventory(vault_menu);
    }
    public void openVault(int vaultId, Player player) {
        Inventory storageVault = Bukkit.createInventory(player, 45, ChatColor.AQUA + "Vault " + vaultId);
        player.openInventory(storageVault);
    }
}
