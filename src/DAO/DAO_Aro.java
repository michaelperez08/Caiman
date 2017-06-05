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
import java.util.ArrayList;
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
      if(cmd.getUpdateCount()>0){
                return true;
            }else{
                return false;
            }
      
      } catch (SQLException ex) {
          Logger.getLogger(DAO_Aro.class.getName()).log(Level.SEVERE, null, ex);
          HE.Exepciones.RegistrarError(ex);
      }finally{
          try {    
              conexion.close();
          } catch (SQLException ex) {
              Logger.getLogger(DAO_Aro.class.getName()).log(Level.SEVERE, null, ex);
              HE.Exepciones.RegistrarError(ex);
          }
      }
      
      return false;
    }
    
    public ArrayList<TO_Aro> cargarAros() {
        ArrayList<TO_Aro> aros = new ArrayList<>();
        
        try {
            
                if (conexion == null || conexion.isClosed()) {
                    conexion = daoConexion.nuevaConexion();
                }
            
            
          cmd = conexion.prepareStatement("SELECT * FROM Aro;");
          rs = cmd.executeQuery();
          
            while (rs.next()) {                
                aros.add(new TO_Aro(rs.getInt("idAro"), rs.getString("NumeroAro"), rs.getString("Marca"), rs.getInt("Cantidad"), rs.getString("Codigo")));
            }
        } catch (Exception ex) {
            Logger.getLogger(DAO_Aro.class.getName()).log(Level.SEVERE, null, ex);
            HE.Exepciones.RegistrarError(ex);
        } finally {
            try {
                cmd.close();
                conexion.close();
            } catch(Exception ex) {
                 Logger.getLogger(DAO_Aro.class.getName()).log(Level.SEVERE, null, ex);
                 HE.Exepciones.RegistrarError(ex);
            }
        }
        return aros;
    }
    
    public boolean modificarAro(int idAro, String numeroAro, String marca, int cantidad, String codigo ){
        try {
            if(conexion == null || conexion.isClosed()){
                conexion = daoConexion.nuevaConexion();
            }
           cmd = conexion.prepareStatement("update Aro set NumeroAro=?, Marca=? , Cantidad=?, Codigo = ? where idAro=?;");
           cmd.setString(1, numeroAro);
           cmd.setString(2,marca);
           cmd.setInt(3, cantidad);
           cmd.setString(4, codigo);
           cmd.setInt(5, idAro);
           cmd.execute();
           if(cmd.getUpdateCount()>0){
                return true;
            }else{
                return false;
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Aro.class.getName()).log(Level.SEVERE, null, ex);
            HE.Exepciones.RegistrarError(ex);
        } finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Aro.class.getName()).log(Level.SEVERE, null, ex);
                HE.Exepciones.RegistrarError(ex);
            }
            
        }
        return false;
    }
        
    public boolean eliminarAro(int idAro) {
        try {
                if (conexion == null || conexion.isClosed()) {
                    conexion = daoConexion.nuevaConexion();
                }
            
            cmd = conexion.prepareStatement("delete from Aro where idAro = ? ;");
            cmd.setInt(1, idAro);
            cmd.execute();
            if(cmd.getUpdateCount()>0){
                return true;
            }else{
                return false;
            }
            
        } catch (Exception ex) {
            Logger.getLogger(DAO_Aro.class.getName()).log(Level.SEVERE, null, ex);
            HE.Exepciones.RegistrarError(ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Aro.class.getName()).log(Level.SEVERE, null, ex);
                HE.Exepciones.RegistrarError(ex);
            }
        }
        return false;
    }

}
