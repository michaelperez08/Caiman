/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import TO.TO_Factura;
import TO.TO_LineaFactura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
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
            double precioTotal, ArrayList<TO_LineaFactura> listaLineaFactura,double subTotal, double impVenta, 
            boolean contado, Date fechaExpiracion, String cedulaCliente){
        
         try {
          if(conexion == null || conexion.isClosed()){
           conexion = daoConexion.nuevaConexion();
          }
          
          cmd = conexion.prepareStatement("INSERT INTO Factura (NombreCliente, TelefonoCliente, DireccionCliente, "
                  + "FechaExpiracion, SubTotal, ImpVenta, PrecioTotal, Contado, CedulaCliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
          cmd.setString(1, nombreCliente);
          cmd.setString(2, telefono);
          cmd.setString(3, direccion);
          cmd.setDate(4, new java.sql.Date(fechaExpiracion.getTime()));
          cmd.setDouble(5, subTotal);
          cmd.setDouble(6, impVenta);
          cmd.setDouble(7, precioTotal);
          cmd.setBoolean(8, contado);
          cmd.setString(9,cedulaCliente);
          cmd.execute();
          
          int idFactura = ultimoIdFactura();
          
          DAO_LineaFactura daoLineaFactura = new DAO_LineaFactura();
             for (TO_LineaFactura tO_LineaFactura : listaLineaFactura) {
                if(!daoLineaFactura.ingresarLineaFactura(idFactura, tO_LineaFactura.getCantidad(), 
                         tO_LineaFactura.getDetalle(), tO_LineaFactura.getPrecioUnitario(), tO_LineaFactura.getPrecioTotalLinea())|idFactura==0){
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
          return 0;
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
    
    
public ArrayList<TO_Factura> cargarFactura(){
       ArrayList<TO_Factura> lista  = new ArrayList<>();
      DAO_LineaFactura daoLinea  = new DAO_LineaFactura();
       try {
            if (conexion == null || conexion.isClosed()) {
                conexion = daoConexion.nuevaConexion();
            }
            cmd = conexion.prepareStatement("SELECT * FROM Factura ORDER BY Factura.FechaExpiracion DESC limit 50");
            rs = cmd.executeQuery();
            while(rs.next()){
                lista.add(new TO_Factura(rs.getInt("idFactura"),rs.getString("NombreCliente"),rs.getString("TelefonoCliente"),rs.getString("DireccionCliente"),
                        rs.getDouble("PrecioTotal"), rs.getDate("FechaExpiracion"),rs.getDouble("SubTotal"),
                        rs.getDouble("ImpVenta"),rs.getBoolean("Contado"),daoLinea.cargarLineasFacturaId(rs.getInt("idFactura")), rs.getString("CedulaCliente")));
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
       return lista;
    }


}
