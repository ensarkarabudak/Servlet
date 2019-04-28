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
@WebServlet(name = "Ornek2", urlPatterns = {"/Ornek2"})

// Extend HttpServlet class
public class Ornek2 extends HttpServlet {
 
  // Method to handle GET method request.
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html; charset=utf-8");
      PrintWriter out = response.getWriter();
      String check1=request.getParameter("matematik");
      if (check1==null)
          check1="Seçilmedi";
      else 
          check1="Seçildi";
      String check2=request.getParameter("fizik");
      if (check2==null)
          check2="Seçilmedi";
      else
          check2="Seçildi";
      
      String title = "Checkbox'dan Veri Okuma";
      String docType =
      "<!doctype html public \"-//w3c//dtd html 4.0 " +
      "transitional//en\">\n";
      out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>Matematik : </b> "
                + check1 + "\n" +
                "  <li><b>Fizik : </b> "
                + check2 + "\n" +
                "  <li><b>Kimya : </b> "
                + request.getParameter("kimya") + "\n" +
                "  <li><b>Biyoloji : </b> "
                + request.getParameter("biyoloji") + "\n" +
                "</ul>\n" +
                "</body></html>");
  }
  // Method to handle POST method request.
  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");
      doGet(request, response);
  }
}
