/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import javax.ejb.Remote;
import java.util.List;
/**
 *interface BookItf
 * @author ziad
 */

public interface BookItf {
  
    /**
     * Add a book
     * @param book the book to add
     */
    public void add(Book book);
    
    /**
     * Remove a book
     * @param book the book to remove
     */
    public void remove(Book book);
    
    /**
     * Allow to search a book
     * @param title a word from the book
     * @return The list of books
     */
    public List<Book> search(String title);
    
    /**
     * List of books
     * @return The list of books
     */
    public List<Book> listBooks();
    
    /**
     * List of authors
     * @return The list of authors
     */
    public List<String> listAuthors();
}
