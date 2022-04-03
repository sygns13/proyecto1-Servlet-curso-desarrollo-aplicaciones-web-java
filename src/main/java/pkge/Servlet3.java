package pkge;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet3", value="/Servlet3")
public class Servlet3 extends HttpServlet {
	
	public void init() {
		System.out.println("Se ha inicializado el Servlet");
	}
	
	public void destroy() {
		System.out.println("Se ha Finalizado y Destruido el Servlet");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		System.out.println("Usuario: " + usuario);
		System.out.println("Password: " + password);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Usuario: " + usuario + "</h1>");
		out.println("<h1>Password: " + password + "</h1>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
	}
	

}
