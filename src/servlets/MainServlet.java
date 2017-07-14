package servlets;

import controller.Calc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MainServlet")
public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=utf-8");
        HttpSession session = request.getSession();

        Calc calc = new Calc();
        int a = Integer.parseInt(request.getParameter("one"));
        int b = Integer.parseInt(request.getParameter("two"));
        double c = calc.multiply.calculate(a, b);

        PrintWriter out = response.getWriter();
        out.println("<h2 style='color:blue'>ID сессии = " + session.getId() + "</h2>");
        out.println("<h3 style='color:green'>" + a + "+" + b + "=" + c +"</h2>");

    }
}
