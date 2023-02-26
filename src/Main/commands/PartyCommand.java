package Main.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PartyCommand implements CommandExecutor {

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
			completions.add("invite");		// Invites new players, in case there is no active party it also creates one
			completions.add("create");		// Creates an empty party
			completions.add("kick");		// Kicks a member
			completions.add("promote");		// Promotes someone to party leader
			completions.add("warp");		// Warps all party members
			completions.add("list"); 		// Lists all members
		}
		return completions;
	}

}
