package net.rezxis.sql.spigot;

import org.bukkit.plugin.java.JavaPlugin;

import net.rezxis.sql.all.RezxisSQL;
import net.rezxis.sql.all.config.DatabaseConfig;

public class SpigotSQL extends JavaPlugin {

	public void onEnable() {
		DatabaseConfig dc = null;
		try {
			dc = new SpigotDatabaseConfig(this);
		} catch (Exception ex) {
			ex.printStackTrace();
			return;
		}
		RezxisSQL.load(dc);
	}
}
