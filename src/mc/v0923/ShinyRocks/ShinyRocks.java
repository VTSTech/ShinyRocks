package mc.v0923.ShinyRocks;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ShinyRocks extends JavaPlugin{
	public void onEnable() { 
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "ShinyRocks v0.1 by YT_Veritas0923 Loaded!");
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
	}
	public void onDisable() { 
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "ShinyRocks v0.1 by YT_Veritas0923 Unloaded!");
	}
}