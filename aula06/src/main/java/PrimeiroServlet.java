import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet("/primeiroServlet")
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		
		String senha = request.getParameter("senha");
		
		if (login.equals("jpires") && senha.equals("123")) {
			RequestDispatcher rd = request.getRequestDispatcher("bemvindo.jsp");
			request.setAttribute("login", login);
			rd.forward(request, response);
		}
		
		if (!(login.equals("jpires") && senha.equals("123"))) {
			RequestDispatcher rd = request.getRequestDispatcher("bemvindo.jsp");
			request.setAttribute("login", login);
		}
		
		
	}

}
