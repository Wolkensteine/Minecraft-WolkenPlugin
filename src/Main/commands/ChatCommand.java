package Main.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatCommand implements CommandExecutor {

	public boolean onCommand(CommandSender Sender, Command command, String label, String[] args) {

		if (Sender instanceof Player) {
			if (args[0] == "a") {
				
			} else if (args[0] == "p") {
				
			} else if (args[0] == "t") {
				
			} else if (args[0] == "all") {
				
			} else if (args[0] == "party") {
				
			} else if (args[0] == "team") {
				
			} else {
				Sender.sendMessage("Invalid argument! Try 'all', 'party' or 'team'");
			}
		} else {
			Sender.sendMessage("You are not a player. This command can just be executed as a player.");
		}

		return false;
	}

}
