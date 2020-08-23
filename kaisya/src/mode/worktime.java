package mode;

import java.sql.Date;

public class worktime {
		private String emp_id;
		private String name;

		private String job_date;
		private String job_time;
		private String add_time;
		private String del_flg;
		private Date make_date;
		private String make_user;
		private Date update_date;
		private String update_user;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public worktime(String emp_id, String name, String job_date) {
			super();
			this.emp_id = emp_id;
			this.name = name;
			this.job_date = job_date;
		}

		public worktime(String emp_id, String job_date) {
			super();
			this.emp_id = emp_id;
			this.job_date = job_date;
		}
		public worktime(String emp_id) {
			super();
			this.emp_id = emp_id;
		}

		public String getEmp_id() {
			return emp_id;
		}
		public void setEmp_id(String emp_id) {
			this.emp_id = emp_id;
		}
		public String getJob_date() {
			return job_date;
		}
		public void setJob_date(String job_date) {
			this.job_date = job_date;
		}

		public worktime(String emp_id, String name, String job_date, String job_time, String add_time) {
			super();
			this.emp_id = emp_id;
			this.name = name;
			this.job_date = job_date;
			this.job_time = job_time;
			this.add_time = add_time;
		}
		public String getJob_time() {
			return job_time;
		}
		public void setJob_time(String job_time) {
			this.job_time = job_time;
		}
		public String getAdd_time() {
			return add_time;
		}
		public void setAdd_time(String add_time) {
			this.add_time = add_time;
		}
		public String getDel_flg() {
			return del_flg;
		}
		public void setDel_flg(String del_flg) {
			this.del_flg = del_flg;
		}
		public Date getMake_date() {
			return make_date;
		}
		public void setMake_date(Date make_date) {
			this.make_date = make_date;
		}
		public String getMake_user() {
			return make_user;
		}
		public void setMake_user(String make_user) {
			this.make_user = make_user;
		}
		public Date getUpdate_date() {
			return update_date;
		}
		public void setUpdate_date(Date update_date) {
			this.update_date = update_date;
		}
		public String getUpdate_user() {
			return update_user;
		}
		public void setUpdate_user(String update_user) {
			this.update_user = update_user;
		}
		
}
