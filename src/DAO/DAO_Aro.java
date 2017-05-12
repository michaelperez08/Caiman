/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TO_Aro;
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
public class DAO_Aro {
    private Connection conexion;
    private DAO_Conexion daoConexion = new DAO_Conexion();
    private PreparedStatement cmd;
    private ResultSet rs;
    private TO_Aro aro;
    
    public boolean ingresarAro(String numeroAro, String marca,int cantidad,String codigo){
        
      try {
          if(conexion == null || conexion.isClosed()){
           conexion = daoConexion.nuevaConexion();
          }
          
         
                
      cmd = conexion.prepareStatement("insert into Aro(Marca,NumeroAro,Codigo,Cantidad) values (?,?,?,?);");
      cmd.setString(1,marca);
      cmd.setString(2,numeroAro);
      cmd.setString(3,codigo);
      cmd.setInt(4,cantidad);
      cmd.execute();
      return true;
      
      } catch (SQLException ex) {
          Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
          HE.Exepciones.RegistrarError(ex);
      }finally{
          try {    
              conexion.close();
          } catch (SQLException ex) {
              Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
              HE.Exepciones.RegistrarError(ex);
          }
      }
      
      return false;
    }

}
