package com.example.homework1.controller;

import com.example.homework1.models.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet(name = "listservelet", value = "/list")
public class ListServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num_raw = req.getParameter("num");
        int num = 0;
        try {
            num = Integer.parseInt(num_raw);
            int id, age;
            String name;
            boolean g;
            String[] n = {"A", "B", "C", "D", "E", "F", "G"};
            Random r = new Random();
            List<Student> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                id = i + 1;
                g = r.nextBoolean();
                if (g) {
                    name = "Mr" + n[r.nextInt(n.length)];
                } else {
                    name = "Ms" + n[r.nextInt(n.length)];
                }
                age = r.nextInt(23 - 19) + 19;
                Student student = new Student(id, age, name, g);
                list.add(student);
            }
            req.setAttribute("data", list);
            req.getRequestDispatcher("list.jsp").forward(req, resp);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
