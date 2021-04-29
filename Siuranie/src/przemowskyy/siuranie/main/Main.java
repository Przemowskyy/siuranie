package przemowskyy.siuranie.main;

import org.bukkit.plugin.java.JavaPlugin;

import przemowskyy.siuranie.cmds.Siuranie;

public class Main extends JavaPlugin{

	public void onEnable() {
		//https://www.youtube.com/watch?v=G_0_QUZAyOc
		//Jak to czytasz to pozdrawiam ♥
		new Siuranie(this);
	}
}
