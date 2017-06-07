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
 * @author Extreme PC
 */
public class DAO_Factura {
    public Connection conexion;
    public DAO_Conexion daoConexion = new DAO_Conexion();
    public PreparedStatement cmd;
    public ResultSet rs;
    
    public boolean ingresarFactura(String nombreCliente, String telefono, String direccion, 
            double precioTotal, ArrayList<TO_LineaFactura> listaLineaFactura){
        
         try {
          if(conexion == null || conexion.isClosed()){
           conexion = daoConexion.nuevaConexion();
          }
          
          cmd = conexion.prepareStatement("insert into Factura (NombreCliente,TelefonoCliente,DireccionCliente,PrecioTotal,Fecha) \n" +
                "values (?,?,?,?,current_date());");
          cmd.setString(1, nombreCliente);
          cmd.setString(2, telefono);
          cmd.setString(3, direccion);
          cmd.setDouble(4, precioTotal);
          cmd.execute();
          
          int idFactura = ultimoIdFactura();
          
          DAO_LineaFactura daoLineaFactura = new DAO_LineaFactura();
             for (TO_LineaFactura tO_LineaFactura : listaLineaFactura) {
                if(!daoLineaFactura.ingresarLineaFactura(idFactura, tO_LineaFactura.getCantidad(), 
                         tO_LineaFactura.getDetalle(), tO_LineaFactura.getPrecioUnitario(), tO_LineaFactura.getPrecioTotalLinea())){
                    eliminarFactura(idFactura);
                    return false;
                }
             }
          return true;
         } catch (SQLException ex) {
          Logger.getLogger(DAO_Factura.class.getName()).log(Level.SEVERE, null, ex);
          HE.Exepciones.RegistrarError(ex);
      }finally{
          try {    
              conexion.close();
          } catch (SQLException ex) {
              Logger.getLogger(DAO_Factura.class.getName()).log(Level.SEVERE, null, ex);
              HE.Exepciones.RegistrarError(ex);
          }
      }
        
        return false;
    }
    
    private int ultimoIdFactura(){
        int idFactura = 0;
        try {
          if(conexion == null || conexion.isClosed()){
           conexion = daoConexion.nuevaConexion();
          }
           
          cmd = conexion.prepareStatement("select max(idFactura) from Factura;");
          rs = cmd.executeQuery();
          while(rs.next()){
              idFactura = rs.getInt("max(idFactura)");
          }
          
         } catch (SQLException ex) {
          Logger.getLogger(DAO_Factura.class.getName()).log(Level.SEVERE, null, ex);
          HE.Exepciones.RegistrarError(ex);
          return -1;
      }finally{
          try {    
              conexion.close();
          } catch (SQLException ex) {
              Logger.getLogger(DAO_Factura.class.getName()).log(Level.SEVERE, null, ex);
              HE.Exepciones.RegistrarError(ex);
          }
      }
        return idFactura;
    }
    
    public boolean eliminarFactura(int id){
         try {
          if(conexion == null || conexion.isClosed()){
           conexion = daoConexion.nuevaConexion();
          }
           
          cmd = conexion.prepareStatement("delete from Factura where idFactura = ?;");
          cmd.setInt(1, id);
          cmd.execute();
          if(cmd.getUpdateCount()>0){
                return true;
            }else{
                return false;
            }
          
         } catch (SQLException ex) {
          Logger.getLogger(DAO_Factura.class.getName()).log(Level.SEVERE, null, ex);
          HE.Exepciones.RegistrarError(ex);
      }finally{
          try {    
              conexion.close();
          } catch (SQLException ex) {
              Logger.getLogger(DAO_Factura.class.getName()).log(Level.SEVERE, null, ex);
              HE.Exepciones.RegistrarError(ex);
          }
      }
    return false;
    }

}
