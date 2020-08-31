package scratchcat458.luminosity.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import scratchcat458.luminosity.Default;

public class Help extends ListenerAdapter {
	public void onCommand(GuildMessageReceivedEvent e) {
		String args[] = e.getMessage().getContentRaw().split("\\s+");	
			if(args[0].equalsIgnoreCase(Default.prefix + "help")) {
				EmbedBuilder help = new EmbedBuilder();
				help.setTitle("Commands");
				help.addField("Information:", "`" + Default.prefix + "info`", false);
				help.addField("Sudo:", "`" + Default.prefix + "sudo [some-random-text]`", false);
				help.addField("Bot Status:", "`" + Default.prefix + "status [type] [status|some-random-text]`", false);
				
				e.getGuild().getDefaultChannel().sendMessage(help.build()).queue();
			}
		}
}
