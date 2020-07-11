package com.accenture.tcf.bars;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/bars_db?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String pass = "admin";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println(myConn);
			System.out.println(user);
			System.out.println(pass);
		}
	
		catch (Exception exc) {
		exc.printStackTrace();
	
		}
	}

}
