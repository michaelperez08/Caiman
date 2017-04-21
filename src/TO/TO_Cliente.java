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
    int id; 
    String Nombre;
    String Direccion;
    String Cedula;
    
    
    public TO_Cliente(String Nombre,String Direccion, String Cedula){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Cedula = Cedula;
    }
    public TO_Cliente(int id ,String Nombre,String Direccion, String Cedula){
        this.id = id;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Cedula = Cedula;
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
    
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
