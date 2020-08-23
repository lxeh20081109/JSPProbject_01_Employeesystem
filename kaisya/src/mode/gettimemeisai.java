package mode;

import java.util.List;

import dao.EmployeeDAO;

public class gettimemeisai {
		public List<worktimemeisai> execute(){
			EmployeeDAO epy = new EmployeeDAO();
			List<worktimemeisai> worktimemeisai = epy.findAll();
			return worktimemeisai;
		}
}
