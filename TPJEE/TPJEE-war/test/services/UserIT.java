/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.ejb.SessionContext;
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
public class UserIT {
    
    public UserIT() {
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
     * Test of add method, of class User.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        String pseudo = "";
        String password = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        User instance = (User)container.getContext().lookup("java:global/classes/User");
        instance.add(pseudo, password);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckCouple method, of class User.
     */
    @Test
    public void testCheckCouple() throws Exception {
        System.out.println("CheckCouple");
        String login = "";
        String password = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        User instance = (User)container.getContext().lookup("java:global/classes/User");
        boolean expResult = false;
        boolean result = instance.CheckCouple(login, password);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSessionContext method, of class User.
     */
    @Test
    public void testSetSessionContext() throws Exception {
        System.out.println("setSessionContext");
        SessionContext ctx = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        User instance = (User)container.getContext().lookup("java:global/classes/User");
        instance.setSessionContext(ctx);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejbRemove method, of class User.
     */
    @Test
    public void testEjbRemove() throws Exception {
        System.out.println("ejbRemove");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        User instance = (User)container.getContext().lookup("java:global/classes/User");
        instance.ejbRemove();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejbActivate method, of class User.
     */
    @Test
    public void testEjbActivate() throws Exception {
        System.out.println("ejbActivate");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        User instance = (User)container.getContext().lookup("java:global/classes/User");
        instance.ejbActivate();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejbPassivate method, of class User.
     */
    @Test
    public void testEjbPassivate() throws Exception {
        System.out.println("ejbPassivate");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        User instance = (User)container.getContext().lookup("java:global/classes/User");
        instance.ejbPassivate();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
