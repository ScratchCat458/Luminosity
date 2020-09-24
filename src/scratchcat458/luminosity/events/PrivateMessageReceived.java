package scratchcat458.luminosity.events;

import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class PrivateMessageReceived extends ListenerAdapter {
    public void onPrivateMessageReceived(PrivateMessageReceivedEvent e) {
        if(!(e.getAuthor().isBot())) {
            Random rand = new Random();
            int number = rand.nextInt(5);

            if(number == 4) {
                e.getChannel().sendMessage("**BIG NOOB**").queue();
            }
            else {
                while(!(number == 0)){
                    e.getChannel().sendMessage("noob").queue();
                    number -= 1;
                }
            }
        }
    }
}