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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author bebou
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({entity.UsersItfIT.class, entity.BookItfIT.class, entity.CommandIT.class, entity.ClientIT.class, entity.CommandsIT.class, entity.BookRemIT.class, entity.CommandItfIT.class, entity.UsersIT.class, entity.BookIT.class})
public class EntityITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
