/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import java.util.List;
import javax.ejb.Remote;
import javax.persistence.Query;
/**
 *
 * @author ziad
 */

@Stateless(mappedName="BookService")
@Remote(BookItf.class)
public class BookRem implements BookItf {
    @PersistenceContext(unitName = "book-unit")
    EntityManager Entity;
    
    /**
     * Add a book
     * @param book The book to add
     */
    public void add(Book book) {
        Entity.persist(book);
    }
    
    /**
     * Remove a book
     * @param book the book to remove
     */
    public void remove(Book book) {
        Entity.remove(book);
    }
    
    /**
     * Search a book la recherche d'un livre.
     * @param title A word from the book to search
     * @return The list of books
     */
    public List<Book> search(String title) {
        String search = "SELECT b FROM Book b WHERE b.title LIKE '%"+title+"%'";
        Query se = Entity.createQuery(search);
        return se.getResultList();
    }
    
    /**
     * List the books
     * @return The list of books
     */
    public List<Book> listBooks() {
        return Entity.createQuery("SELECT b FROM Book b ORDER BY b.title").getResultList();
    }
    
    /**
     * List all the authors
     * @return List of authors
     */
    public List<String> listAuthors() {
        return Entity.createQuery("SELECT DISTINCT b.author FROM Book b ORDER BY b.author").getResultList();
    }
    
}  
