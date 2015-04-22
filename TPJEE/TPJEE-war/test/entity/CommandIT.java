/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

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
public class CommandIT {
    
    public CommandIT() {
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
     * Test of getTitle method, of class Command.
     */
    @Test
    public void testGetTitle() {
        Command command1 = new Command("user1", "titre1");
        assertEquals("titre1",command1.getTitle());
    }

    /**
     * Test of getUser method, of class Command.
     */
    @Test
    public void testGetUser() {
        Command command1 = new Command("user1", "titre1");
        assertEquals("user1",command1.getUser());
    }

    
}
