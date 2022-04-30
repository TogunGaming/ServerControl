package eu.togun.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class pingCommand extends Command {

    public pingCommand() {
        super("ping");
    }

    @Override
    public void execute(CommandSender commandSender, String[] args) {
        if (commandSender instanceof ProxiedPlayer) {
            ProxiedPlayer player = (ProxiedPlayer) commandSender;
            int ping = player.getPing();

            player.sendMessage(new TextComponent(ChatColor.GRAY + "Your ping is: " + ChatColor.GREEN + ping));
        }
    }
}