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
    
    public boolean ingresarCliente(String nombre,String direccion,String cedula, String telefonos){
        
      try {
          if(conexion == null || conexion.isClosed()){
           conexion = daoConexion.nuevaConexion();
          }
          
         
                
      cmd = conexion.prepareStatement("insert into Cliente(Nombre,Direccion,Cedula,Telefonos) values (?,?,?,?);");
      cmd.setString(1,nombre);
      cmd.setString(2,direccion);
      cmd.setString(3,cedula);
      cmd.setString(4,telefonos);
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
    public boolean modificarCliente(int idCliente, String nombre,String direccion,String cedula, String telefonos){
        
      try {
          if(conexion == null || conexion.isClosed()){
           conexion = daoConexion.nuevaConexion();
          }
          
         
                
      cmd = conexion.prepareStatement("update Cliente set Nombre=?,Direccion=?,Cedula=?,Telefonos=? where idCliente=?;");
      cmd.setString(1,nombre);
      cmd.setString(2,direccion);
      cmd.setString(3,cedula);
      cmd.setString(4,telefonos);
      cmd.setInt(5,idCliente);
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
    
    
    public ArrayList<TO_Cliente> cargarClientes() {
        ArrayList<TO_Cliente> clientes = new ArrayList<>();
        
        try {
            try {
                if (conexion == null || conexion.isClosed()) {
                    conexion = daoConexion.nuevaConexion();
                }
            } catch (Exception ex) {
                Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            cmd = conexion.prepareStatement("select idCliente, Nombre, Direccion, Cedula, Telefonos from Cliente  order by Nombre; ");
            rs = cmd.executeQuery();
            
            while (rs.next()) {
                clientes.add(new TO_Cliente(rs.getInt("idCliente"), rs.getString("Nombre"), rs.getString("Direccion"), rs.getString("Cedula"), rs.getString("Telefonos")));
            }
        } catch (Exception ex) {
            Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                cmd.close();
                conexion.close();
            } catch(Exception ex) {
                 Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return clientes;
    }
}
