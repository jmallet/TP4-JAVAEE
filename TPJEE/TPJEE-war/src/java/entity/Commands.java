/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ziad
 */
@Stateless(mappedName="Commands")
@Remote(CommandItf.class)
public class Commands implements CommandItf {
    
    @PersistenceContext(unitName = "command-unit")
    EntityManager Entity;
    
    /**
     * Add a command.
     * @param the command to add
     */
    public void add(Command command) {
        Entity.persist(command);
    }
    
   
    /**
     * List all the commands
     * @return The commands
     */
    public List<Command> listCommands() {
        return Entity.createQuery("SELECT c FROM Command c ORDER BY c.user").getResultList();
    }
    
}
