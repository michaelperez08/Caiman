/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAO.DAO_Cliente;

/**
 *
 * @author michael
 */
public class BL_Cliente {
      
    String Nombre;
    String Direccion;
    String Cedula;
    
    
    public BL_Cliente(String Nombre,String Direccion, String cedula){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Cedula = cedula;
    }
         public BL_Cliente(){
            
        }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public boolean insertarCliente(String Nombre, String Direccion,String Cedula ){
         DAO.DAO_Cliente daoCli = new DAO_Cliente();
        return  daoCli.ingresarCliente(Nombre, Direccion, Cedula); 
    }
 
    
    
}
