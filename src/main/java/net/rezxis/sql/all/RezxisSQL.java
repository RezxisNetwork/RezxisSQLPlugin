package net.rezxis.sql.all;

import net.rezxis.mchosting.database.Database;
import net.rezxis.sql.all.config.DatabaseConfig;

public class RezxisSQL {

	public static void load(DatabaseConfig conf) {
		Database.init(conf.getHost(), conf.getUsername(), conf.getPassword(), conf.getPort(), conf.getDatabase());
	}
}
