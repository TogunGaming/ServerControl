package eu.togun.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

//
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.time.Duration;
import static java.time.temporal.ChronoUnit.SECONDS;

public class controlCommand extends Command {

    public controlCommand() {
        super("pufcon");
    }

    @Override
    public void execute(CommandSender commandSender, String[] args) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://admin.catnetwork.eu/api/"))
                    .timeout(Duration.of(10, SECONDS))
                    .GET()
                    .build();
        } catch (URISyntaxException err) {
            err.printStackTrace();
        }
    }
}