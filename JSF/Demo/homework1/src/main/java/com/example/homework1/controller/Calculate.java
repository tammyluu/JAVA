package com.example.homework1.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculate", value = "/calculate") // value = URL-partern
public class Calculate extends HttpServlet {

    public void init() {

    }
    private  String cal (double n1, double n2, String o) {
        String rs = "";
        switch (o) {
            case "+":
                rs = n1 + " + " + n2 + " = " + (n1 + n2);
                break;
            case "-":
                rs = n1 + " - " + n2 + " = " + (n1 - n2);
                break;
            case "*":
                rs = n1 + " * " + n2 + " = " + (n1 * n2);
                break;
            case "/":
                if (n2 == 0) {
                    rs = "divide by zero";
                } else {
                    rs = n1 + " / " + n2 + " = " + (n1 / n2);
                }
                break;
        }
        return rs;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        String o = request.getParameter("op");
        double num1, num2;
        try {
            num1 = Double.parseDouble(n1);
            num2 = Double.parseDouble(n2);
            String rs = cal(num1,num2,o);
                out.println("<h2 style='color:chocolate'> " + rs + "</h2>");
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }

}
