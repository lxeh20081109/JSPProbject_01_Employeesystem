package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mode.worktime;

public class finduser {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rset = null;
	
	String drv ="org.postgresql.Driver";
	String url = "jdbc:postgresql://localhost:5432/test?charSet=utf-8";
	String user = "postgres";
	String password = "17jz0143";
	
	public List<worktime> findall(worktime work){
		List<worktime> worktime = new ArrayList<>();
		String id = work.getEmp_id();
		String name = work.getName();
		String yearmonth = work.getJob_date();
		System.out.println(id);
		System.out.println(name);
		System.out.println(yearmonth);
		String sql;
		try {
			Class.forName(drv);
		}catch(Exception e) {
			System.out.print("");
		}
		try {
			
			conn = DriverManager.getConnection(url,user,password);
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			if(id.isEmpty() && name.isEmpty() && yearmonth.isEmpty()) {
				System.out.print("sasadaadad");
				 sql = "select w.\"EMP_ID\" , e.\"EMP_NAME\",w.\"JOB_DATE\" , w.\"JOB_TIME\" ,w.\"ADD_TIME\""
						+ " from  public.\"WORK_TIME\" w JOIN public.\"EMP_MST\" e "
						+ "on e.\"EMP_ID\" = w.\"EMP_ID\"";
			}else {
				 sql = "select w.\"EMP_ID\" , e.\"EMP_NAME\",w.\"JOB_DATE\" , w.\"JOB_TIME\" ,w.\"ADD_TIME\""
						+ " from  public.\"WORK_TIME\" w JOIN public.\"EMP_MST\" e "
						+ "on e.\"EMP_ID\" = w.\"EMP_ID\""
						+ "where w.\"EMP_ID\" = '"+id+"' or e.\"EMP_NAME\" = '"+name+"'";
			}

			rset = stmt.executeQuery(sql);	
			 while(rset.next()) {
				 String uid = rset.getString("EMP_ID");
				 String username = rset.getString("EMP_NAME");
				 String job_date = rset.getString("JOB_DATE");
				 String job_time = rset.getString("JOB_TIME");
				 String add_time = rset.getString("ADD_TIME");
				 worktime wtime = new worktime(uid,username,job_date,job_time,add_time);
				 worktime.add(wtime);
				
			 }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return worktime;
	}
}
