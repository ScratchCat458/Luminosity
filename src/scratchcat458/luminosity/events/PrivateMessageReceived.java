package scratchcat458.luminosity.events;

import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class PrivateMessageReceived extends ListenerAdapter {
    public void onPrivateMessageReceived(PrivateMessageReceivedEvent e) {
        Random rand = new Random();
        int number = rand.nextInt(10);

        if(number == 10) {
            e.getChannel().sendMessage("**BIG NOOB**");
        }
        else {
            while(number>=0){
                e.getChannel().sendMessage("noob");
                number-=1;
            }
        }

    }
}