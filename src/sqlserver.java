import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class sqlserver {

	public static void main(String[] args) throws SQLException, InstantiationException, ReflectiveOperationException, ClassNotFoundException
	{
	
		//step1:Establish DB connection
		String dburl= "jdbc:sqlserver://primusbank.Qedgetech.com:1433;database=bankdb";
				
		String uid="qedge";
		String pwd="qedge";
		String sqlstmt = "Select count(*) from bankbranch";
		Class.forName("com.microsoft.sqlserver.jdbc.sqlserverdriver").newInstance();
		Connection dbcon;
		dbcon=DriverManager.getConnection(dburl, uid, pwd);
		//step2:
		Statement stmt=dbcon.createStatement();
		
		ResultSet rs =stmt.executeQuery(sqlstmt);
		
		//step3
		rs.next();
		int brcount=rs.getInt(1);
		System.out.println(brcount);
		rs.close();
		dbcon.close();
		
		
		
		
		
		
	}
	}
	
	
	
