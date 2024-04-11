package com.ciq;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3poDatasource {
	
	public static void main(String[] args) throws PropertyVetoException {
		  ComboPooledDataSource dataSource = new ComboPooledDataSource();
	        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
	        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/ciq");
	        dataSource.setUser("root");
	        dataSource.setPassword("root");

	        // C3P0 configuration
	        dataSource.setInitialPoolSize(5); // Initial number of connections
	        dataSource.setMaxPoolSize(10);    // Maximum number of connections
	        dataSource.setMinPoolSize(2);     // Minimum number of connections
	        dataSource.setMaxIdleTime(1000);
	        
	        try {
				Connection connection =  dataSource.getConnection();
				System.out.println(connection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
