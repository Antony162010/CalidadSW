/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unmsm.edu.pe.calidadsw.dao.component;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import unmsm.edu.pe.calidadsw.dao.model.Client;

/**
 *
 * @author Antony
 */
public class ClientDAOTest {

    public ClientDAOTest() {
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
     * Test of create method, of class ClientDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Client client = new Client("72410501", "Antony", "Montalvo", new Date(1998, 11, 16), "933310680",
                "antonis162010@gmail.com", "antonis1620", "123456789");
        ClientDAO instance = new ClientDAO();
        boolean expResult = true;
        boolean result = instance.create(client);
        assertEquals(expResult, result);
    }

}
