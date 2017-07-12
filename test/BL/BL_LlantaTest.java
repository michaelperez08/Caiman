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
 * @author Extreme PC
 */
public class BL_LlantaTest {
    
    public BL_LlantaTest() {
          ConfBD confdb;
         confdb = new ConfBD();
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
     * Test of getidLlanta method, of class BL_Llanta.
     */
    @Test
    public void testIngresarLlanta() {
        System.out.println("IngresarLlanta");
        String numeroLlanta = "12";
        String marca = "Pireli";
        String diseno = "Angosta";
        String numeroCapas = "12";
        int cantidad = 3;
        String tipoLlanta = "Agricola";
        BL_Llanta instance = new BL_Llanta();
        boolean expResult = true;
        boolean result = instance.IngresarLlanta(numeroLlanta, marca, diseno, numeroCapas, cantidad, tipoLlanta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of modificarLlanta method, of class BL_Llanta.
     */
    @Test
    public void testModificarLlanta() {
        System.out.println("modificarLlanta");
        int idLlanta = 4;
        String NumeroLlanta = "1454G";
        String Marca = "Miclelin";
        String Diseno = "Redonda";
        String NumeroCapas = "5";
        int Cantidad = 4;
        String TipoLlanta = "Agricola";
        BL_Llanta instance = new BL_Llanta();
        boolean expResult = true;
        boolean result = instance.modificarLlanta(idLlanta, NumeroLlanta, Marca, Diseno, NumeroCapas, Cantidad, TipoLlanta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       if(result != expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of eliminarLlanta method, of class BL_Llanta.
     */
    @Test
    public void testEliminarLlanta() {
        System.out.println("eliminarLlanta");
        BL_Llanta instance = new BL_Llanta();
        instance.setIdProducto(2);
        boolean expResult = true;
        boolean result = instance.eliminarLlanta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of cargarLlantas method, of class BL_Llanta.
     */
    @Test
    public void testCargarLlantas() {
        System.out.println("cargarLlantas");
        BL_Llanta instance = new BL_Llanta();
       // ArrayList<BL_Llanta> expResult = null;
        ArrayList<BL_Llanta> result = instance.cargarLlantas();
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        if(result == null){
        fail("The test case is a prototype.");
        }
    }
    
}
