package Main.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CityCommand implements CommandExecutor {

	public boolean onCommand(CommandSender Sender, Command Command, String label, String[] args) {
		
		if (Sender instanceof Player) {
			
		} else {
			Sender.sendMessage("You are not a player. This command can just be executed as a player.");
		}
		
		return false;
	}

}
