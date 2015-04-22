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

/**
 *
 * @author ziad
 */
 @Stateless(mappedName="UserService")
@Remote(UsersItf.class)
public class Users implements UsersItf {
    
    @PersistenceContext(unitName = "user-unit")
    EntityManager Entity;    
    /**
     * Add a user
     * @param user to add
     */
    public void add(Client user) {
        Entity.persist(user);
    }
    
    /**
     * Searsh a user with his login.
     * @param login 
     * @return the user
     */
    public Client search(String login) {
        return Entity.find(Client.class, login);
    }
    
    /**
     * List all the users.
     * @return the users
     */
    public List<Client> listUsers() {
        return Entity.createQuery("SELECT u FROM Client u ORDER BY u.pseudo").getResultList();
    }
    
}
