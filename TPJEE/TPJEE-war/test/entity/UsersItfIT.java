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
public class UsersItfIT {
    
    public UsersItfIT() {
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
     * Test of add method, of class UsersItf.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Client user = null;
        UsersItf instance = new UsersItfImpl();
        instance.add(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class UsersItf.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String login = "";
        UsersItf instance = new UsersItfImpl();
        Client expResult = null;
        Client result = instance.search(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUsers method, of class UsersItf.
     */
    @Test
    public void testListUsers() {
        System.out.println("listUsers");
        UsersItf instance = new UsersItfImpl();
        List<Client> expResult = null;
        List<Client> result = instance.listUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UsersItfImpl implements UsersItf {

        public void add(Client user) {
        }

        public Client search(String login) {
            return null;
        }

        public List<Client> listUsers() {
            return null;
        }
    }
    
}
