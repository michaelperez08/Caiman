/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import config.ConfBD;
import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alberto
 */
public class BL_FacturaTest {
    
    public BL_FacturaTest() {
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
     * Test of ingresarFactura method, of class BL_Factura.
     */
    @Test
    public void testIngresarFactura() {
        System.out.println("ingresarFactura");
        String nombreCliente = "Naruto";
        String telefono = "90909090";
        String direccion = "konoha";
        double precioTotal = 77777.0;
        double subtotal = 9999;
        double impuesto = 6666;
        int contado  = 0;
        Date fecha = new Date(System.currentTimeMillis());
        ArrayList<BL_LineaFactura> blListaLineas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
           blListaLineas.add(new BL_LineaFactura(i, "detalle#"+i, i*100, i*1000));
        }
        BL_Factura instance = new BL_Factura();
        boolean expResult = true;
        boolean result = instance.ingresarFactura(nombreCliente, telefono, direccion, precioTotal, blListaLineas, 
                subtotal, impuesto, contado, fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
        }
    }

    
    
}
