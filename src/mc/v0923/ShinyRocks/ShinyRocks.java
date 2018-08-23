package mc.v0923.ShinyRocks;
import java.io.File;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ShinyRocks extends JavaPlugin{
	public void onEnable() {
		registerConfig();
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "ShinyRocks v" + getConfig().getString("ShinyRocks.version") + " by YT_Veritas0923 Loaded!");
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
		
	}
	public void onDisable() { 
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "ShinyRocks " + getConfig().getString("ShinyRocks.version") + " by YT_Veritas0923 Unloaded!");
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
}