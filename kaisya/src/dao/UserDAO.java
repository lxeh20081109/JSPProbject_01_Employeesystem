package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mode.usermode;
import mode.worktimemeisai;

public class UserDAO {

	Connection conn = null;
	Statement stmt = null;
	ResultSet rset = null;
	
	String drv ="org.postgresql.Driver";
	String url = "jdbc:postgresql://localhost:5432/test?charSet=utf-8";
	String user = "postgres";
	String password = "17jz0143";
	
	public int execute(usermode user1){
		int record = 2;
		String name = user1.getUser_id();
		String pass = user1.getPassword();
		System.out.println(name + ":" + pass);
		try {
			Class.forName(drv);
		}catch(Exception e) {
			System.out.print("");
		}
		try {
			 conn = DriverManager.getConnection(url,user,password);
			 
			 conn.setAutoCommit(false);
			 
			 stmt = conn.createStatement();
//			 String sql = "select * from public.\"USER_MST\"";
			 String sql = "select * from  public.\"USER_MST\" where \"USER_ID\" = '"+name+"' and \"PASSWORD\" = '"+pass+"'";
			 
			 rset = stmt.executeQuery(sql);	
			 while(rset.next()) {
				 String quanxian = rset.getString("PERMISSION");
				 System.out.println("==============" +quanxian );
				 System.out.print(rset.getString("USER_ID"));
				 record =1;
			 }
				
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		 
		 return record;
	}
	
}
