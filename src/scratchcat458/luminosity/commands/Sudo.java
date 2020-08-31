package scratchcat458.luminosity.commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import scratchcat458.luminosity.Default;

public class Sudo extends ListenerAdapter {
	public void onCommand(GuildMessageReceivedEvent e) {
		String args[] = e.getMessage().getContentRaw().split("\\s+");	
			if(args[0].equalsIgnoreCase(Default.prefix + "sudo")) {
				e.getGuild().getDefaultChannel().sendMessage(args[1].replace("-", " ")).queue();
			}
		}
}
