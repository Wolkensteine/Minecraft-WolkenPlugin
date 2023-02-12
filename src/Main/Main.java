package Main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable () {
		System.out.println("WolkenPlugin> Enabeling ...");
		System.out.println("WolkenPlugin> Enabled.");
	}
	
	public void onDisable () {
		System.out.println("WolkenPlugin> Disabeling ...");
		System.out.println("WolkenPlugin> Disabled.");
	}

}
