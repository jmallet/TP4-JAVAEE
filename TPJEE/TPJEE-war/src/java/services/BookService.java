/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.Book;
import entity.BookItf;
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
public class BookService implements SessionBean {
    
    private BookItf lookUp()  throws NamingException{
            Context context = new InitialContext();
            BookItf stocks = (BookItf) context.lookup("BookService");
            return stocks;
    }
    
  
    public void add(String title, String author, int annee) throws NamingException {
       this.lookUp().add(new Book(title,author, annee));
    }
    
   
    public void remove(Book book) throws NamingException {
        this.lookUp().remove(book);
    }
    
    public List<String> listAuthors() throws NamingException {
       return this.lookUp().listAuthors();
    }
    
    public List<Book> listBooks() throws NamingException {      
       return this.lookUp().listBooks();
    }
    
    public List<Book> searchBook(String title) throws NamingException { 
       return this.lookUp().search(title);
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
