package scratchcat458.luminosity.events;

import java.util.Random;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceStreamEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GuildVoiceStream extends ListenerAdapter {
	String[] messages = {
			"Grab your popcorn.",
			"Please set your phone to silent.",
			"*Universal intro intensifies.*",
			"*Obligatory, loud THX intro intensifies*"
		};
	public void onGuildVoiceStream(GuildVoiceStreamEvent e) {
		Random rand = new Random();
		int number = rand.nextInt(messages.length);
		
		EmbedBuilder stream = new EmbedBuilder();
		stream.setDescription(e.getMember().getAsMention() + " has started streaming to the voice channel. " + messages[number]);
		
		e.getGuild().getDefaultChannel().sendMessage(stream.build()).queue();
	}
}
