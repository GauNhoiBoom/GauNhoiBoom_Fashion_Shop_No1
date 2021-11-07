package com.gaunhoibom.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.gaunhoibom.dao.GenericDAO;

public class AbstractDAO implements GenericDAO{
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/gau_store";
			String  user ="root";
			String pass ="";
			
			return DriverManager.getConnection(url,user,pass);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}	
	}
}
