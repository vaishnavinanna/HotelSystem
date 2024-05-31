package org.hotel.config;
import java.sql.*;
import java.util.*;

public class DBConfig {
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet res;
	private static DBConfig db=null;
	
	public static void main(String x[]) {
		new DBConfig();
	}
	
	private DBConfig(){
		try {
			Properties p=new Properties();
			p.load(PathHelper.fin);
			String classname=p.getProperty("driver.classname");
			String username=p.getProperty("driver.username");
			String password=p.getProperty("driver.password");
			String url=p.getProperty("driver.url");
			Class.forName(classname);
			conn=DriverManager.getConnection(url,username,password);
			if(conn!=null) {
				System.out.println("Database Connected");
			}
			else {
				System.out.println("Database is not connected");
			}	
		} catch (Exception e) {
			System.out.println("The error is "+e);
		}
	}
	
	public static DBConfig getDBInstance() {
		if(db==null) {
			db=new DBConfig();
		}
		return db;
	}
	
	public static PreparedStatement getPreparedStatement() {
		return pstmt;
	}
	public static Connection getConnection() {
		return conn;
	}
	public static ResultSet getResultSet() {
		return res;
	}
}
