package com.sandeep.cloudconnect;

import javax.sql.DataSource;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("cloud")
public class CloudConfig extends AbstractCloudConfig{

	 @Bean
	 public DataSource inventoryDataSource() {
		 return connectionFactory().dataSource("my-msqldb");
	  }
}
