package scratchcat458.luminosity.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import scratchcat458.luminosity.Default;

public class Github extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String args[] = e.getMessage().getContentRaw().split("\\s+");
        if(args[0].equalsIgnoreCase(Default.prefix + "github")) {
            EmbedBuilder github = new EmbedBuilder();
            github.setTitle("Github Information");
            github.addField("Repository Name:", "Luminosity", false);
            github.addField("Developer:", "ScratchCat458", false);
            github.addField("Repository Location:", "github.com/ScratchCat458/Luminosity", false);
            github.addField("Documentation Location:", "scratchcat458.github.com/Luminosity", false);

            e.getGuild().getDefaultChannel().sendMessage(github.build()).queue();
        }
    }
}
