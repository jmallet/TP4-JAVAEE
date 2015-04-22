/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;


import javax.ejb.Remote;
import java.util.List;

/**
 *
 * @author ziad
 */
  @Remote
public interface UsersItf {
    
    /**
     * Add a user.
     * @param the user to add
     */
    public void add(Client user);
    
    /**
     * Search a user with his login
     * @param the login
     * @return the user
     */
    public Client search(String login);
    
    /**
     * List all the users
     * @return The users
     */
    public List<Client> listUsers();
}  
