package scratchcat458.luminosity.events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceSelfMuteEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GuildVoiceMute extends ListenerAdapter {
	public void onGuildVoiceSelfMute(GuildVoiceSelfMuteEvent e) {
		EmbedBuilder mute = new EmbedBuilder();
		mute.setDescription(e.getMember().getAsMention() + " has muted themselves.");
		
		e.getGuild().getDefaultChannel().sendMessage(mute.build()).queue();
	}
}
