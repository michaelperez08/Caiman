/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TO_Cliente;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author victor
 */
public class DAO_ClienteTest {
    
    public DAO_ClienteTest() {
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
     * Test of ingresarCliente method, of class DAO_Cliente.
     */
    @Test
    public void testIngresarCliente() {
        System.out.println("ingresarCliente");
        String nombre = "";
        String direccion_simple = "";
        String direccion_exacta = "";
        String cedula = "";
        String telefonos = "";
        DAO_Cliente instance = new DAO_Cliente();
        boolean expResult = false;
        boolean result = instance.ingresarCliente(nombre, direccion_simple, direccion_exacta, cedula, telefonos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarCliente method, of class DAO_Cliente.
     */
    @Test
    public void testModificarCliente() {
        System.out.println("modificarCliente");
        int idCliente = 0;
        String nombre = "";
        String direccion_simple = "";
        String direccion_exacta = "";
        String cedula = "";
        String telefonos = "";
        DAO_Cliente instance = new DAO_Cliente();
        boolean expResult = false;
        boolean result = instance.modificarCliente(idCliente, nombre, direccion_simple, direccion_exacta, cedula, telefonos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarClientes method, of class DAO_Cliente.
     */
    @Test
    public void testCargarClientes() {
        System.out.println("cargarClientes");
        DAO_Cliente instance = new DAO_Cliente();
        ArrayList<TO_Cliente> expResult = null;
        ArrayList<TO_Cliente> result = instance.cargarClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarCliente method, of class DAO_Cliente.
     */
    @Test
    public void testEliminarCliente() {
        System.out.println("eliminarCliente");
        int idCliente = 0;
        DAO_Cliente instance = new DAO_Cliente();
        boolean expResult = false;
        boolean result = instance.eliminarCliente(idCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
