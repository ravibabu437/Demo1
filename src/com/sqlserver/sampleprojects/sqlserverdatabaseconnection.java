package com.sqlserver.sampleprojects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlserverdatabaseconnection 
{
	public static void main(String [] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		
		//step 1 establishing database connection
		String url="jdbc:sqlserver://primusbank.qedgetech.com:1433;database=bankdb";
		String uid="qedge";
		String pwd="qedge";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		Connection dbcon=DriverManager.getConnection(url, uid, pwd);
		
		
		//step 2 send sql query to database
		String sqlstmt="Select branchid,branchname from BankBranches order by branchid";
		Statement stmt=dbcon.createStatement();
		ResultSet rs=stmt.executeQuery(sqlstmt);
		
		
		//step 3 process results
		while(rs.next())
		{
			int brid=rs.getInt(1);
			String brname=rs.getString("branchname");
			System.out.println(brid+ " "+brname);
			
		}
		
		rs.close();
		dbcon.close();
		
	}

}
