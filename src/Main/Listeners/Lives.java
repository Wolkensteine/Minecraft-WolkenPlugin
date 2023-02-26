package Main.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Lives implements Listener {

	@EventHandler
	public void onKill(PlayerDeathEvent e) {
	  String killed = e.getEntity().getName();
	  String killer = e.getEntity().getKiller().getName();
	  e.setDeathMessage(ChatColor.RED + killed + " has been slain by " + killer);
	  
	  e.getEntity().setMaxHealth(e.getEntity().getMaxHealth() - 2);
	  e.getEntity().getKiller().setMaxHealth(e.getEntity().getKiller().getMaxHealth() + 2);
	}
	
}
