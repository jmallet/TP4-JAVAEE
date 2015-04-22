/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.io.Serializable;

/**
 *
 * @author ziad
 */
public class Client implements Serializable{
         
    @Id
    private String pseudo;
    
    private String password;

    
    /**
     * Constructor of the client.
     * @param pseudo the pseudo of the client
     * @param password 
     */
    public Client(String pseudo, String password) {
        this.pseudo = pseudo;
        this.password = password;
    }

    /**
     * return the pseudo of the client
     * @return le pseudo du client
     */
    public String getPseudo() {
        return this.pseudo;
    }

    /**
     * Sets the pseudo of the client
     * @param pseudo  pseudo of the client
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    
    /**
     * Return the password of the client.
     * @return the password of the client
     */
    public String getPassword() {
        return this.password;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.pseudo != null ? this.pseudo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if (this.pseudo.equals(other.pseudo))
            return true;
        else
            return false;
    }       
}
