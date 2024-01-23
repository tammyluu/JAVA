package com.example.homework1;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/toto")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello TAM!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        String text = "java";
        out.println("<h1 style='color:blue'>" + message + " classe: " + text + "</h1>");
        String u = request.getParameter("user");
        String pw = request.getParameter("pw");
        if (u.equalsIgnoreCase("tam") && pw.equalsIgnoreCase("123")) {
            out.println("<h1 style='color:blue'> Welcome to " + u + "</h1>");
        }else {
            response.sendRedirect("index.jsp");
        }

        out.println("</body></html>");
    }

    public void destroy() {
    }
}