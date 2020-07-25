package net.rezxis.sql.spigot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import net.rezxis.sql.all.config.DatabaseConfig;

public class SpigotDatabaseConfig extends DatabaseConfig {

	public SpigotDatabaseConfig(JavaPlugin plugin) throws FileNotFoundException, IOException, InvalidConfigurationException {
		FileConfiguration configuration = new YamlConfiguration();
		File file = new File(plugin.getDataFolder(),"database.yml");
		configuration.load(file);
		host = configuration.getString("host");
		username = configuration.getString("username");
		password = configuration.getString("password");
		port = configuration.getInt("port");
		database = configuration.getString("database");
	}
}
