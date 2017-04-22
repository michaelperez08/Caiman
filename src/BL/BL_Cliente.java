/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAO.DAO_Cliente;
import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class BL_Cliente {
    int id; 
    String Nombre;
    String Direccion;
    String Cedula;
    public ArrayList<String> listaTelefonos;
    
    
    public BL_Cliente(String Nombre,String Direccion, String Cedula, ArrayList<String> listaTelefonos){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Cedula = Cedula;
        this.listaTelefonos = listaTelefonos;
    }
    public BL_Cliente(int id ,String Nombre,String Direccion, String Cedula, ArrayList<String> listaTelefonos){
        this.id = id;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Cedula = Cedula;
        this.listaTelefonos = listaTelefonos;
    }
    
    public BL_Cliente(){

    }

    public ArrayList<String> getListaTelefonos() {
        return listaTelefonos;
    }

    public void setListaTelefonos(ArrayList<String> listaTelefonos) {
        this.listaTelefonos = listaTelefonos;
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

    public boolean insertarCliente(String Nombre, String Direccion, String Cedula){
         DAO.DAO_Cliente daoCli = new DAO_Cliente();
        return  daoCli.ingresarCliente(Nombre, Direccion, Cedula); 
    }
 
    
    
}
