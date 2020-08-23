package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.finduser;
import mode.worktime;

/**
 * Servlet implementation class text2
 */
@WebServlet("/text2")
public class text2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public text2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String syaid = request.getParameter("syaID");
			String syaname = request.getParameter("syaname");
			String syayearmonth = request.getParameter("syayearmonth");
			worktime workt = new worktime(syaid,syaname,syayearmonth);
			finduser fduser = new finduser();
			List<worktime> worktime= fduser.findall(workt);
			request.setAttribute("worktime", worktime);
			RequestDispatcher dispatcher = request.getRequestDispatcher("./founduser.jsp");
			dispatcher.forward(request, response);
			
		}

}
