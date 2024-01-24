package com.example.produit.servlet;

import com.example.produit.entities.User;
import com.example.produit.service.UserService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {
    private UserService userService;
    @Override
    public void init() throws ServletException {
        userService = new UserService();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("msg", "");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login-form.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("msg", "");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        User theLastestUser = (User) req.getSession(false).getAttribute("theLastestUser");

        if(theLastestUser != null && email.equalsIgnoreCase(theLastestUser.getEmail()) && password.equals(theLastestUser.getPassword())) {
            //login thanh congg
            resp.sendRedirect("welcome");
        } else {
            //login failed
            req.setAttribute("msg", "Infos non exact!");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
            dispatcher.forward(req, resp);
        }


    }
}
