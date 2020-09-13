package scratchcat458.luminosity.events;

import java.util.Random;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GuildVoiceJoin extends ListenerAdapter {
	String[] messages = {
			"Hand them a pineapple.",
			"Rejoice!",
			"Our cover is blown.",
			"Anyway...",
			"Did they bring snacks?"
		};
	public void onGuildVoiceJoin(GuildVoiceJoinEvent e) {
		Random rand = new Random();
		int number = rand.nextInt(messages.length);
		
		EmbedBuilder join = new EmbedBuilder();
		join.setDescription(e.getMember().getAsMention() + " joined the voice channel. " + messages[number]);
		
		e.getGuild().getDefaultChannel().sendMessage(join.build()).queue();
	}
}
