package デフォルト;

import java.util.List;

import dao.EmployeeDAO;
import mode.worktimemeisai;

public class selecttimemeisai {
		public static void main(String[] args) {
			EmployeeDAO emy = new EmployeeDAO();
			List<worktimemeisai> timemeisai = emy.findAll();
			for(worktimemeisai s:timemeisai) {
				System.out.println(s.getEmp_id());
			}
		}
}
