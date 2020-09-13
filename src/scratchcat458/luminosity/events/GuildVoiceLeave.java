package scratchcat458.luminosity.events;

import java.util.Random;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceLeaveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GuildVoiceLeave extends ListenerAdapter {
	String[] messages = {
			"Return to duty at once.",
			"They stole ***b u r g e r***.",
			"The secrets are safe.",
			"Hope they come back soon."
		};
	public void onGuildVoiceLeave(GuildVoiceLeaveEvent e) {
		Random rand = new Random();
		int number = rand.nextInt(messages.length);
		
		EmbedBuilder leave = new EmbedBuilder();
		leave.setDescription(e.getMember().getAsMention() + " left the voice channel. " + messages[number]);
		
		e.getGuild().getDefaultChannel().sendMessage(leave.build()).queue();
	}
}
