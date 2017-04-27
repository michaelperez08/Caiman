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
import java.util.ArrayList;
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

    
    public boolean eliminarLlanta(int idLlanta) {
        try {
            try {
                if (conexion == null || conexion.isClosed()) {
                    conexion = daoConexion.nuevaConexion();
                }
            } catch (Exception ex) {
                Logger.getLogger(DAO_Llanta.class.getName()).log(Level.SEVERE, null, ex);
            }

            cmd = conexion.prepareStatement("delete from Llanta where idLlanta = ?;");
            cmd.setInt(1, idLlanta);
            cmd.execute();
            return true;

        } catch (Exception ex) {
            Logger.getLogger(DAO_Llanta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Llanta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public ArrayList<TO_Llanta> cargarLlantas(){
        ArrayList<TO_Llanta> llantas = new ArrayList<>();
        try {
            
            try {
                if (conexion == null || conexion.isClosed()) {
                    conexion = daoConexion.nuevaConexion();
                }
            } catch (Exception ex) {
                Logger.getLogger(DAO_Llanta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            cmd = conexion.prepareStatement("select * from Llanta;");
            rs = cmd.executeQuery();
            
            while (rs.next()) {                
                llantas.add(new TO_Llanta(rs.getInt("idLlanta"), rs.getString("NumeroLlanta"), rs.getString("Marca"),
                        rs.getString("Diseno"), rs.getInt("NumeroCapas"), rs.getInt("Cantidad"), rs.getString("TipoLlanta")));
            }
            
        } catch (Exception ex) {
            Logger.getLogger(DAO_Llanta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                cmd.close();
                conexion.close();
            } catch(Exception ex) {
                 Logger.getLogger(DAO_Llanta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return llantas;
    }
    
    
}
