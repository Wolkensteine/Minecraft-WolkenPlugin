package Main;

import java.io.File;
import java.io.IOException;

import org.bukkit.plugin.java.JavaPlugin;

import Main.Listeners.BlockInteract;
import Main.Listeners.Chat;

public class Main extends JavaPlugin {

	public void onEnable () {
		System.out.println("WolkenPlugin> Enabeling ...");
		
		SetupFile("./WolkenPlugin", "settings.cfg");	// Saves plugin settings
		SetupFile("./WolkenPlugin", "Homes.json");		// Saves homes from players
		SetupFile("./WolkenPlugin", "Teams.json");		// Saves team informations
		
		getServer().getPluginManager().registerEvents(new Chat(), this);
		getServer().getPluginManager().registerEvents(new BlockInteract(), this);
		
		System.out.println("WolkenPlugin> Enabled.");
	}
	
	public void onDisable () {
		System.out.println("WolkenPlugin> Disabeling ...");
		System.out.println("WolkenPlugin> Disabled.");
	}
	
	public void SetupFile (String PATH, String filename) {
		File directory = new File(PATH);

		if (!directory.exists()) {
			directory.mkdir();
		}

		File file = new File(PATH + "/" + filename);

		try {
			if (file.createNewFile()) {
				System.out.println("File was not found. Created file: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("WolkenPlugin> An error occured in FileWriter: " + e);
		}
	}

}
