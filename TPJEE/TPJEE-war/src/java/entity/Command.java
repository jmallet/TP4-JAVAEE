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
 * a command has a title and a name user
 */
@Entity
public class Command implements Serializable {
        
    @Id
    private String title;
    
    @Id
    private String user;
    
/**
 * the constructor command
 * @param user
 * @param book 
 */
    public Command(String user ,String book) {
        this.user = user;
        this.title = book;
    }
    
    /**
     * return the title
     * @return 
     */
    public String getTitle() {
        return this.title;
    }
    
    /**
     * update a title
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    
}  

