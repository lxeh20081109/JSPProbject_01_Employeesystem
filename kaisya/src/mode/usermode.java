package mode;

public class usermode {
		private	String user_id;
		private	String password;
		private	String name;
		private	String permission;
		private	String del_flg;
		private	String make_date;
		private String make_user;
		private	String update_date;
		public usermode(String user_id, String password) {
			super();
			this.user_id = user_id;
			this.password = password;
		}
		private String update_user;
		
		
		public usermode(String user_id, String password, String name, String permission, String del_flg,
				String make_date, String make_user, String update_date, String update_user) {
			super();
			this.user_id = user_id;
			this.password = password;
			this.name = name;
			this.permission = permission;
			this.del_flg = del_flg;
			this.make_date = make_date;
			this.make_user = make_user;
			this.update_date = update_date;
			this.update_user = update_user;
		}
		public usermode(String user_id, String password, String name, String permission, String del_flg) {
			super();
			this.user_id = user_id;
			this.password = password;
			this.name = name;
			this.permission = permission;
			this.del_flg = del_flg;
		}
		public String getUser_id() {
			return user_id;
		}
		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPermission() {
			return permission;
		}
		public void setPermission(String permission) {
			this.permission = permission;
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
