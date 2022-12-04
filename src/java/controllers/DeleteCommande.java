/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Commande;
import entities.LigneCommande;
import entities.LigneCommandePK;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.CommandeServices;
import services.LigneCommandeServices;

/**
 *
 * @author DELL
 */
@WebServlet(name = "DeleteCommande", urlPatterns = {"/DeleteCommande"})
public class DeleteCommande extends HttpServlet {
    CommandeServices cs = new  CommandeServices();
    LigneCommandePK lcpk = new LigneCommandePK();
    LigneCommandeServices lcs = new LigneCommandeServices();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
      int idcommande=  lcpk.getCommandeId();
        
       // Commande commande = cs.findCommandeById(id);
       // cs.deleteCommande(commande);
         LigneCommande lignecm = lcs.findById(id);
         response.getWriter().append(""+lignecm);
       // lcs.delete(lignecm);
       // response.getWriter().append("supprimer");
     //   response.sendRedirect("../panier.jsp");
    //  cs.delete(cs.findById(id));
      //response.sendRedirect("panier.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
