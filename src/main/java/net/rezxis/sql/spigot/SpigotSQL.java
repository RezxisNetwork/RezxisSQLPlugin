package net.rezxis.sql.spigot;

import org.bukkit.plugin.java.JavaPlugin;

import net.rezxis.mchosting.database.BukkitVars;
import net.rezxis.mchosting.database.Database;
import net.rezxis.sql.all.RezxisSQL;
import net.rezxis.sql.all.config.DatabaseConfig;

public class SpigotSQL extends JavaPlugin {

	public static SpigotSQL instance;
	
	public void onEnable() {
		instance = this;
		DatabaseConfig dc = null;
		try {
			dc = new SpigotDatabaseConfig(this);
		} catch (Exception ex) {
			ex.printStackTrace();
			return;
		}
		Database.setSet(true);
		BukkitVars.setPlugin(this);
		RezxisSQL.load(dc);
	}
}
