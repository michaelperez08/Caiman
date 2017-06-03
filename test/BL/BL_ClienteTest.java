/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

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
public class BL_ClienteTest {
    
    public BL_ClienteTest() {
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
     * Test of insertarCliente method, of class BL_Cliente.
     */
    @Test
    public void testInsertarCliente() {
        System.out.println("insertarClienteBL");
        String Nombre = "Vanesa Alfaro PruebaBL";
        String direccio_simple = "Los Chiles, Aguazarcas, Alajuela";
        String direccio_exacta = "por la interseccion donde hay un perro pintado echado";
        String Cedula = "501110222";
        String Telefonos = "87451263";
        BL_Cliente instance = new BL_Cliente();
        boolean expResult = true;
        boolean result = instance.insertarCliente(Nombre, direccio_simple, direccio_exacta, Cedula, Telefonos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of modificarCliente method, of class BL_Cliente.
     */
    @Test
    public void testModificarCliente() {
        System.out.println("modificarCliente");
        int idCliente = 7;
        String Nombre = "Juan Rodriguez PModifica";
        String direccion_simple = "Sarchi, Alajuela, Costa Rica";
        String dirreccion_exacta = "haaayyy yaaa yyaaa, cantaa y si llores";
        String Cedula = "209840336";
        String Telefonos = "22222222 111111111";
        BL_Cliente instance = new BL_Cliente();
        boolean expResult = true;
        boolean result = instance.modificarCliente(idCliente, Nombre, direccion_simple, dirreccion_exacta, Cedula, Telefonos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult) {
         fail("The test case is fail.");
        }
    }

    /**
     * Test of cargarClientes method, of class BL_Cliente.
     */
    @Test
    public void testCargarClientes() {
        System.out.println("cargarClientes");
        BL_Cliente instance = new BL_Cliente();
        ArrayList<BL_Cliente> expResult = null;
        ArrayList<BL_Cliente> result = instance.cargarClientes();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result == null){
         fail("The test case is fail.");
        }
    }

    /**
     * Test of eliminarCliente method, of class BL_Cliente.
     */
    @Test
    public void testEliminarCliente() {
        System.out.println("eliminarCliente");
        BL_Cliente instance = new BL_Cliente();
        instance.setIdCliente(27);
        boolean expResult = true;
        boolean result = instance.eliminarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
        fail("The test case is fail.");
        }
    }    
}
