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
    private String tipoUsuario;
 
    public TO_Usuario(int idUsuario, String NombreUsuario, String Contrasena, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.NombreUsuario = NombreUsuario;
        this.Contrasena = Contrasena;
        this.tipoUsuario=tipoUsuario;
    }
 
    public TO_Usuario(String NombreUsuario, String Contrasena, String tipoUsuario) {
        this.NombreUsuario = NombreUsuario;
        this.Contrasena = Contrasena;
        this.tipoUsuario=tipoUsuario;
    }
 
    public TO_Usuario(int idUsuario, String NombreUsuario) {
        this.idUsuario = idUsuario;
        this.NombreUsuario = NombreUsuario;
    }

    public TO_Usuario(int idUsuario, String NombreUsuario, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.NombreUsuario = NombreUsuario;
        this.tipoUsuario = tipoUsuario;
    }
    
    
 
    public TO_Usuario() {
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
    
    
}
