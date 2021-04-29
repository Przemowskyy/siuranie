package przemowskyy.siuranie.cmds;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import przemowskyy.siuranie.main.Main;

public class Siuranie implements CommandExecutor {

	Main plugin;
	
	public Siuranie(Main m) {
		plugin = m;
		m.getCommand("siuraj").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		if(sender.hasPermission("siuranie.*")) {
			for(Player ps : Bukkit.getOnlinePlayers()) {
				ps.sendMessage("§7Gracz §c" + sender.getName() + " §7Siura");
			}
			sender.sendMessage("§eSiurasz ♥");
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + sender.getName() + " potion 1 name:&e&lBootle_Of_Siuranie");
		} else {
			sender.sendMessage("§cNie posiadasz siura więc nie możesz siurać ;c");
		}
		return false;
	}
}
