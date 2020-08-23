package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mode.worktimemeisai;
public class EmployeeDAO {
	
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String drv ="org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/test?charSet=utf-8";
		String user = "postgres";
		String password = "17jz0143";
		
		public List<worktimemeisai> findAll(){
			List<worktimemeisai> timemeisai = new ArrayList<>();
			try {
				Class.forName(drv);
			}catch(Exception e) {
				System.out.print("");
			}
			try {
				 conn = DriverManager.getConnection(url,user,password);
				 
				 conn.setAutoCommit(false);
				 
				 stmt = conn.createStatement();
				 String sql = "select * from  public.\"WORK_TIME_MEISAI\"";
				 rset = stmt.executeQuery(sql);
				 
				 while(rset.next()) {
						 String id = rset.getString("EMP_ID");
						 String job_date = rset.getString("JOB_DATE");
						String job_day = rset.getString("JOB_DATE");
						String job_start =rset.getString("JOB_TIME_START");
						String job_end =rset.getString("JOB_TIME_END");
						int break_time =rset.getInt("BREAK_TIME");
						int  job_time =rset.getInt("JOB_TIME");
						String memeo = rset.getString("MEMO");
						String del_flg =rset.getString("DEL_FLG");
						String make_date=rset.getString("MAKE_DATE");
						String make_user =rset.getString("MAKE_USER");
						String update_date=rset.getString("UPDATE_DATE");
						String update_user=rset.getString("UPDATE_USER");
					
					worktimemeisai timemeisai1 = new worktimemeisai( id,
								 job_date,
								 job_day,
								 job_start,
								 job_end,
								 break_time,
								  job_time,
								 memeo,
								 del_flg,
								 make_date,
								 make_user,
								 update_date,
								 update_user);
					 timemeisai.add(timemeisai1);
				 }
				
				 
			}catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					if(rset != null)rset.close();
					if(stmt != null)stmt.close();
					if(conn != null)conn.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
			
		
			return timemeisai;
		}
		
	
}
