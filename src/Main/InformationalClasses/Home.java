package Main.InformationalClasses;

import org.bukkit.block.Block;

import Main.utils.Variables;

public class Home {

	public static String ownerN;
	public static String oID;
	public static int XLocationMidChunk;
	public static int ZLocationMidChunk;
	public static String homeWorldName;
	
	public Home(String ownerName, String ownerID, int midLocationX, int midLocationZ, String worldName) {
		ownerN = ownerName;
		oID = ownerID;
		XLocationMidChunk = midLocationX;
		ZLocationMidChunk = midLocationZ;
		homeWorldName = worldName;
	}
	
	public static boolean isPartOfHome(Block block) {
		if (block.getChunk().getWorld().getName() != homeWorldName) {
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
		if (playerID == oID) {
			return true;
		} else {
			return false;
		}
	}
	
}
