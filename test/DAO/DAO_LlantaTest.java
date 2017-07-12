/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TO_Llanta;
import config.ConfBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class DAO_LlantaTest {
    
     private Connection conexion;
    private DAO_Conexion daoConexion = new DAO_Conexion();
    private PreparedStatement cmd;
    private ResultSet rs;
    private TO_Llanta llanta;
    private int id;
    public DAO_LlantaTest() {
    ConfBD confdb;
         confdb = new ConfBD();
    }
    

    /**
     * Test of ingresarLLanta method, of class DAO_Llanta.
     */
    @Test
    public void testIngresarLLanta() {
         
        System.out.println("ingresarLLanta");
        String numeroLlanta = "Fire1454";
        String marca = "Firestone";
        String diseno = "Delgada";
        String numeroCapas = "4";
        int cantidad = 2;
        String tipoLlanta = "Agricola";
        DAO_Llanta instance = new DAO_Llanta();
        boolean expResult = true;
        boolean result = instance.ingresarLLanta(numeroLlanta, marca, diseno, numeroCapas, cantidad, tipoLlanta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
        fail("The test case is a prototype.");
        }
      //  id=obtenerId();
    }
    
    //public int obtenerId(){
        
      //   int idLlanta = 0;
         
        //try {
          //  if (conexion == null || conexion.isClosed()) {
            //    conexion = daoConexion.nuevaConexion();
            //}
            //cmd = conexion.prepareStatement("select idLlanta from Llanta where marca ='Fire1454' ; ");
            //rs = cmd.executeQuery();
            //idLlanta= rs.getByte("idLlanta");
           

           
        //} catch (SQLException e) {
          //  Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, e);
           // HE.Exepciones.RegistrarError(e);
        //} finally {
          //  try {
            //    cmd.close();
              //  conexion.close();
           // } catch (SQLException | NullPointerException e) {
             //   Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, e);
               // HE.Exepciones.RegistrarError(e);
           // }
       // }
       // return idLlanta;
         
    //}

    /**
     * Test of eliminarLlanta method, of class DAO_Llanta.
     */
    @Test
    public void testEliminarLlanta() {
        System.out.println("eliminarLlanta");    
        int idLlanta = 4;
        DAO_Llanta instance = new DAO_Llanta();
        boolean expResult = true;
        boolean result = instance.eliminarLlanta(idLlanta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of cargarLlantas method, of class DAO_Llanta.
     */
    @Test
    public void testCargarLlantas() {
        System.out.println("cargarLlantas");
        DAO_Llanta instance = new DAO_Llanta();
        //ArrayList<TO_Llanta> expResult = null;
        ArrayList<TO_Llanta> result = instance.cargarLlantas();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        if(result == null){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of modificarLlanta method, of class DAO_Llanta.
     */
    @Test
    public void testModificarLlanta() {
        System.out.println("modificarLlanta");
        int idLlanta = 20;
        String numeroLlanta = "12";
        String marca = "Pireli";
        String diseno = "Negra";
        String numeroCapas = "4";
        int cantidad = 6;
        String tipoLlanta = "Hola";
        DAO_Llanta instance = new DAO_Llanta();
        boolean expResult = true;
        boolean result = instance.modificarLlanta(idLlanta, numeroLlanta, marca, diseno, numeroCapas, cantidad, tipoLlanta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }
    
}
