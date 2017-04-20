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
    private boolean Administrador;
 
    public BL_Usuario(int idUsuario, String NombreUsuario, String Contrasena, boolean Administrador) {
        this.idUsuario = idUsuario;
        this.NombreUsuario = NombreUsuario;
        this.Contrasena = Contrasena;
        this.Administrador = Administrador;
    }
 
    public BL_Usuario(String NombreUsuario, String Contrasena) {
        this.NombreUsuario = NombreUsuario;
        this.Contrasena = Contrasena;
    }
 
    public BL_Usuario(int idUsuario, String NombreUsuario, boolean Administrador) {
        this.idUsuario = idUsuario;
        this.NombreUsuario = NombreUsuario;
        this.Administrador = Administrador;
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
 
    public BL_Usuario LogIn() {
        DAO_Usuario daou = new DAO_Usuario();
        TO_Usuario tou = daou.checkLogIn(this.NombreUsuario, this.Contrasena);
        if (tou != null) {
            return new BL_Usuario(tou.getIdUsuario(), tou.getNombreUsuario(), tou.isAdministrador());
        } else {
            return null;
        }
 
    }
 
    public boolean isAdministrador() {
        return Administrador;
    }
 
    public void setAdministrador(boolean Administrador) {
        this.Administrador = Administrador;
    }
//</editor-fold>
 
    public boolean guardarUsuario(String nombre, String contrasena, boolean admin) {
        DAO_Usuario daou = new DAO_Usuario();
        return daou.guardarUsuario(nombre, contrasena, admin);
    }
 
    public boolean eliminarUsuario(int id) {
        DAO_Usuario daou = new DAO_Usuario();
        return daou.eliminarUsuario(id);
    }
 
    public ArrayList<BL_Usuario> getListaUsuarios() {
        DAO_Usuario daou = new DAO_Usuario();
        ArrayList<TO_Usuario> listaTou = daou.getListaUsuarios();
        ArrayList<BL_Usuario> listaBlu = new ArrayList<>();
 
        for (TO_Usuario listaTou1 : listaTou) {
            listaBlu.add(new BL_Usuario(listaTou1.getIdUsuario(), listaTou1.getNombreUsuario(), listaTou1.isAdministrador()));
        }
        return listaBlu;
    }
 
    public int getCantidadUsuarios() {
        DAO_Usuario daou = new DAO_Usuario();
        return daou.getCantidadUsuarios();
    }
    
}
