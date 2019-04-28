/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ensarkarabudak
 */
@WebServlet(name = "Ornek", urlPatterns = {"/Ornek"})
public class Ornek extends HttpServlet {
 
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html; charset=utf-8");
      
      PrintWriter out = response.getWriter();
	  String title = "GET Methodunu Kullanarak Formdan Veri Okuma";

      out.println("<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#c2c3a0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>İsim   </b>: "
                + request.getParameter("first_name") + "\n" +
                "  <li><b>Soyisim</b>: "
                + request.getParameter("last_name") + "\n" +
                "  <li><b>Numara</b>: "
                + request.getParameter("number") + "\n" +
                "</ul>\n" +
                "</body></html>");
  }
  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");
      doGet(request, response);
  }
}
