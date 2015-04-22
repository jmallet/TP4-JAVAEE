/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.Command;
import java.util.List;
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
public class CommandServiceIT {
    
    public CommandServiceIT() {
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
     * Test of listCommands method, of class CommandService.
     */
    @Test
    public void testListCommands() throws Exception {
        System.out.println("listCommands");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommandService instance = (CommandService)container.getContext().lookup("java:global/classes/CommandService");
        List<Command> expResult = null;
        List<Command> result = instance.listCommands();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCommand method, of class CommandService.
     */
    @Test
    public void testAddCommand() throws Exception {
        System.out.println("addCommand");
        String user = "";
        String title = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommandService instance = (CommandService)container.getContext().lookup("java:global/classes/CommandService");
        instance.addCommand(user, title);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSessionContext method, of class CommandService.
     */
    @Test
    public void testSetSessionContext() throws Exception {
        System.out.println("setSessionContext");
        SessionContext ctx = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommandService instance = (CommandService)container.getContext().lookup("java:global/classes/CommandService");
        instance.setSessionContext(ctx);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejbRemove method, of class CommandService.
     */
    @Test
    public void testEjbRemove() throws Exception {
        System.out.println("ejbRemove");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommandService instance = (CommandService)container.getContext().lookup("java:global/classes/CommandService");
        instance.ejbRemove();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejbActivate method, of class CommandService.
     */
    @Test
    public void testEjbActivate() throws Exception {
        System.out.println("ejbActivate");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommandService instance = (CommandService)container.getContext().lookup("java:global/classes/CommandService");
        instance.ejbActivate();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejbPassivate method, of class CommandService.
     */
    @Test
    public void testEjbPassivate() throws Exception {
        System.out.println("ejbPassivate");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CommandService instance = (CommandService)container.getContext().lookup("java:global/classes/CommandService");
        instance.ejbPassivate();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
