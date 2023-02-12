package Main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable () {
		System.out.println("Wolkenplugin> Enabeling ...");
		System.out.println("Wolkenplugin> Enabled.");
	}
	
	public void onDisable () {
		System.out.println("Wolkenplugin> Disabeling ...");
		System.out.println("Wolkenplugin> Disabled.");
	}

}
