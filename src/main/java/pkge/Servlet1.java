package pkge;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet(name = "servlet1", value = "/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }
    private String mensaje;
    
    public void init() {
    	mensaje = "Hola desde el metodo init con el Servlet con Anotaciones y comentamos la configuracion mapping de web.xml";
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Hola Mundo desde mi Servlet");
		
		PrintWriter out = response.getWriter(); 
		
		out.println("<html><body>");
		
		out.println("<h1>"+ mensaje +"</h1>");
		
		out.println("</body></html>");
		
	}
	
	public void destroy() {
		System.out.println("Se ha finalizado el Servlet y se ha destruido !!!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
