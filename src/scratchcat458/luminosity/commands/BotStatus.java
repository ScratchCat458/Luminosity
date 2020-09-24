package scratchcat458.luminosity.commands;

import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import scratchcat458.luminosity.Default;

public class BotStatus extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
		String args[] = e.getMessage().getContentRaw().split("\\s+");	
			if(args[0].equalsIgnoreCase(Default.prefix + "status") && !e.getAuthor().isBot()) {
				if(args[1].equalsIgnoreCase("active")) {
					if(args[2].equalsIgnoreCase("online")) {
						e.getJDA().getPresence().setStatus(OnlineStatus.ONLINE);
					}
					else if(args[2].equalsIgnoreCase("idle")) {
						e.getJDA().getPresence().setStatus(OnlineStatus.IDLE);
					}
					else if(args[2].equalsIgnoreCase("nodisturb")) {
						e.getJDA().getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
					}
					else if(args[2].equalsIgnoreCase("invisible")) {
						e.getJDA().getPresence().setStatus(OnlineStatus.INVISIBLE);
					}
					else {
						e.getGuild().getDefaultChannel().sendMessage("Invalid command. Use `" + Default.prefix + "help` to view all commands.").queue();
					}
				}
				else if(args[1].equalsIgnoreCase("playing")) {
					e.getJDA().getPresence().setActivity(Activity.playing(args[2].replaceAll("-", " ")));
				}
				else if(args[1].equalsIgnoreCase("watching")) {
					e.getJDA().getPresence().setActivity(Activity.watching(args[2].replaceAll("-", " ")));
				}
				else if(args[1].equalsIgnoreCase("listening")) {
					e.getJDA().getPresence().setActivity(Activity.listening(args[2].replaceAll("-", " ")));
				}
				else {
					e.getGuild().getDefaultChannel().sendMessage("Invalid command. Use `" + Default.prefix + "help` to view all commands.").queue();
				}
			}
		}
}
