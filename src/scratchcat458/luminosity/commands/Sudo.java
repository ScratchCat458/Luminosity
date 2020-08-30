package scratchcat458.luminosity.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import scratchcat458.luminosity.Default;

public class Sudo extends ListenerAdapter {
	public void onCommand(GuildMessageReceivedEvent e) {
		String args[] = e.getMessage().getContentRaw().split("\\s+");	
			if(args[0].equalsIgnoreCase(Default.prefix + "info")) {
				EmbedBuilder help = new EmbedBuilder();
				help.setTitle("Command Help");
				help.setDescription("All Luminosity commands and their usage.");
				help.addField("Bot Name:", "Luminosity", false);
				help.addField("Developer:", "ScratchCat458", false);
				help.addField("Hosting:", "localhost", false);
				
				e.getGuild().getDefaultChannel().sendMessage(help.build()).queue();
			}
		}
}
