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
public class BL_AroTest {
    
    public BL_AroTest() {
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
     * Test of IngresarAro method, of class BL_Aro.
     */
    @Test
    public void testIngresarAro() {
        System.out.println("IngresarAroBL");
        String numeroAro = "26";
        String marca = "PruebaBLIngresar";
        int cantidad = 2;
        String codigo = "PBLIn";
        BL_Aro instance = new BL_Aro();
        boolean expResult = true;
        boolean result = instance.IngresarAro(numeroAro, marca, cantidad, codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       if(result != expResult){
        fail("The test case is a prototype.");
       }
    }

    /**
     * Test of modificarAro method, of class BL_Aro.
     */
    @Test
    public void testModificarAro() {
        System.out.println("modificarAro");
        int idAro = 3;
        String numeroAro = "15";
        String Marca = "brigstone";
        int Cantidad = 4;
        String Codigo = "b15";
        BL_Aro instance = new BL_Aro();
        boolean expResult = true;
        boolean result = instance.modificarAro(idAro, numeroAro, Marca, Cantidad, Codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult) {
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of cargarAros method, of class BL_Aro.
     */
    @Test
    public void testCargarAros() {
        System.out.println("cargarAros");
        BL_Aro instance = new BL_Aro();
        //ArrayList<BL_Aro> expResult = null;
        ArrayList<BL_Aro> result = instance.cargarAros();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result == null){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of eliminarAro method, of class BL_Aro.
     */
    @Test
    public void testEliminarAro() {
        System.out.println("eliminarAro");
         BL_Aro instance = new BL_Aro();
        instance.setIdProducto(4);
        boolean expResult = true;
        boolean result = instance.eliminarAro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }

    
    @Test
    public void testActualizarCantidad() {
        System.out.println("actualizarCantidad");
        int cantidad = 2;
        BL_Aro instance = new BL_Aro();
        instance.setIdProducto(1);
        instance.setCantidad(4);
        boolean expResult = false;
        boolean result = instance.actualizarCantidad(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 
    
}
