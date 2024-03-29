package info.tregmine.spleef.cmds;

import info.tregmine.spleef.ArenaManager;
import info.tregmine.spleef.MessageManager;

import org.bukkit.entity.Player;

public class Reload extends SubCommand {

	public void onCommand(Player p, String[] args) {
		ArenaManager.getInstance().setup();
		MessageManager.getInstance().good(p, "Reloaded!");
	}
	
	public String name() {
		return "reload";
	}
	
	public String info() {
		return "Reload arenas.";
	}
	
	public String[] aliases() {
		return new String[] { "r" };
	}
}