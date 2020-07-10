package com.accenture.tcf.bars.datasource;

import java.sql.Connection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.accenture.tcf.bars")
@PropertySource({ "classpath:application.properties" })
public class MySQLDataSource {
	
	private Connection conn;
	
	public Connection getConnection;
	

	public MySQLDataSource() {
		
	}

}
