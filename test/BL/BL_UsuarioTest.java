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
import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 *
 * @author alberto
 */
public class BL_UsuarioTest {
    
    
    public BL_UsuarioTest() {
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
     * Test of LogIn method, of class BL_Usuario.
     */
    
    @Test
    public void testLogIn() {
        System.out.println("LogIn");
        BL_Usuario instance = new BL_Usuario("admin", "admin","Administrador");
        BL_Usuario expResult = new BL_Usuario(1, "admin");
        BL_Usuario result = instance.LogIn();
        assertEquals(expResult.getIdUsuario(), result.getIdUsuario());
        // TODO review the generated test code and remove the default call to fail.
        if(expResult.getIdUsuario() != result.getIdUsuario()) {
           fail("The test case is a prototype."); 
        }
        
    }

    /**
     * Test of guardarUsuario method, of class BL_Usuario.
     */
    @Test
    public void testGuardarUsuario() {
        System.out.println("guardarUsuario");
        String nombre = "prueba2";
        String contrasena = "prueba";
        String tipo = "Administrador";
        BL_Usuario instance = new BL_Usuario();
        boolean expResult = true;
        boolean result = instance.guardarUsuario(nombre, contrasena, tipo);
        assertEquals(expResult, result);
        if(expResult != result){
            fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of eliminarUsuario method, of class BL_Usuario.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        int id = 11;
        BL_Usuario instance = new BL_Usuario();
        instance.setIdUsuario(id);
        boolean expResult = true;
        boolean result = instance.eliminarUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getListaUsuarios method, of class BL_Usuario.
     */
    @Test
    public void testGetListaUsuarios() {
        System.out.println("getListaUsuarios");
        BL_Usuario instance = new BL_Usuario();
        ArrayList<BL_Usuario> expResult = new ArrayList<>();
        ArrayList<BL_Usuario> result = instance.cargarUsuarios();
        assertNotEquals(expResult.isEmpty(), result.isEmpty());
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result.isEmpty()){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getCantidadUsuarios method, of class BL_Usuario.
     */
    @Test
    public void testGetCantidadUsuarios() {
        System.out.println("getCantidadUsuarios");
        BL_Usuario instance = new BL_Usuario();
        int expResult = -1;
        int result = instance.getCantidadUsuarios();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result < expResult){
        fail("The test case is a prototype.");
        }
    }
    
}
