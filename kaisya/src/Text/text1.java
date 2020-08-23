package Text;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDAO;
import dao.UserDAO;
import mode.gettimemeisai;
import mode.usermode;
import mode.worktimemeisai;

/**
 * Servlet implementation class text1
 */
@WebServlet("/text1")
public class text1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public text1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		gettimemeisai gettime = new gettimemeisai();
		List<worktimemeisai> worktimemeisai = gettime.execute();
		request.setAttribute("worktimemeisai", worktimemeisai);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./task.jsp");
		dispatcher.forward(request, response);
		for(worktimemeisai s:worktimemeisai) {
			System.out.println(s.getEmp_id());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("user");
		String password = request.getParameter("pass");
		System.out.println(username);
		
		
		usermode user = new usermode(username,password);
		UserDAO userdao = new UserDAO();
		int logic = userdao.execute(user);
		if(logic == 1) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("./menu.jsp");
			dispatcher.forward(request, response);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("./loginfalse.jsp");
			dispatcher.forward(request, response);
		}
	}

}
