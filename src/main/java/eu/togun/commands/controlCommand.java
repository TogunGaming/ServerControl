package eu.togun.commands;

// Message Sender Dependencies
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

// Http Request Libraries
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.time.Duration;
import static java.time.temporal.ChronoUnit.SECONDS;

public class controlCommand extends Command {

    public controlCommand() {
        super("pservers");
    }

    @Override
    public void execute(CommandSender commandSender, String[] args) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://admin.catnetwork.eu/api/servers"))
                    .timeout(Duration.of(10, SECONDS))
                    .GET()
                    .build();
                    int output = .output();
        } catch (URISyntaxException err) {
            err.printStackTrace();
        }

        if (commandSender instanceof ProxiedPlayer) {
            ProxiedPlayer player = (ProxiedPlayer) commandSender;

            player.sendMessage(new TextComponent(ChatColor.GRAY + "Server List: " + ChatColor.GREEN + output));
        }
    }
}