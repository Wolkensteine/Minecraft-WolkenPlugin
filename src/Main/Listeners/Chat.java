package Main.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import Main.utils.Variables;

public class Chat implements Listener {

	@EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        // do something with e.getPlayer() and e.getMessage()
		
		// cancel the message if it contains a bad word
		for (int i = 0; i < Variables.badWords.length; i++) {
			if (e.getMessage().contains(Variables.badWords[i])) {
	    		e.setCancelled(true);
	    		break;
	    	}
	    }
    }
	
}
