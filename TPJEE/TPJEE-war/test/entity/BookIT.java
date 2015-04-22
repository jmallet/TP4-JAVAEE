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
public class BookIT {
    
    public BookIT() {
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
     * Test of getTitle method, of class Book.
     */
    @Test
    public void testGetTitle() {
        Book book1 = new Book("title","author",2015);
        assertEquals("title", book1.getTitle());       
    }

    /**
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        Book book1 = new Book("title","author",2015);
        assertEquals("author", book1.getAuthor());   
    }

    /**
     * Test of getDate method, of class Book.
     */
    @Test
    public void testGetDate() {
        Book book1 = new Book("title","author",2015);
        assertEquals(2015, book1.getDate());   
    }

    /**
     * Test of hashCode method, of class Book.
     */
    @Test
    public void testHashCode() {
        Book book1 = new Book("title","author",2015);
        assertEquals(110371416, book1.hashCode());   
    }

    /**
     * Test of equals method, of class Book.
     */
    @Test
    public void testEquals() {
        Book book1 = new Book("title","author",2015);
        Book book2 = new Book("title","author",2015);
        Book book3 = new Book("aaaaa","aaaaa",2222);
        assertTrue(book1.equals(book2));
        assertFalse(book1.equals(book3));
    }
    
}
