/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bebou
 */
public class CommandItfIT {
    
    public CommandItfIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class CommandItf.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Command command = null;
        CommandItf instance = new CommandItfImpl();
        instance.add(command);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCommands method, of class CommandItf.
     */
    @Test
    public void testListCommands() {
        System.out.println("listCommands");
        CommandItf instance = new CommandItfImpl();
        List<Command> expResult = null;
        List<Command> result = instance.listCommands();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CommandItfImpl implements CommandItf {

        public void add(Command command) {
        }

        public List<Command> listCommands() {
            return null;
        }
    }
    
}
