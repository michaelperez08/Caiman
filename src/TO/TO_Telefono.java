/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TO;

/**
 *
 * @author Extreme PC
 */
public class TO_Telefono {
    int id;
    String Telefono;
    
    public TO_Telefono(String Telefono){
        this.Telefono = Telefono;
    }
     public TO_Telefono(int id,String Telefono){
        this.Telefono = Telefono;
    }
    public TO_Telefono(){
        
    }
    
    public String getTelefono(){
        return Telefono;
    } 
    
    public void setTelefono(String Telefono){
       this.Telefono = Telefono; 
    }
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
