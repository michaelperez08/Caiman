/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TO_Telefono;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class DAO_Telefono {
     private Connection conexion ;
    DAO_Conexion daoConexion = new DAO_Conexion();
    private PreparedStatement cdm ;
    private ResultSet sr;
    private TO_Telefono toTelefono ;
    
    public boolean ingresarTelefono(String telefono){
        try {
            if(conexion == null||conexion.isClosed()){
                conexion = daoConexion.nuevaConexion();
            }
            cdm = conexion.prepareStatement("insert into telefono(idCliente,Telefono)values((select MAX (idCliente)from Cliente),?);");
            cdm.setString(2, telefono);
            cdm.execute();
             
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Telefono.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Telefono.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        return false;
    }

}
