package mode;

public class worktimemeisai {
	private  String emp_id;
	private  String job_date;
	private	String job_day;
	private	String job_start;
	private	String job_end;
	private	int break_time;
	private	int  job_time;
	private	String memeo;
	private	String del_flg;
	private	String make_date;
	private String make_user;
	private	String update_date;
	private	String update_user;
	

	public worktimemeisai(String emp_id, String job_date, String job_day, String job_start, String job_end,
			int break_time, int job_time, String memeo, String del_flg, String make_date, String make_user,
			String update_date, String update_user) {
		super();
		this.emp_id = emp_id;
		this.job_date = job_date;
		this.job_day = job_day;
		this.job_start = job_start;
		this.job_end = job_end;
		this.break_time = break_time;
		this.job_time = job_time;
		this.memeo = memeo;
		this.del_flg = del_flg;
		this.make_date = make_date;
		this.make_user = make_user;
		this.update_date = update_date;
		this.update_user = update_user;
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

	public String getJob_day() {
		return job_day;
	}

	public void setJob_day(String job_day) {
		this.job_day = job_day;
	}

	public String getJob_start() {
		return job_start;
	}

	public void setJob_start(String job_start) {
		this.job_start = job_start;
	}

	public String getJob_end() {
		return job_end;
	}

	public void setJob_end(String job_end) {
		this.job_end = job_end;
	}

	public int getBreak_time() {
		return break_time;
	}

	public void setBreak_time(int break_time) {
		this.break_time = break_time;
	}

	public int getJob_time() {
		return job_time;
	}

	public void setJob_time(int job_time) {
		this.job_time = job_time;
	}

	public String getMemeo() {
		return memeo;
	}

	public void setMemeo(String memeo) {
		this.memeo = memeo;
	}

	public String getDel_flg() {
		return del_flg;
	}

	public void setDel_flg(String del_flg) {
		this.del_flg = del_flg;
	}

	public String getMake_date() {
		return make_date;
	}

	public void setMake_date(String make_date) {
		this.make_date = make_date;
	}

	public String getMake_user() {
		return make_user;
	}

	public void setMake_user(String make_user) {
		this.make_user = make_user;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	public String getUpdate_user() {
		return update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}


	

}
