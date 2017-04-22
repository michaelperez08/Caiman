/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAO.DAO_Cliente;
import TO.TO_Cliente;
import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class BL_Cliente {
    public int idCliente; 
    public String Nombre;
    public String Direccion;
    public String Cedula;
    public String Telefonos;
    
    
    public BL_Cliente(String Nombre,String Direccion, String Cedula, String listaTelefonos){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Cedula = Cedula;
        this.Telefonos = listaTelefonos;
    }
    public BL_Cliente(int idCliente ,String Nombre,String Direccion, String Cedula, String listaTelefonos){
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Cedula = Cedula;
        this.Telefonos = listaTelefonos;
    }
    
    public BL_Cliente(){

    }

    public String getListaTelefonos() {
        return Telefonos;
    }

    public void setListaTelefonos(String listaTelefonos) {
        this.Telefonos = listaTelefonos;
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

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean insertarCliente(String Nombre, String Direccion, String Cedula){
         DAO.DAO_Cliente daoCli = new DAO_Cliente();
        return  daoCli.ingresarCliente(Nombre, Direccion, Cedula); 
    }
 
    public ArrayList<BL_Cliente> cargarClientes() {
        ArrayList<TO_Cliente> listaToClientes;
        ArrayList<BL_Cliente> listaBlClientes = new ArrayList<>();
        DAO_Cliente daoCliente = new DAO_Cliente();
        listaToClientes = daoCliente.cargarClientes();
        for(TO_Cliente tem : listaToClientes) {
            listaBlClientes.add(new BL_Cliente(tem.idCliente, tem.Nombre, tem.Direccion, tem.Cedula, tem.Telefonos));
        }
        return listaBlClientes;
    }
    
}
