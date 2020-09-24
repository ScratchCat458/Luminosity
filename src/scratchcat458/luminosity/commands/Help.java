package scratchcat458.luminosity.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import scratchcat458.luminosity.Default;

public class Help extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
		String args[] = e.getMessage().getContentRaw().split("\\s+");	
			if(args[0].equalsIgnoreCase(Default.prefix + "help") && !e.getAuthor().isBot()) {
				EmbedBuilder help = new EmbedBuilder();
				help.setTitle("Commands");
				help.setDescription("More information at scratchcat458.github.io/Luminosity");
				help.addField("Information:", "`" + Default.prefix + "info`", false);
				help.addField("Github:", "`" + Default.prefix + "github`", false);
				help.addField("Sudo:", "`" + Default.prefix + "sudo [some-random-text]`", false);
				help.addField("Bot Status:", "`" + Default.prefix + "status [arg1] [arg1]`", false);
				// help.addField("Mute:", "`" + Default.prefix + "mute`", false);
				// help.addField("Deafen:", "`" + Default.prefix + "deafen`", false);
				
				e.getGuild().getDefaultChannel().sendMessage(help.build()).queue();
			}
		}
}
