/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TO_Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael
 */
public class DAO_Cliente {
    private Connection conexion;
    private DAO_Conexion daoConexion = new DAO_Conexion();
    private PreparedStatement cmd;
    private ResultSet rs;
    private TO_Cliente cliente;
    
    public boolean ingresarCliente(String nombre,String direccion,String cedula){
        
      try {
          if(conexion == null || conexion.isClosed()){
           conexion = daoConexion.nuevaConexion();
          }
          
         
                
      cmd = conexion.prepareStatement("insert into Cliente(Nombre,Direccion,Cedula) values (?,?,?,?);");
      cmd.setString(2,nombre);
      cmd.setString(3,direccion);
      cmd.setString(4,cedula);
      cmd.execute();
      return true;
      
      } catch (SQLException ex) {
          Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
      }finally{
          try {    
              conexion.close();
          } catch (SQLException ex) {
              Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
      
      return false;
    }
}
