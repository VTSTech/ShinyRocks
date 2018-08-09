package mc.v0923.ShinyRocks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
//import org.bukkit.plugin.Plugin;

public class EventsClass implements Listener {
	//Plugin plugin = ShinyRocks.getPlugin(ShinyRocks.class);
	String lastDiamond = "";
	String lastEmerald = "";
	String lastGold = "";
	@EventHandler
	public void onBlockBreakEvent(BlockBreakEvent event ) {
		Player player = event.getPlayer();
		Block block = event.getBlock();		
		if(player.getDisplayName() != lastDiamond){
			if(block.getType().equals(Material.DIAMOND_ORE)){
				lastDiamond = player.getDisplayName().replace(" ", "");
				Bukkit.broadcastMessage(ChatColor.RED + player.getDisplayName() + ChatColor.DARK_RED + " just mined some shiny " + ChatColor.GOLD + block.getType().name());
			}
		}
		if (player.getDisplayName() != lastEmerald){
			if(block.getType().equals(Material.EMERALD_ORE)){
			lastEmerald = player.getDisplayName().replace(" ", "");;
			Bukkit.broadcastMessage(ChatColor.RED + player.getDisplayName() + ChatColor.DARK_RED + " just mined some shiny " + ChatColor.GOLD + block.getType().name());
			}
		}
		if (player.getDisplayName() != lastGold){
			if(block.getType().equals(Material.GOLD_ORE)){
				lastGold = player.getDisplayName().replace(" ", "");;
				Bukkit.broadcastMessage(ChatColor.RED + player.getDisplayName() + ChatColor.DARK_RED + " just mined some shiny " + ChatColor.GOLD + block.getType().name());
			}
		}
		//Bukkit.broadcastMessage(ChatColor.ITALIC + "DEBUG: " + player.getDisplayName() + " " + block.getType().name() + " Last: " + lastDiamond + " " + lastEmerald + " " + lastGold);
		}
	}
