package me.sourceform.Commands;

import me.sourceform.PlayerVaults.PlayerVaults;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VaultCommand implements CommandExecutor {

    private final PlayerVaults plugin;

    public VaultCommand(PlayerVaults plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if(sender instanceof Player){
            Player player = (Player) sender;
            plugin.openVault(player);
        }
        return true;
    }
}
