/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import entity.Command;
import entity.CommandItf;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.EJBException;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ziad
 */
@Stateless
public class CommandService implements SessionBean {

    private CommandItf lookUp() throws NamingException{
            Context context = new InitialContext();
            CommandItf stocks = (CommandItf) context.lookup("CommandService");
            return stocks;
    }
       
    public List<Command> listCommands() throws NamingException  {      
       return this.lookUp().listCommands();
    }

    public void addCommand(String user, String title) throws NamingException {       
       this.lookUp().add(new Command(user,title));
    }
    
    @Override
    public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {
      
    }

    @Override
    public void ejbRemove() throws EJBException, RemoteException {
        
    }

    @Override
    public void ejbActivate() throws EJBException, RemoteException {
    
    }

    @Override
    public void ejbPassivate() throws EJBException, RemoteException {
        
    }
}
