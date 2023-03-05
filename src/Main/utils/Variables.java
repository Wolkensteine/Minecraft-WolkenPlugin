package Main.utils;

import Main.InformationalClasses.City;
import Main.InformationalClasses.Home;
import Main.InformationalClasses.Party;
import Main.InformationalClasses.Team;

public class Variables {

	// Variables
	public static Home[] Homes;		// Array of homes
	public static Team[] Teams;		// Array of teams
	public static Party[] Parties;	// Array of parties
	public static City[] Cities;	// Array of cities

	// Constants 
	// These are getting set when the plugin starts up, they are read from the config file
	public static int HomeDiameter;
	public static int CityDiameter;
	public static String[] badWords;
	
	public static String[] Append(String[] Array, String toAppend) {
		String tmp[] = new String[Array.length + 1];
		for (int i = 0; i < Array.length; i++) {
			tmp[i] = Array[i];
		}
		tmp[Array.length] = toAppend;
		return tmp;
	}
	
	public static int[] Append(int[] Array, int toAppend) {
		int tmp[] = new int[Array.length + 1];
		for (int i = 0; i < Array.length; i++) {
			tmp[i] = Array[i];
		}
		tmp[Array.length] = toAppend;
		return tmp;
	}
	
	public static double[] Append(double[] Array, double toAppend) {
		double tmp[] = new double[Array.length + 1];
		for (int i = 0; i < Array.length; i++) {
			tmp[i] = Array[i];
		}
		tmp[Array.length] = toAppend;
		return tmp;
	}
	
}
