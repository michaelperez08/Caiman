/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAO.DAO_Telefono;

/**
 *
 * @author Extreme PC
 */
public class BL_Telefono {
    int id;
    String Telefono;
    
    public BL_Telefono(String Telefono){
        this.Telefono = Telefono;
    }
     public BL_Telefono(int id,String Telefono){
        this.Telefono = Telefono;
    }
    public BL_Telefono(){
        
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
    public boolean ingresarTelefono(String telefono){
          DAO.DAO_Telefono daotele = new DAO_Telefono();
        return  daotele.ingresarTelefono(telefono); 
        
    } 
}
