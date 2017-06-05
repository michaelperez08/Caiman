/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TO_Cliente;
import config.ConfBD;
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
        ConfBD confdb = new ConfBD();
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
        System.out.println("ingresarClienteDAO");
        String nombre = "Vanesa Alfaro Murillo";
        String direccion_simple = "Los Chiles, San Carlo, Alajuela";
        String direccion_exacta = "por la interseccion donde hay un perro echado";
        String cedula = "102220333";
        String telefonos = "45458585";
        DAO_Cliente instance = new DAO_Cliente();
        boolean expResult = true;
        boolean result = instance.ingresarCliente(nombre, direccion_simple, direccion_exacta, cedula, telefonos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("The test case is fail.");
        }
    }

    /**
     * Test of modificarCliente method, of class DAO_Cliente.
     */
    @Test
    public void testModificarCliente() {
        System.out.println("modificarCliente");
        int idCliente = 7;
        String nombre = "Juan Rodriguez Arguedas";
        String direccion_simple = "Sarchi, Alajuela, Costa Rica";
        String direccion_exacta = "haaayyy yaaa yyaaa, cantaa y no llores";
        String cedula = "209840336";
        String telefonos = "22222222 111111111";
        DAO_Cliente instance = new DAO_Cliente();
        boolean expResult = true;
        boolean result = instance.modificarCliente(idCliente, nombre, direccion_simple, direccion_exacta, cedula, telefonos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult) {
        fail("The test case is fail.");
        }
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
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result == null){
         fail("The test case is fail.");
        }
    }

    /**
     * Test of eliminarCliente method, of class DAO_Cliente.
     */
    @Test
    public void testEliminarCliente() {
        System.out.println("eliminarCliente");
        int idCliente = 10;
        DAO_Cliente instance = new DAO_Cliente();
        boolean expResult = true;
        boolean result = instance.eliminarCliente(idCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if(result != expResult){
        fail("The test case is a prototype.");
         }
    }
    
}
