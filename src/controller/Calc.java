package controller;

import servlets.MainServlet;

/**
 * Created by Игорь on 13.07.2017.
 */
public class Calc  {

    public ICalc plus = (n, m) -> n + m;
    public ICalc minus = (n, m) -> n - m;
    public ICalc multiply = (n, m) -> n * m;
    public ICalc divide = (n, m) -> n / m;

    MainServlet mainServlet = new MainServlet();
    /*int a = Integer.parseInt(mainServlet.request.getParameter("one"));
    int b = Integer.parseInt(request.getParameter("two"));*/


}
