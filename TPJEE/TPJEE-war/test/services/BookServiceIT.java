/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.Book;
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
public class BookServiceIT {
    
    public BookServiceIT() {
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
     * Test of add method, of class BookService.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        String title = "";
        String author = "";
        int annee = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookService instance = (BookService)container.getContext().lookup("java:global/classes/BookService");
        instance.add(title, author, annee);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class BookService.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Book book = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookService instance = (BookService)container.getContext().lookup("java:global/classes/BookService");
        instance.remove(book);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAuthors method, of class BookService.
     */
    @Test
    public void testListAuthors() throws Exception {
        System.out.println("listAuthors");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookService instance = (BookService)container.getContext().lookup("java:global/classes/BookService");
        List<String> expResult = null;
        List<String> result = instance.listAuthors();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listBooks method, of class BookService.
     */
    @Test
    public void testListBooks() throws Exception {
        System.out.println("listBooks");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookService instance = (BookService)container.getContext().lookup("java:global/classes/BookService");
        List<Book> expResult = null;
        List<Book> result = instance.listBooks();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchBook method, of class BookService.
     */
    @Test
    public void testSearchBook() throws Exception {
        System.out.println("searchBook");
        String title = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookService instance = (BookService)container.getContext().lookup("java:global/classes/BookService");
        List<Book> expResult = null;
        List<Book> result = instance.searchBook(title);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSessionContext method, of class BookService.
     */
    @Test
    public void testSetSessionContext() throws Exception {
        System.out.println("setSessionContext");
        SessionContext ctx = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookService instance = (BookService)container.getContext().lookup("java:global/classes/BookService");
        instance.setSessionContext(ctx);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejbRemove method, of class BookService.
     */
    @Test
    public void testEjbRemove() throws Exception {
        System.out.println("ejbRemove");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookService instance = (BookService)container.getContext().lookup("java:global/classes/BookService");
        instance.ejbRemove();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejbActivate method, of class BookService.
     */
    @Test
    public void testEjbActivate() throws Exception {
        System.out.println("ejbActivate");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookService instance = (BookService)container.getContext().lookup("java:global/classes/BookService");
        instance.ejbActivate();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejbPassivate method, of class BookService.
     */
    @Test
    public void testEjbPassivate() throws Exception {
        System.out.println("ejbPassivate");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookService instance = (BookService)container.getContext().lookup("java:global/classes/BookService");
        instance.ejbPassivate();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
