package ar.com.cdt.prueba;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServletParam extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");// setting the content type
		PrintWriter pw = res.getWriter();// get the stream to write the data

		String pathInfo = req.getPathInfo(); // /{value}/test
		System.out.println(pathInfo);
		String[] pathParts = pathInfo.split("/");
		String nombre = pathParts[1]; // {value}

		// writing html in the stream
		pw.println("<html><body>");
		pw.println(nombre.toUpperCase() + ", estás haciendo una prueba de concepto");
		pw.println("</body></html>");

		pw.close();// closing the stream
	}
}