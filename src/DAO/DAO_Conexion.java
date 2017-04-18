/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author victoru
 */
public class DAO_Conexion {
    public String servidor = System.getProperty("servidor");
    public String usuarioDB = System.getProperty("usuarioDB");
    public String nombreDB = System.getProperty("nombreDB");
    public String passwordDB = System.getProperty("passwordDB");
    
    public DAO_Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println(e.toString());

        }

    }
    
    public Connection nuevaConexion() {
        try {
            return DriverManager.getConnection("jdbc:mysql://"+servidor+":3306/"+nombreDB, usuarioDB, passwordDB);
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
