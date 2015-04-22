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

 @WebServlet(name="inscription", urlPatterns={"/inscription"})
public class Inscription extends HttpServlet {   
    @EJB
    User user1;
   
    
    protected void processRequest(HttpServletRequest request,  HttpServletResponse response)
            throws ServletException, IOException, NamingException {
        
        try {
            String user = request.getParameter("user");
            String password = request.getParameter("password");
            user1.add(user, password);
            response.sendRedirect(response.encodeRedirectURL("ex3-index.jsp"));
            
        } catch (IOException ex) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
   
}
