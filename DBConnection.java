package com.nov16;

import java.sql.*;

public class DBConnection {
	private static Connection con;
	private DBConnection()
	{
		
	}
	static
	{
		try {
			Class.forName(DBinfo.driver);
			con=DriverManager.getConnection(DBinfo.dburl,DBinfo.uname,DBinfo.pword);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static Connection getCon()
	{
		return con;
	}

}
