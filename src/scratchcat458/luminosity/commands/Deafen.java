package scratchcat458.luminosity.commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import scratchcat458.luminosity.Default;

public class Deafen extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String args[] = e.getMessage().getContentRaw().split("\\s+");
        if(args[0].equalsIgnoreCase(Default.prefix + "deafen") && !e.getAuthor().isBot()) {
            e.getMember().deafen(true);
        }
    }
}
