package Main.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

public class BlockInteract implements Listener {

	@EventHandler
	public void onBlockPlace(BlockPlaceEvent e) {
		// Get UUID and process it in city and home classes
		// e.getPlayer().getUniqueId();
		// Get the block and parse it to city and home classes
		// e.getBlock();
	}
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		// Get UUID and process it in city and home classes
		// e.getPlayer().getUniqueId();
		// Get the block and parse it to city and home classes
		// e.getBlock();
	}
	
	@EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        // check if it's a chest
        if (event.getInventory().getType().equals(InventoryType.CHEST) || event.getInventory().getType().equals(InventoryType.BARREL) || event.getInventory().getType().equals(InventoryType.ENDER_CHEST)) {
            // do something when a chest, enderchest or barrel is opened
        } 
    }
	
}
