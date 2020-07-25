package net.rezxis.sql.bungee;

import java.io.File;
import java.io.IOException;

import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;
import net.rezxis.sql.all.config.DatabaseConfig;

public class BungeeCordDatabaseConfig extends DatabaseConfig {

	public BungeeCordDatabaseConfig(Plugin plugin) throws IOException {
		Configuration configuration = ConfigurationProvider.getProvider(YamlConfiguration.class).load(new File(plugin.getDataFolder(), "database.conf"));
		host = configuration.getString("host");
		username = configuration.getString("username");
		password = configuration.getString("password");
		port = configuration.getInt("port");
		database = configuration.getString("database");
	}
}
