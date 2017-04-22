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
    public String Direccion;
    public String Cedula;
    public String Telefonos;
    
    
    public TO_Cliente(String Nombre,String Direccion, String Cedula, String Telefonos){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Cedula = Cedula;
        this.Telefonos = Telefonos;
    }
    public TO_Cliente(int Cliente ,String Nombre,String Direccion, String Cedula,String Telefonos){
        this.idCliente = Cliente;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
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
    
      public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int Cliente) {
        this.idCliente = Cliente;
    }

}
