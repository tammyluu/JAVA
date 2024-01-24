package com.example.produit.servlet;

import com.example.produit.entities.Produit;
import com.example.produit.service.ProduitService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.exception.ConstraintViolationException;

import java.io.IOException;

import java.util.List;

@WebServlet(name="produit", value = "/produit")
public class ProduitServlet extends HttpServlet {
    private List<Produit> produitList;
    private ProduitService produitService;

    @Override
    public void init() throws ServletException {
        produitService = new ProduitService();
        produitList = produitService.findAll();

    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String marque = req.getParameter("marque");
        String ref = req.getParameter("reference");
        //String dateAchat = req.getParameter("dateAchat");
        double prix = 0;
        int stock = 0;
        try {
            prix = Double.parseDouble(req.getParameter("prix"));
            stock = Integer.parseInt(req.getParameter("stock"));
        } catch (ConstraintViolationException e) {
            System.out.println(e.getMessage());
        }

        Produit produit = new Produit(marque, ref, prix, stock);
        produitService.create(produit);
        req.setAttribute("message", "Bien ajouté");

        req.setAttribute("produits", produitList);
        // s'interesse une fois request, une fois reponse
        req.getRequestDispatcher("add-produit-form.jsp").forward(req, resp);


        //return marque;
        //return marque;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        produitList = produitService.findAll();
        req.setAttribute("produits",produitList);
        // s'interesse une fois request, une fois reponse
        req.getRequestDispatcher("list-produits.jsp").forward(req,resp);



    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id=  Integer.valueOf(req.getParameter("id"));
        Produit produit = produitService.findById(id);
        produitService.delete(produit);
        req.setAttribute("produit" ,produit);
        resp.getWriter().println("supprimé !!");
        resp.sendRedirect("list-produits.jsp");

        }


}
