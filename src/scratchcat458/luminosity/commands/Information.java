package scratchcat458.luminosity.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import scratchcat458.luminosity.Default;

public class Information extends ListenerAdapter {
	public void onCommand(GuildMessageReceivedEvent e) {
	String args[] = e.getMessage().getContentRaw().split("\\s+");	
		if(args[0].equalsIgnoreCase(Default.prefix + "info")) {
			EmbedBuilder info = new EmbedBuilder();
			info.setTitle("Bot Information");
			info.addField("Bot Name:", "Luminosity", false);
			info.addField("Developer:", "ScratchCat458", false);
			info.addField("Hosting:", "localhost", false);
			
			e.getGuild().getDefaultChannel().sendMessage(info.build()).queue();
		}
	}
}
