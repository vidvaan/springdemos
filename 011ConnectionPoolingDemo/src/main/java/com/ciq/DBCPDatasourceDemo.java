package com.ciq;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBCPDatasourceDemo {
	
	public static void main(String[] args) {
		  BasicDataSource dataSource = new BasicDataSource();
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/ciq");
	        dataSource.setUsername("root");
	        dataSource.setPassword("root");

	        // DBCP configuration
	        dataSource.setInitialSize(5); // Initial number of connections
	        dataSource.setMaxTotal(10);    // Maximum number of connections
	        dataSource.setMaxIdle(5);     // Maximum number of idle connections
	        dataSource.setMinIdle(2);     // Minimum number of idle connections
	        dataSource.setMaxWaitMillis(10000); // Maximum time to wait for a connection (milliseconds)

	        
	        try {
				Connection connection = dataSource.getConnection();
				System.out.println(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        
	        
	
	
	
	}

}
