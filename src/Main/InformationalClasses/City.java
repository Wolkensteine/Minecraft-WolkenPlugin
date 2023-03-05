package Main.InformationalClasses;

import org.bukkit.block.Block;

import Main.utils.Variables;

public class City {

	public static Team ownerT;
	public static int XLocationMidChunk;
	public static int ZLocationMidChunk;
	public static String cityWorldName;
	
	public City(Team ownerTeam, int midLocationX, int midLocationZ, String worldName) {
		ownerT = ownerTeam;
		XLocationMidChunk = midLocationX;
		ZLocationMidChunk = midLocationZ;
		cityWorldName = worldName;
	}
	
	public static boolean isPartOfCity(Block block) {
		if (block.getChunk().getWorld().getName() != cityWorldName) {
			return false;
		}
		boolean tmp = false;
		for (int i = XLocationMidChunk - Variables.HomeDiameter; i < XLocationMidChunk + Variables.HomeDiameter; i++) {
			if (block.getChunk().getX() == i) {
				tmp = true;
				break;
			}
		}
		if (!tmp) {
			return false;
		}
		tmp = false;
		for (int i = ZLocationMidChunk - Variables.HomeDiameter; i < ZLocationMidChunk + Variables.HomeDiameter; i++) {
			if (block.getChunk().getZ() == i) {
				tmp = true;
				break;
			}
		}
		if (!tmp) {
			return false;
		}
		return true;
	}
	
	public static boolean isAllowed(String playerID) {
		if (ownerT.isMember(playerID)) {
			return true;
		} else {
			return false;
		}
	}
	
}
