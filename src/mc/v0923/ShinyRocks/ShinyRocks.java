package mc.v0923.ShinyRocks;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ShinyRocks extends JavaPlugin{
	public void onEnable() { 
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "ShinyRocks v0.1a by YT_Veritas0923 Loaded!");
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
		registerConfig();
	}
	public void onDisable() { 
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "ShinyRocks v0.1a by YT_Veritas0923 Unloaded!");
	}
	public void registerConfig() {
		@SuppressWarnings("unused")
		String configPath;
		File config = new File(this.getDataFolder(), "config.yml");
        configPath = config.getPath();
        if(!config.exists()) {
            this.getConfig().options().copyDefaults(true);
            saveConfig();
        }
    }	
	public void saveSettings() {
	}
}