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
public class TO_Cliente {
    public int idCliente; 
    public String Nombre;
    public String direccion_simple;
    public String direccion_exacta;
    public String Cedula;
    public String Telefonos;
    
    
    public TO_Cliente(String Nombre, String direccion_simple, String direccion_exacta, String Cedula, String Telefonos){
        this.Nombre = Nombre;
        this.direccion_simple = direccion_simple;
        this.direccion_exacta = direccion_exacta;
        this.Cedula = Cedula;
        this.Telefonos = Telefonos;
    }
    public TO_Cliente(int idCliente, String Nombre, String direccion_simple, String direccion_exacta, String Cedula, String Telefonos){
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.direccion_simple = direccion_simple;
        this.direccion_exacta = direccion_exacta;
        this.Cedula = Cedula;
        this.Telefonos = Telefonos;
    }
         public TO_Cliente(){
            
        }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion_simple() {
        return direccion_simple;
    }

    public void setDireccion_simple(String direccion_simple) {
        this.direccion_simple = direccion_simple;
    }

    public String getDireccion_exacta() {
        return direccion_exacta;
    }

    public void setDireccion_exacta(String direccion_exacta) {
        this.direccion_exacta = direccion_exacta;
    }

    public String getTelefonos() {
        return Telefonos;
    }

    public void setTelefonos(String Telefonos) {
        this.Telefonos = Telefonos;
    }
    
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    
      public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int Cliente) {
        this.idCliente = Cliente;
    }

}
