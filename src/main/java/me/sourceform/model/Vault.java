package me.sourceform.model;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Vault {
    private final ItemStack vault;
    private final int vaultId;

    public Vault(Material material, ChatColor vaultColor, int vaultId) {
        // Initialize vault
        this.vault = new ItemStack(new ItemStack(material));
        this.vaultId = vaultId;

        // Set vault meta
        ItemMeta vaultMeta = vault.getItemMeta();
        vaultMeta.setDisplayName(vaultColor + "Vault " + vaultId);
        vaultMeta.setCustomModelData(vaultId);
        this.vault.setItemMeta(vaultMeta);
    }

    public ItemStack getVault() {
        return vault;
    }

    public int getVaultId() {
        return vaultId;
    }
}
