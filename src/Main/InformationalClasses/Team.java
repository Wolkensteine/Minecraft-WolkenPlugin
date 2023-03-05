package Main.InformationalClasses;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import Main.utils.Variables;

public class Team {

	public static String[] memberNames;
	public static String[] memberIDs;
	public static String masterName;
	public static String masterID;
	
	public boolean isMember(String playerID) {
		for (int i = 0; i < memberIDs.length; i++) {
			if (playerID == memberIDs[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static void addMember(String playerName) {
		Player member = Bukkit.getPlayer(playerName);
		String UUID = member.getUniqueId().toString();
		memberIDs = Variables.Append(memberIDs, UUID);
		memberNames = Variables.Append(memberNames, playerName);
	}
	
	public static void makeMaster(String playerName) {
		masterName = playerName;
		Player member = Bukkit.getPlayer(playerName);
		String UUID = member.getUniqueId().toString();
		masterID = UUID;
	}
	
	public static boolean isMaster(String playerName) {
		return false;
	}

}
