/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;

/**
 * interface commandeItf
 * @author ziad
 */
public interface CommandItf {
    
       public void add(Command command);
    
    /**
     * List all the commands.
     * @return All the commands
     */
    public List<Command> listCommands();
       
}
