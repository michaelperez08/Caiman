/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TO_Usuario;
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
 * @author alberto
 */
public class DAO_UsuarioTest {
    
    public DAO_UsuarioTest() {
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
     * Test of checkLogIn method, of class DAO_Usuario.
     */
    @Test
    public void testCheckLogIn() {
        System.out.println("checkLogIn");
        String NombreUsuario = "admin";
        String Contraseña = "admin";
        DAO_Usuario instance = new DAO_Usuario();
        TO_Usuario expResult = new TO_Usuario(1, "admin");
        TO_Usuario result = instance.checkLogIn(NombreUsuario, Contraseña);
        assertEquals(expResult.getIdUsuario(), result.getIdUsuario());
        // TODO review the generated test code and remove the default call to fail.
       
        if(expResult.getIdUsuario() != result.getIdUsuario()){
           fail("The test case is a prototype.");  
        }
    }

    /**
     * Test of guardarUsuario method, of class DAO_Usuario.
     */
    @Test
    public void testGuardarUsuario() {
        System.out.println("guardarUsuario");
        String nombreUsuario = "pruebaTest";
        String contrasena = "pruebaTest";
        String tipo = "Administrador";
        DAO_Usuario instance = new DAO_Usuario();
        boolean expResult = true;
        boolean result = instance.guardarUsuario(nombreUsuario, contrasena, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
           fail("The test case is a prototype."); 
        }
        
    }

    /**
     * Test of eliminarUsuario method, of class DAO_Usuario.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        int id = 10;
        DAO_Usuario instance = new DAO_Usuario();
        boolean expResult = true;
        boolean result = instance.eliminarUsuario(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
           fail("The test case is a prototype."); 
        }
        
    }

    /**
     * Test of getListaUsuarios method, of class DAO_Usuario.
     */
    @Test
    public void testGetListaUsuarios() {
        System.out.println("getListaUsuarios");
        DAO_Usuario instance = new DAO_Usuario();
        ArrayList<TO_Usuario> expResult = new ArrayList<>();
        ArrayList<TO_Usuario> result = instance.cargarUsuarios();
        //assertEquals(expResult, result);
        assertNotEquals(expResult.isEmpty(), result.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        if(result.isEmpty()){
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getCantidadUsuarios method, of class DAO_Usuario.
     */
    
    @Test
    public void testGetCantidadUsuarios() {
        System.out.println("getCantidadUsuarios");
        DAO_Usuario instance = new DAO_Usuario();
        int expResult = -1;
        int result = instance.getCantidadUsuarios();
        //assertEquals(expResult, result);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result < expResult){
        fail("The test case is a prototype.");
        }
    }
    
    
}
