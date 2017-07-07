/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

/**
 *
 * @author michael
 */

import DAO.*;
import TO.*;
import java.util.ArrayList;

public class BL_Usuario {
    
    private int idUsuario;
    private String NombreUsuario;
    private String Contrasena;
    private String tipoUsuario;
 
    public BL_Usuario(int idUsuario, String NombreUsuario, String Contrasena, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.NombreUsuario = NombreUsuario;
        this.Contrasena = Contrasena;
        this.tipoUsuario=tipoUsuario;
    }
 
    public BL_Usuario(String NombreUsuario, String Contrasena, String tipoUsuario) {
        this.NombreUsuario = NombreUsuario;
        this.Contrasena = Contrasena;
        this.tipoUsuario=tipoUsuario;
    }
 
    public BL_Usuario(int idUsuario, String NombreUsuario) {
        this.idUsuario = idUsuario;
        this.NombreUsuario = NombreUsuario;
    }

    public BL_Usuario(int idUsuario, String NombreUsuario, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.NombreUsuario = NombreUsuario;
        this.tipoUsuario = tipoUsuario;
    }
 
    
    public BL_Usuario() {
    }
 
    //<editor-fold defaultstate="collapsed" desc="getter and setter">
    public int getIdUsuario() {
        return idUsuario;
    }
 
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
 
    public String getNombreUsuario() {
        return NombreUsuario;
    }
 
    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }
 
    public String getContrasena() {
        return Contrasena;
    }
 
    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
 
    public BL_Usuario LogIn() {
        DAO_Usuario daou = new DAO_Usuario();
        TO_Usuario tou = daou.checkLogIn(this.NombreUsuario, this.Contrasena);
        if (tou != null) {
            return new BL_Usuario(tou.getIdUsuario(), tou.getNombreUsuario(),tou.getTipoUsuario());
        } else {
            return null;
        }
    }

//</editor-fold>
 
    public boolean guardarUsuario(String nombre, String contrasena, String tipo) {
        DAO_Usuario daou = new DAO_Usuario();
        return daou.guardarUsuario(nombre, contrasena, tipo);
    }
 
    public boolean eliminarUsuario() {
        DAO_Usuario daou = new DAO_Usuario();
        return daou.eliminarUsuario(this.idUsuario);
    }
    
    public boolean modificarUsuario(int id, String nombre, String contrasena, String tipo) {
        DAO_Usuario daou = new DAO_Usuario();
        return daou.modificarUsuario(id, nombre, contrasena, tipo);
    }
 
    public ArrayList<BL_Usuario> cargarUsuarios() {
        DAO_Usuario daou = new DAO_Usuario();
        ArrayList<TO_Usuario> listaTou = daou.cargarUsuarios();
        ArrayList<BL_Usuario> listaBlu = new ArrayList<>();
 
        for (TO_Usuario temp_tou : listaTou) {
            listaBlu.add(new BL_Usuario(temp_tou.getIdUsuario(), temp_tou.getNombreUsuario(), temp_tou.getContrasena(), temp_tou.getTipoUsuario()));
        }
        return listaBlu;
    }
 
    public int getCantidadUsuarios() {
        DAO_Usuario daou = new DAO_Usuario();
        return daou.getCantidadUsuarios();
    }
    
}
