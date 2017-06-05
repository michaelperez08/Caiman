/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TO_Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael
 */
public class DAO_Cliente {

    private Connection conexion;
    private DAO_Conexion daoConexion = new DAO_Conexion();
    private PreparedStatement cmd;
    private ResultSet rs;
    private TO_Cliente cliente;

    public boolean ingresarCliente(String nombre, String direccion_simple, String direccion_exacta, String cedula, String telefonos) {

        try {
            if (conexion == null || conexion.isClosed()) {
                conexion = daoConexion.nuevaConexion();
            }

            cmd = conexion.prepareStatement("insert into Cliente(Nombre,Direccion_Simple, Direccion_Exacta,Cedula,Telefonos) values (?,?,?,?,?);");
            cmd.setString(1, nombre);
            cmd.setString(2, direccion_simple);
            cmd.setString(3, direccion_exacta);
            cmd.setString(4, cedula);
            cmd.setString(5, telefonos);
            cmd.execute();
            if (cmd.getUpdateCount() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
                HE.Exepciones.RegistrarError(ex);
            }
        }

        return false;
    }

    public boolean modificarCliente(int idCliente, String nombre, String direccion_simple, String direccion_exacta, String cedula, String telefonos) {

        try {
            if (conexion == null || conexion.isClosed()) {
                conexion = daoConexion.nuevaConexion();
            }

            cmd = conexion.prepareStatement("update Cliente set Nombre=?,Direccion_Simple=?, Direccion_Exacta=?,Cedula=?,Telefonos=? where idCliente=?;");
            cmd.setString(1, nombre);
            cmd.setString(2, direccion_simple);
            cmd.setString(3, direccion_exacta);
            cmd.setString(4, cedula);
            cmd.setString(5, telefonos);
            cmd.setInt(6, idCliente);
            cmd.execute();
            if (cmd.getUpdateCount() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
                HE.Exepciones.RegistrarError(ex);
            }
        }

        return false;
    }

    public ArrayList<TO_Cliente> cargarClientes() {
        ArrayList<TO_Cliente> clientes = new ArrayList<>();

        try {
            if (conexion == null || conexion.isClosed()) {
                conexion = daoConexion.nuevaConexion();
            }
            cmd = conexion.prepareStatement("select idCliente, Nombre, Direccion_Simple, Direccion_Exacta, Cedula, Telefonos from Cliente  order by Nombre; ");
            rs = cmd.executeQuery();

            while (rs.next()) {
                clientes.add(new TO_Cliente(rs.getInt("idCliente"), rs.getString("Nombre"), rs.getString("Direccion_Simple"), rs.getString("Direccion_Exacta"), rs.getString("Cedula"), rs.getString("Telefonos")));
            }
        } catch (SQLException e) {
            Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, e);
            HE.Exepciones.RegistrarError(e);
        } finally {
            try {
                cmd.close();
                conexion.close();
            } catch (SQLException | NullPointerException e) {
                Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, e);
                HE.Exepciones.RegistrarError(e);
            }
        }
        return clientes;
    }

    public boolean eliminarCliente(int idCliente) {
        try {
            if (conexion == null || conexion.isClosed()) {
                conexion = daoConexion.nuevaConexion();
            }

            cmd = conexion.prepareStatement("delete from Cliente where idCliente = ?;");
            cmd.setInt(1, idCliente);
            cmd.execute();
            if (cmd.getUpdateCount() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            HE.Exepciones.RegistrarError(ex);
        } finally {
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
