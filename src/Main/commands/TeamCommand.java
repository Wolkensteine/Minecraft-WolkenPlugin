package Main.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeamCommand implements CommandExecutor {

	public boolean onCommand(CommandSender Sender, Command command, String label, String[] args) {

		if (Sender instanceof Player) {

		} else {
			Sender.sendMessage("You are not a player. This command can just be executed as a player.");
		}

		return false;
	}
	
	// Adding completion possibilities
	public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
		List<String> completions = new ArrayList<>();
		if (args.length == 1) {
			completions.add("invite");		// Invites someone to the team
			completions.add("create");		// Creates a team
			completions.add("kick");		// Kicks someone out of the team
			completions.add("promote");		// Promotes someone to team admin
			completions.add("warp");		// Warps all members
			completions.add("list");		// Lists all members, cities, enemies and trading partners
		}
		return completions;
	}

}
