package com.example.produit.servlet;

import com.example.produit.entities.Produit;
import com.example.produit.service.ProduitService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.util.List;

@WebServlet(name="produit", value = "/produit")
public class ProduitServlet extends HttpServlet {
    private List<Produit> produitList;
    private ProduitService produitService;

    @Override
    public void init() throws ServletException {
        produitService = new ProduitService();

    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String marque = req.getParameter("marque");
        String ref = req.getParameter("reference");
        String dateAchat = req.getParameter("dateAchat");
        double prix = Double.parseDouble(req.getParameter("prix"));
       /* int stock = Integer.parseInt(req.getParameter("stock"));
        Produit produit = new Produit(marque,ref,dateAchat,prix);
        produitService.create(produit);*/
        //pour dans personnses dans jsp
        req.setAttribute("produits",produitList);
        // s'interesse une fois request, une fois reponse
        req.getRequestDispatcher("add-produit-form.jsp").forward(req,resp);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        produitList = produitService.findAll();
        req.setAttribute("produits",produitList);
        // s'interesse une fois request, une fois reponse
        req.getRequestDispatcher("list-produits.jsp").forward(req,resp);

        //Afficher la liste des produits dont le prix est supérieur à 100 euros
        try {
            List<Produit> produitsFiltre = produitService.filterByPrice(20);
            req.setAttribute("produitFiltre",produitsFiltre);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Forward vers la page JSP
        req.getRequestDispatcher("list-produits.jsp").forward(req, resp);

    }
}
