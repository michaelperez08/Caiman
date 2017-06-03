/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TO_Aro;
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
public class DAO_AroTest {
    
    public DAO_AroTest() {
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
     * Test of ingresarAro method, of class DAO_Aro.
     */
    @Test
    public void testIngresarAro() {
        System.out.println("ingresarAro");
        String numeroAro = "10";
        String marca = "Firestone";
        int cantidad = 6;
        String codigo = "f10";
        DAO_Aro instance = new DAO_Aro();
        boolean expResult = true;
        boolean result = instance.ingresarAro(numeroAro, marca, cantidad, codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of cargarAros method, of class DAO_Aro.
     */
    @Test
    public void testCargarAros() {
        System.out.println("cargarAros");
        DAO_Aro instance = new DAO_Aro();
        //ArrayList<TO_Aro> expResult = null;
        ArrayList<TO_Aro> result = instance.cargarAros();
        // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result == null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of modificarAro method, of class DAO_Aro.
     */
    @Test
    public void testModificarAro() {
        System.out.println("modificarAro");
        int idAro = 2;
        String numeroAro = "15";
        String marca = "bristone";
        int cantidad = 4;
        String codigo = "soma";
        DAO_Aro instance = new DAO_Aro();
        boolean expResult = true;
        boolean result = instance.modificarAro(idAro, numeroAro, marca, cantidad, codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult) {
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of eliminarAro method, of class DAO_Aro.
     */
    @Test
    public void testEliminarAro() {
        System.out.println("eliminarAro");
        int idAro = 2;
        DAO_Aro instance = new DAO_Aro();
        boolean expResult = true;
        boolean result = instance.eliminarAro(idAro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }
    
}
