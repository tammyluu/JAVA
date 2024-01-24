package com.example.homework1.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login", value = "/login") // value = URL-partern

public class Login extends HttpServlet {
    private String message;
    public void init() {
        message = "Hello !";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        String text = "java";
        out.println("<h1 style='color:blue'>" + message + " classe: " + text + "</h1>");
        //take value from form
        String u = request.getParameter("user");
        String pw = request.getParameter("pw");
        out.println("<h1 style='color:blue'> Welcome to " + u.toUpperCase() + "</h1>");
        // take value ( get servlet) from context-parameter init params

        /*if (u.equalsIgnoreCase("tam") && pw.equalsIgnoreCase("123")) {
            out.println("<h1 style='color:blue'> Welcome to " + u.toUpperCase() + "</h1>");
        }else {
            response.sendRedirect("login.html");
        }*/
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    public void destroy() {
    }
}
