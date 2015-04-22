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
public class BookRemIT {
    
    public BookRemIT() {
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
     * Test of add method, of class BookRem.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Book book = null;
        BookRem instance = new BookRem();
        instance.add(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class BookRem.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Book book = null;
        BookRem instance = new BookRem();
        instance.remove(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class BookRem.
     */
    @Test
    public void testSearch() throws Exception {
        System.out.println("search");
        String title = "";
        BookRem instance = new BookRem();
        List<Book> expResult = null;
        List<Book> result = instance.search(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listBooks method, of class BookRem.
     */
    @Test
    public void testListBooks() throws Exception {
        System.out.println("listBooks");
        BookRem instance = new BookRem();
        List<Book> expResult = null;
        List<Book> result = instance.listBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAuthors method, of class BookRem.
     */
    @Test
    public void testListAuthors() throws Exception {
        System.out.println("listAuthors");
        BookRem instance = new BookRem();
        List<String> expResult = null;
        List<String> result = instance.listAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
