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
 
            try {
                if (conexion == null || conexion.isClosed()) {
                    conexion = daoConexion.nuevaConexion();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
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
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 
        return usuario;
    }
 
    public boolean guardarUsuario(String nombreUsuario, String contrasena) {
        try {
 
            try {
                if (conexion == null || conexion.isClosed()) {
                    conexion = daoConexion.nuevaConexion();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            cmd = conexion.prepareStatement("insert into Usuario(NombreUsuario, Contrasena, Administrador) values (?,?);");
            cmd.setString(1, nombreUsuario);
            cmd.setString(2, contrasena);
            cmd.execute();
 
            return true;
 
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
 
    public boolean eliminarUsuario(int id) {
        try {
 
            try {
                if (conexion == null || conexion.isClosed()) {
                    conexion = daoConexion.nuevaConexion();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            cmd = conexion.prepareStatement("delete from Usuario where idUsuario = ?;");
            cmd.setInt(1, id);
            cmd.execute();
 
            return true;
 
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
 
    public ArrayList<TO_Usuario> getListaUsuarios() {
        ArrayList<TO_Usuario> listaTou = new ArrayList<>();
        try {
 
            try {
                if (conexion == null || conexion.isClosed()) {
                    conexion = daoConexion.nuevaConexion();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            cmd = conexion.prepareStatement("select * from Usuario;");
            rs = cmd.executeQuery();
 
            while (rs.next()) {
                listaTou.add(new TO_Usuario(rs.getInt("idUsuario"), rs.getString("NombreUsuario")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                cmd.close();
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaTou;
    }
 
    public int getCantidadUsuarios() {
        int retorno = -1;
        try {
 
            try {
                if (conexion == null || conexion.isClosed()) {
                    conexion = daoConexion.nuevaConexion();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            cmd = conexion.prepareStatement("select count(*) as cantidad from Usuario limit 1;");
            rs = cmd.executeQuery();
 
            while (rs.next()) {
                retorno = rs.getInt("cantidad");
            }
 
            return retorno;
 
        } catch (SQLException | NullPointerException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retorno;
    }
 
}
