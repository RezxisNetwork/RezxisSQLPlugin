package net.rezxis.sql.bungee;

import java.io.IOException;

import net.md_5.bungee.api.plugin.Plugin;
import net.rezxis.sql.all.RezxisSQL;
import net.rezxis.sql.all.config.DatabaseConfig;

public class BungeeCordSQL extends Plugin {

	public void onEnable() {
		DatabaseConfig dc = null;
		try {
			dc = new BungeeCordDatabaseConfig(this);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		RezxisSQL.load(dc);
	}
}
