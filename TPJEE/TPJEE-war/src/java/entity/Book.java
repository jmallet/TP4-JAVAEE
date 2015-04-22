/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author ziad
 */
@Entity
public class Book implements Serializable {
        
    @Id
    private String title;
    
    private String author;
    
    private int date;
    
    /**
     * Constructor of the book
     * @param title the title of the book
     * @param author the author of the book
     * @param date the date of the book
     */
    public Book(String title ,String author, int date) {
        this.author = author;
        this.date = date;
        this.title = title;
    }

    /**
     * Get the title of the book.
     * @return The title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * The author of the book
     * @return the author of the book
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Get the date of the book
     * @return Get the date of the book
     */
    public int getDate() {
        return this.date;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.title != null ? this.title.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if (this.title.equals(other.title) && this.date == other.date &&
                this.author.equals(other.author)) {
            return true;
        }
        return false;
    }
}
