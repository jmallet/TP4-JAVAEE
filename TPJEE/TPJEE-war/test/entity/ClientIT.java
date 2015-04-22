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
public class ClientIT {
    
    public ClientIT() {
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
     * Test of getPseudo method, of class Client.
     */
    @Test
    public void testGetPseudo() {
        Client client1 = new Client("pseudo1", "pass");
        assertEquals("pseudo1", client1.getPseudo());
    }


    /**
     * Test of getPassword method, of class Client.
     */
    @Test
    public void testGetPassword() {
        Client client1 = new Client("pseudo1", "pass");
        assertEquals("pass", client1.getPassword());
    }

    /**
     * Test of hashCode method, of class Client.
     */
    @Test
    public void testHashCode() {
        Client client1 = new Client("pseudo1", "pass");
        assertEquals(-289589709, client1.hashCode());
    }

    /**
     * Test of equals method, of class Client.
     */
    @Test
    public void testEquals() {
        Client client1 = new Client("pseudo1", "pass");
        Client client2 = new Client("pseudo1", "pass");
        Client client3 = new Client("pseudo3", "pass3");
        assertTrue(client1.equals(client2));
        assertFalse(client1.equals(client3));
    }
    
}
