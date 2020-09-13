package scratchcat458.luminosity.events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceSelfDeafenEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GuildVoiceDeafen extends ListenerAdapter {
	public void onGuildVoiceSelfDeafen(GuildVoiceSelfDeafenEvent e) {
		EmbedBuilder deafen = new EmbedBuilder();
		deafen.setDescription(e.getMember().getAsMention() + " has deafened themselves.");
		
		e.getGuild().getDefaultChannel().sendMessage(deafen.build()).queue();
	}
}
