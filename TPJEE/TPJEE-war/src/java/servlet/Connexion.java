/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import services.User;
import javax.servlet.http.*; 
import javax.servlet.*; 
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.NamingException;
import javax.servlet.annotation.WebServlet;
/**
 *
 * @author ziad
 */
@WebServlet(name="Connexion", urlPatterns={"/Connexion"})
public class Connexion extends HttpServlet {
    
    @EJB
    User user1;

 
    protected void processRequest(HttpServletRequest request,  HttpServletResponse response)
            throws ServletException, IOException, NamingException {
        
        try {
            String us = request.getParameter("user");
            String mdp = request.getParameter("password");
            
            if (!user1.CheckCouple(us, mdp)) {
                response.sendRedirect(response.encodeRedirectURL("ex3-index.jsp"));
            }
            else {
                HttpSession session = request.getSession(true);
                session.setAttribute( "LOGIN", us );
                response.sendRedirect(response.encodeRedirectURL("ex3.jsp"));
            }
           
            
        } catch (IOException ex) {
        }
        
        
    }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }   

    
}
