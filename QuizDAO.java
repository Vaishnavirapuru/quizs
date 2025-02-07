package com.nov16;

import java.sql.*;

public class QuizDAO {
	int k=0;
	public int  quiz(QuizBean ub) 
	{
		try {
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("insert into quiz values(?,?,?,?)");
		ps.setString(1,ub.getName());
		ps.setString(2, ub.getPword());
		ps.setInt(4, ub.getScore());
		ps.setInt(3, ub.getQues());
		k =ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}

}
