package scratchcat458.luminosity;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import scratchcat458.luminosity.commands.*;
import scratchcat458.luminosity.events.*;

public class Luminosity {
	public static void main(String[] args) throws LoginException {
		JDA jda = JDABuilder.createDefault(Default.token).build();
		jda.getPresence().setStatus(OnlineStatus.IDLE);
		jda.getPresence().setActivity(Activity.playing(Default.activity));
		
		// Commands
		jda.addEventListener(new Information());

		// Events
		jda.addEventListener(new GuildMemberJoin());
		jda.addEventListener(new GuildMemberLeave());
		jda.addEventListener(new GuildVoiceJoin());
		jda.addEventListener(new GuildVoiceLeave());
		jda.addEventListener(new GuildVoiceMute());
		jda.addEventListener(new GuildVoiceDeafen());
		jda.addEventListener(new GuildVoiceStream());
	}
	
}
