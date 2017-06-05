/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TO_LineaFactura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alberto
 */
public class DAO_LineaFactura {
    
    public Connection conexion;
    public DAO_Conexion daoConexion = new DAO_Conexion();
    public PreparedStatement cmd;
    public ResultSet rs;
    
    public boolean ingresarLineaFactura(int idFactura,int cantidad, String detalle,
            double precioUnitario, double precioTotalLinea){
        
        try {
          if(conexion == null || conexion.isClosed()){
           conexion = daoConexion.nuevaConexion();
          }
          
          cmd = conexion.prepareStatement("INSERT INTO LineaFactura "
                  + "(idFactura, Cantidad, Detalle, PrecioUnitario, PrecioTotalLinea) VALUES (?, ?, ?, ?, ?);");
          cmd.setInt(1, idFactura);
          cmd.setInt(2, cantidad);
          cmd.setString(3, detalle);
          cmd.setDouble(4, precioUnitario);
          cmd.setDouble(5, precioTotalLinea);
          cmd.execute();
          if(cmd.getUpdateCount()>0){
                return true;
            }else{
                return false;
            }
          
          } catch (SQLException ex) {
          Logger.getLogger(DAO_LineaFactura.class.getName()).log(Level.SEVERE, null, ex);
          HE.Exepciones.RegistrarError(ex);
      }finally{
          try {    
              conexion.close();
          } catch (SQLException ex) {
              Logger.getLogger(DAO_LineaFactura.class.getName()).log(Level.SEVERE, null, ex);
              HE.Exepciones.RegistrarError(ex);
          }
      }
        return false;
    }
    
    public boolean eliminarLineaFactura(int id) {
        try {

            if (conexion == null || conexion.isClosed()) {
                conexion = daoConexion.nuevaConexion();
            }
                cmd = conexion.prepareStatement("delete from LineaFactura where idLineaFactura=?");
                cmd.setInt(1, id);
                cmd.execute();
                if(cmd.getUpdateCount()>0){
                return true;
            }else{
                return false;
            }
            

        } catch (Exception ex) {
            Logger.getLogger(DAO_LineaFactura.class.getName()).log(Level.SEVERE, null, ex);
            HE.Exepciones.RegistrarError(ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_LineaFactura.class.getName()).log(Level.SEVERE, null, ex);
                HE.Exepciones.RegistrarError(ex);
            }
        }
        return false;
    }
    
    public ArrayList<TO_LineaFactura> cargarLineasFactura() {
        ArrayList<TO_LineaFactura> lineas = new ArrayList<>();
        try {
            if (conexion == null || conexion.isClosed()) {
                conexion = daoConexion.nuevaConexion();
            }

            cmd = conexion.prepareStatement("select * from LineaFactura");
            rs = cmd.executeQuery();
            while (rs.next()) {
                lineas.add(new TO_LineaFactura(rs.getInt("idFactura"), rs.getInt("Cantidad"),
                        rs.getString("Detalle"), rs.getDouble("PrecioUnitario"), rs.getDouble("PrecioTotalLinea")));
            }

        } catch (Exception ex) {
            Logger.getLogger(DAO_LineaFactura.class.getName()).log(Level.SEVERE, null, ex);
            HE.Exepciones.RegistrarError(ex);
        } finally {
            try {
                cmd.close();
                conexion.close();
            } catch (Exception ex) {
                Logger.getLogger(DAO_LineaFactura.class.getName()).log(Level.SEVERE, null, ex);
                HE.Exepciones.RegistrarError(ex);
            }
        }
        return lineas;
    }
    
    public boolean modificarLineaFactura(int idLineaFactura, int idFactura,int cantidad, String detalle, 
            double precioUnitario, double precioTotalLinea){
        
        try {
            if(conexion == null || conexion.isClosed()){
                conexion = daoConexion.nuevaConexion();
            } 
            
            cmd = conexion.prepareStatement("UPDATE LineaFactura SET idFactura=?, Cantidad=?, Detalle=?, "
                    + "PrecioUnitario=?, PrecioTotalLinea=? WHERE idLineaFactura=?;");
            
            cmd.setInt(1, idFactura);
            cmd.setInt(2, cantidad);
            cmd.setString(3, detalle);
            cmd.setDouble(4, precioUnitario);
            cmd.setDouble(5, precioTotalLinea);
            cmd.setInt(6, idLineaFactura);
            cmd.execute();
            if(cmd.getUpdateCount()>0){
                return true;
            }else{
                return false;
            }
            
            } catch (SQLException ex) {
            Logger.getLogger(DAO_LineaFactura.class.getName()).log(Level.SEVERE, null, ex);
            HE.Exepciones.RegistrarError(ex);
        } finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_LineaFactura.class.getName()).log(Level.SEVERE, null, ex);
                HE.Exepciones.RegistrarError(ex);
            }
            
        }
        return false;
    }
    
}
