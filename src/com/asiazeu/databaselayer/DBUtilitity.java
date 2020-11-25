package com.asiazeu.databaselayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DBUtilitity {
	
	String url="jdbc:mysql://localhost:3306/examrecroddb";
    String user="root";
    String password="root@123";
    String dbDriver="com.mysql.cj.jdbc.Driver";
    
    public void JDBCRegister() {
    	try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
    //getConnection with retun of Connection 
    public Connection getConnection() {
    	Connection con=null;
    	try {
    		con=DriverManager.getConnection(url, user, password);
    	}catch(SQLException sqlexp) {
    		System.out.println("check error :"+sqlexp.getMessage());
    	}
    	return con;
    }
}
