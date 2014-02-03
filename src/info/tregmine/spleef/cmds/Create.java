package info.tregmine.spleef.cmds;

import info.tregmine.spleef.ArenaManager;
import info.tregmine.spleef.MessageManager;
import info.tregmine.spleef.SettingsManager;

import java.util.List;


import org.bukkit.entity.Player;

public class Create extends SubCommand {

	public void onCommand(Player p, String[] args) {
		int id = ArenaManager.getInstance().getArenas().size() + 1;
		
		SettingsManager.getInstance().createConfigurationSection(id + "");
		List<Integer> ids = SettingsManager.getInstance().<List<Integer>>get("ids");
		ids.add(id);
		SettingsManager.getInstance().set("ids", ids);
		
		MessageManager.getInstance().good(p, "Created Arena " + id + "!");
		
		ArenaManager.getInstance().setup();
	}
	
	public String name() {
		return "create";
	}
	
	public String info() {
		return "Create an arena.";
	}
	
	public String[] aliases() {
		return new String[] { "c" };
	}
}