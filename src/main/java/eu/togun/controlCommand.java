package eu.togun;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class controlCommand extends Command {

    public controlCommand() {
        super("control");
    }

    @Override
    public void execute(CommandSender commandSender, String args) {
        String nodes = ("nodes");
        String servers = ("servers");
        String server_stop = ("server" + serverid + " stop");
        // nodes
        if (args == nodes) {
            if (commandSender instanceof ProxiedPlayer) {
              ProxiedPlayer player = (ProxiedPlayer) commandSender;
              int nodes_content = player.getPing();

                player.sendMessage(new TextComponent(ChatColor.GRAY + "Your ping is: " + ChatColor.GREEN + nodes_content));
            }
        } else {
                // servers
            if (args == servers) {
                if (commandSender instanceof ProxiedPlayer) {
                    ProxiedPlayer player = (ProxiedPlayer) commandSender;
                    int servers_content = player.getPing();

                    player.sendMessage(new TextComponent(ChatColor.GRAY + "Servers: " + ChatColor.GREEN + servers_content));
                }
            } else {
                // server_stop
                if (args == server_stop) {
                    if (commandSender instanceof ProxiedPlayer) {
                        ProxiedPlayer player = (ProxiedPlayer) commandSender;
                        int server_shutdown_sel = player.getPing();

                        player.sendMessage(new TextComponent(ChatColor.GRAY + "Shutting down " + server_shutdown_sel + "..."));
                    }
                } else {
                    // nodes
                    if (args == nodes) {
                        if (commandSender instanceof ProxiedPlayer) {
                            ProxiedPlayer player = (ProxiedPlayer) commandSender;
                            int ping = player.getPing();

                            player.sendMessage(new TextComponent(ChatColor.GRAY + "Your ping is: " + ChatColor.GREEN + ping));
                        }
                    } else {

                    }
                }
            }
        }
    }
}
