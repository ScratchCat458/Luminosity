package scratchcat458.luminosity.events;

import java.util.Random;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GuildMemberLeave extends ListenerAdapter {
	String[] messages = {
			"We now have the big sad.",
			"Where did we go wrong?",
			"potato"
		};
	public void onGuildMemberRemove(GuildMemberRemoveEvent e) {
		Random rand = new Random();
		int number = rand.nextInt(messages.length);
		
		EmbedBuilder leave = new EmbedBuilder();
		leave.setDescription("Someone left. " + messages[number]);
		
		e.getGuild().getDefaultChannel().sendMessage(leave.build()).queue();
	}
}
