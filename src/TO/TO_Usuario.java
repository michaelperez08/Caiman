/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TO;

/**
 *
 * @author michael
 */
public class TO_Usuario {
    
    private int idUsuario;
    private String NombreUsuario;
    private String Contrasena;
 
    public TO_Usuario() {
    }
 
    public TO_Usuario(int idUsuario, String NombreUsuario, String Contrasena) {
        this.idUsuario = idUsuario;
        this.NombreUsuario = NombreUsuario;
        this.Contrasena = Contrasena;
    }
 
    public TO_Usuario(int idUsuario, String NombreUsuario) {
        this.idUsuario = idUsuario;
        this.NombreUsuario = NombreUsuario;
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
}
