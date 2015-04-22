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
public class BookItfIT {
    
    public BookItfIT() {
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
     * Test of add method, of class BookItf.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Book book = null;
        BookItf instance = new BookItfImpl();
        instance.add(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class BookItf.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Book book = null;
        BookItf instance = new BookItfImpl();
        instance.remove(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class BookItf.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String title = "";
        BookItf instance = new BookItfImpl();
        List<Book> expResult = null;
        List<Book> result = instance.search(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listBooks method, of class BookItf.
     */
    @Test
    public void testListBooks() {
        System.out.println("listBooks");
        BookItf instance = new BookItfImpl();
        List<Book> expResult = null;
        List<Book> result = instance.listBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAuthors method, of class BookItf.
     */
    @Test
    public void testListAuthors() {
        System.out.println("listAuthors");
        BookItf instance = new BookItfImpl();
        List<String> expResult = null;
        List<String> result = instance.listAuthors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BookItfImpl implements BookItf {

        public void add(Book book) {
        }

        public void remove(Book book) {
        }

        public List<Book> search(String title) {
            return null;
        }

        public List<Book> listBooks() {
            return null;
        }

        public List<String> listAuthors() {
            return null;
        }
    }
    
}
