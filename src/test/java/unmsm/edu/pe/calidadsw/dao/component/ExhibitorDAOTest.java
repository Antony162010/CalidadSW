/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unmsm.edu.pe.calidadsw.dao.component;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import unmsm.edu.pe.calidadsw.dao.model.Exhibitor;

/**
 *
 * @author Antony
 */
public class ExhibitorDAOTest {
    
    public ExhibitorDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of create method, of class ExhibitorDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Exhibitor t = null;
        ExhibitorDAO instance = new ExhibitorDAO();
        boolean expResult = false;
        boolean result = instance.create(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class ExhibitorDAO.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        ExhibitorDAO instance = new ExhibitorDAO();
        List<Exhibitor> expResult = null;
        List<Exhibitor> result = instance.read();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}