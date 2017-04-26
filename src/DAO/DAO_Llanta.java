/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TO_Llanta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Extreme PC
 */
public class DAO_Llanta {
    private Connection conexion;
    private DAO_Conexion daoConexion = new DAO_Conexion();
    private PreparedStatement cmd;
    private ResultSet rs;
    private TO_Llanta llanta;
    
    public boolean ingresarLLanta(String numeroLlanta, String marca,String diseno,int numeroCapas,int cantidad,String tipoLlanta){
        
      try {
          if(conexion == null || conexion.isClosed()){
           conexion = daoConexion.nuevaConexion();
          }
          
         
                
      cmd = conexion.prepareStatement("insert into Llanta(NumeroLlanta,Marca,Diseno,NumeroCapas,Cantidad,TipoLlanta) values (?,?,?,?,?,?);");
      cmd.setString(1,numeroLlanta);
      cmd.setString(2,marca);
      cmd.setString(3,diseno);
      cmd.setInt(4,numeroCapas);
      cmd.setInt(5,cantidad);
      cmd.setString(6,tipoLlanta);
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
