package przemowskyy.siuranie.main;

import org.bukkit.plugin.java.JavaPlugin;

import przemowskyy.siuranie.cmds.Siuranie;

public class Main extends JavaPlugin{

	public void onEnable() {
		//tutaj cos bedzie przysiegam
		//Jak to czytasz to pozdrawiam ♥
		new Siuranie(this);
	}
}
