package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Error404Servlet")
public class Error404Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=utf-8");
        // resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<h2 style='color:red'>404 Нетути такой страницы</h2>" );
    }
}
