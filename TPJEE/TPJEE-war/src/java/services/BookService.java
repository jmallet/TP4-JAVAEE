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
 * a Service Book
 */
@Stateless
public class BookService implements SessionBean {
    
    /**
     * find a book
     * @return
     * @throws NamingException 
     */
    private BookItf lookUp()  throws NamingException{
            Context context = new InitialContext();
            BookItf stocks = (BookItf) context.lookup("BookService");
            return stocks;
    }
    
    /**
     * add a book
     * @param title
     * @param author
     * @param annee
     * @throws NamingException 
     */
    public void add(String title, String author, int annee) throws NamingException {
       this.lookUp().add(new Book(title,author, annee));
    }
    
   /**
    * remove a book
    * @param book
    * @throws NamingException 
    */
    public void remove(Book book) throws NamingException {
        this.lookUp().remove(book);
    }
    
    /**
     * display the list authors
     * @return
     * @throws NamingException 
     */
    public List<String> listAuthors() throws NamingException {
       return this.lookUp().listAuthors();
    }
    
    /**
     * display the list books
     * @return
     * @throws NamingException 
     */
    public List<Book> listBooks() throws NamingException {      
       return this.lookUp().listBooks();
    }
    
    /**
     * search a book in a list book
     * @param title
     * @return
     * @throws NamingException 
     */
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
