package Main.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Chat implements Listener {

	@EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        // do something with e.getPlayer() and e.getMessage()
		
		// cancel the message if it contains a bad word
	    if (e.getMessage().contains("badword")) {
	        e.setCancelled(true);
	    }
    }
	
}
