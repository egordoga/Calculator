package servlets;

import controller.Calc;
import controller.Sign;

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

        //Calc calc = new Calc();
        double a = Double.parseDouble(request.getParameter("one"));
        double b = Double.parseDouble(request.getParameter("two"));
        String s = request.getParameter("operation");
        Sign sign = Sign.valueOf(s.toUpperCase());
        double c = arithmetic(sign, a, b);
        String res = "" + a + " " + sign.getStringValue() + " " + b + " = " + c;

        PrintWriter out = response.getWriter();
        out.println("<h2 style='color:blue'>ID сессии = " + session.getId() + "</h2>");
        out.println("<h3 style='color:green'>" + res +"</h2>");

    }

    private double arithmetic(Sign sing, double a, double b){
        Calc calc = new Calc();
        double result = 0;
        switch (sing){
            case PLUS:{
                result = calc.plus.calculate(a, b);
                break;
            }
            case MINUS:{
                result = calc.minus.calculate(a, b);
                break;
            }
            case MULTIPLY:{
                result = calc.multiply.calculate(a, b);
                break;
            }
            case DEVIDE:{
                result = calc.divide.calculate(a, b);
                break;
            }

        }
        return result;
    }
}
