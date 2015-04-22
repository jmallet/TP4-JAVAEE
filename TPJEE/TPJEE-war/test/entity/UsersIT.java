/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
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
public class UsersIT {
    
    public UsersIT() {
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
     * Test of add method, of class Users.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Client user = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsersItf instance = (UsersItf)container.getContext().lookup("java:global/classes/Users");
        instance.add(user);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class Users.
     */
    @Test
    public void testSearch() throws Exception {
        System.out.println("search");
        String login = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsersItf instance = (UsersItf)container.getContext().lookup("java:global/classes/Users");
        Client expResult = null;
        Client result = instance.search(login);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUsers method, of class Users.
     */
    @Test
    public void testListUsers() throws Exception {
        System.out.println("listUsers");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UsersItf instance = (UsersItf)container.getContext().lookup("java:global/classes/Users");
        List<Client> expResult = null;
        List<Client> result = instance.listUsers();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
