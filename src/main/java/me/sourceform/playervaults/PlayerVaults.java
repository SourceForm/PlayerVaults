package me.sourceform.playervaults;

import me.sourceform.commands.MenuHandler;
import me.sourceform.commands.VaultCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerVaults extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        getCommand("playervault").setExecutor(new VaultCommand(this));
        getServer().getPluginManager().registerEvents(new MenuHandler(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        saveConfig();
    }

    public void openVault(Player player){
        Inventory vault_menu = Bukkit.createInventory(player, 9, ChatColor.AQUA + "Player Vaults");
        ItemStack vault1 = new ItemStack(Material.DIAMOND_BLOCK);
        ItemStack vault2 = new ItemStack(Material.GOLD_BLOCK);
        ItemStack vault3 = new ItemStack(Material.EMERALD_BLOCK);
        ItemStack vault4 = new ItemStack(Material.IRON_BLOCK);
        ItemStack vault5 = new ItemStack(Material.REDSTONE_BLOCK);
        ItemStack vault6 = new ItemStack(Material.LAPIS_BLOCK);
        ItemStack vault7 = new ItemStack(Material.COPPER_BLOCK);
        ItemStack vault8 = new ItemStack(Material.BEACON);
        ItemStack vault9 = new ItemStack(Material.END_CRYSTAL);
        ItemMeta vault1_meta = vault1.getItemMeta();
        ItemMeta vault2_meta = vault1.getItemMeta();
        ItemMeta vault3_meta = vault1.getItemMeta();
        ItemMeta vault4_meta = vault1.getItemMeta();
        ItemMeta vault5_meta = vault1.getItemMeta();
        ItemMeta vault6_meta = vault1.getItemMeta();
        ItemMeta vault7_meta = vault1.getItemMeta();
        ItemMeta vault8_meta = vault1.getItemMeta();
        ItemMeta vault9_meta = vault1.getItemMeta();
        vault1_meta.setDisplayName(ChatColor.DARK_GREEN + "Vault 1");
        vault2_meta.setDisplayName(ChatColor.DARK_GREEN + "Vault 2");
        vault3_meta.setDisplayName(ChatColor.DARK_GREEN + "Vault 3");
        vault4_meta.setDisplayName(ChatColor.DARK_GREEN + "Vault 4");
        vault5_meta.setDisplayName(ChatColor.DARK_GREEN + "Vault 5");
        vault6_meta.setDisplayName(ChatColor.DARK_GREEN + "Vault 6");
        vault7_meta.setDisplayName(ChatColor.DARK_GREEN + "Vault 7");
        vault8_meta.setDisplayName(ChatColor.DARK_GREEN + "Vault 8");
        vault9_meta.setDisplayName(ChatColor.DARK_GREEN + "Vault 9");
        vault1.setItemMeta(vault1_meta);
        vault2.setItemMeta(vault1_meta);
        vault3.setItemMeta(vault1_meta);
        vault4.setItemMeta(vault1_meta);
        vault5.setItemMeta(vault1_meta);
        vault6.setItemMeta(vault1_meta);
        vault7.setItemMeta(vault1_meta);
        vault8.setItemMeta(vault1_meta);
        vault9.setItemMeta(vault1_meta);

        vault_menu.setItem(0, vault1);
        vault_menu.setItem(1, vault2);
        vault_menu.setItem(2, vault3);
        vault_menu.setItem(3, vault4);
        vault_menu.setItem(4, vault5);
        vault_menu.setItem(5, vault6);
        vault_menu.setItem(6, vault7);
        vault_menu.setItem(7, vault8);
        vault_menu.setItem(8, vault9);

        player.openInventory(vault_menu);
    }
    public void openVault1(Player player){
        Inventory vault1_menu = Bukkit.createInventory(player, 45, ChatColor.AQUA + "Vault 1");
    }
    public void openVault2(Player player){
        Inventory vault2_menu = Bukkit.createInventory(player, 45, ChatColor.AQUA + "Vault 2");
    }
}
