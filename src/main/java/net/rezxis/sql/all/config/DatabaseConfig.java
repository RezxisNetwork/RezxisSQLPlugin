package net.rezxis.sql.all.config;

import lombok.Getter;

public class DatabaseConfig {

	@Getter protected String host;
	@Getter protected String username;
	@Getter protected String password;
	@Getter protected int port;
	@Getter protected String database;
}