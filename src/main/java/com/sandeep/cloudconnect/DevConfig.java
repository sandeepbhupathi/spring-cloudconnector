package com.sandeep.cloudconnect;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@Profile("default")
public class DevConfig {

	@Bean
	public DataSource getDataSource(){
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase eb = builder.setType(EmbeddedDatabaseType.HSQL).
				addScripts("schema-dev.sql","data-dev.sql")
				.build();
		return eb;
	}
}
