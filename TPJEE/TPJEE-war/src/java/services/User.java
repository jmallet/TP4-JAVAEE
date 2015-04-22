/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import entity.Client;
import entity.UsersItf;
import java.io.IOException;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.EJBException;
import java.rmi.RemoteException;

/**
 *
 * @author ziad
 */

@Stateless
public class User implements SessionBean {

    /**
     * Find the users
     * @return UsersItf
     * @throws NamingException
     */
    private UsersItf lookUp() throws NamingException  {
            Context context = new InitialContext();
            UsersItf stocks = (UsersItf) context.lookup("UserService");
            return stocks;
        
    }
    
    /**
     * Allow to add a user 
     * @param pseudo the user's pseudo
     * @param password 
     * @throws NamingException
     */
    public void add(String pseudo, String password) throws NamingException  {
        this.lookUp().add(new Client(pseudo,password));
       
    }
    
    /**
    * Check if the couple user password is ok
    * @param login
     * @param password 
     * @return True if Ok false otherwise
     * @throws NamingException
     */
    public boolean CheckCouple(String login, String password) throws NamingException  {       
       Client c = this.lookUp().search(login);
       
       return c != null && c.getPassword().equals(password);
    }
   
    
    
    @Override
    public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ejbRemove() throws EJBException, RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ejbActivate() throws EJBException, RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ejbPassivate() throws EJBException, RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
