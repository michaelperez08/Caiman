/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author michael
 */
import HE.Exepciones;
import TO.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.NullPointerException;

public class DAO_Usuario {

    public Connection conexion;
    public DAO_Conexion daoConexion = new DAO_Conexion();
    public PreparedStatement cmd;
    public ResultSet rs;

    public TO_Usuario checkLogIn(String NombreUsuario, String Contraseña) {
        TO_Usuario usuario = null;
        try {
            if (conexion == null || conexion.isClosed()) {
                conexion = daoConexion.nuevaConexion();
            }
            cmd = conexion.prepareStatement("select * from Usuario where NombreUsuario = ? and Contrasena = ? limit 1");
            cmd.setString(1, NombreUsuario);
            cmd.setString(2, Contraseña);

            rs = cmd.executeQuery();
            while (rs.next()) {
                usuario = new TO_Usuario(rs.getInt("idUsuario"), rs.getString("NombreUsuario"));
                conexion.close();
                return usuario;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            HE.Exepciones.RegistrarError(ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
                HE.Exepciones.RegistrarError(ex);
            }
        }

        return usuario;
    }

    public boolean guardarUsuario(String nombreUsuario, String contrasena, String tipoUsuario) {
        try {

            if (conexion == null || conexion.isClosed()) {
                conexion = daoConexion.nuevaConexion();
            }

            cmd = conexion.prepareStatement("insert into Usuario(NombreUsuario, Contrasena, Tipo) values (?,?,?);");
            cmd.setString(1, nombreUsuario);
            cmd.setString(2, contrasena);
            cmd.setString(3, tipoUsuario);
            cmd.execute();

            if(cmd.getUpdateCount()>0){
                return true;
            }else{
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            HE.Exepciones.RegistrarError(ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
                HE.Exepciones.RegistrarError(ex);
            }
        }
        return false;
    }
    
    public boolean modificarUsuario(int id, String nombreUsuario, String contrasena, String tipoUsuario) {
        try {

            if (conexion == null || conexion.isClosed()) {
                conexion = daoConexion.nuevaConexion();
            }

            cmd = conexion.prepareStatement("Update Usuario set NombreUsuario=?, Contrasena=? ,Tipo=? where idUsuario=?;");
            cmd.setString(1, nombreUsuario);
            cmd.setString(2, contrasena);
            cmd.setString(3, tipoUsuario);
            cmd.setInt(4, id);
            cmd.execute();

            if(cmd.getUpdateCount()>0){
                return true;
            }else{
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            HE.Exepciones.RegistrarError(ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
                HE.Exepciones.RegistrarError(ex);
            }
        }
        return false;
    }

    public boolean eliminarUsuario(int id) {
        try {

            if (conexion == null || conexion.isClosed()) {
                conexion = daoConexion.nuevaConexion();
            }

            cmd = conexion.prepareStatement("delete from Usuario where idUsuario = ?;");
            cmd.setInt(1, id);
            cmd.execute();

            if(cmd.getUpdateCount()>0){
                return true;
            }else{
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            HE.Exepciones.RegistrarError(ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
                HE.Exepciones.RegistrarError(ex);
            }
        }
        return false;
    }

    public ArrayList<TO_Usuario> cargarUsuarios() {
        ArrayList<TO_Usuario> listaTou = new ArrayList<>();
        try {

            if (conexion == null || conexion.isClosed()) {
                conexion = daoConexion.nuevaConexion();
            }

            cmd = conexion.prepareStatement("select * from Usuario;");
            rs = cmd.executeQuery();

            while (rs.next()) {
                listaTou.add(new TO_Usuario(rs.getInt("idUsuario"), rs.getString("NombreUsuario"), rs.getString("Contrasena"), rs.getString("Tipo")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            HE.Exepciones.RegistrarError(ex);
        } finally {
            try {
                cmd.close();
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
                HE.Exepciones.RegistrarError(ex);
            }
        }
        return listaTou;
    }

    public int getCantidadUsuarios() {
        int retorno = -1;
        try {

            if (conexion == null || conexion.isClosed()) {
                conexion = daoConexion.nuevaConexion();
            }

            cmd = conexion.prepareStatement("select count(*) as cantidad from Usuario limit 1;");
            rs = cmd.executeQuery();

            while (rs.next()) {
                retorno = rs.getInt("cantidad");
            }

            return retorno;

        } catch (SQLException | NullPointerException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            HE.Exepciones.RegistrarError(ex);
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
                HE.Exepciones.RegistrarError(ex);
                //throw new HE.Exepciones(ex);
            }
        }
        return retorno;
    }

}
