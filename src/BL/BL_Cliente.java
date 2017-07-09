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
    private int idCliente; 
    private String Nombre;
    private String direccion_simple;
    private String direccion_exacta;
    private String Cedula;
    private String Telefonos;
    
    
    public BL_Cliente(String Nombre,String direccion_simple, String direccion_exacta, String Cedula, String Telefonos){
        this.Nombre = Nombre;
        this.direccion_simple = direccion_simple;
        this.direccion_exacta = direccion_exacta;
        this.Cedula = Cedula;
        this.Telefonos = Telefonos;
    }
    public BL_Cliente(int idCliente ,String Nombre,String direccion_simple, String direccion_exacta, String Cedula, String Telefonos){
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.direccion_simple = direccion_simple;
        this.direccion_exacta = direccion_exacta;
        this.Cedula = Cedula;
        this.Telefonos = Telefonos;
    }

    public BL_Cliente(String Nombre, String direccion_simple, String Cedula, String Telefonos) {
        this.Nombre = Nombre;
        this.direccion_simple = direccion_simple;
        this.Cedula = Cedula;
        this.Telefonos = Telefonos;
    }
    
    
    
    public BL_Cliente(){

    }

    public String getTelefonos() {
        return Telefonos;
    }

    public void setTelefonos(String Telefonos) {
        this.Telefonos = Telefonos;
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

    public boolean insertarCliente(String Nombre, String direccio_simple, String direccio_exacta, String Cedula,String Telefonos){
         DAO.DAO_Cliente daoCli = new DAO_Cliente();
        return  daoCli.ingresarCliente(Nombre, direccio_simple, direccio_exacta, Cedula,Telefonos); 
    }
    
    public boolean modificarCliente(int idCliente, String Nombre, String direccion_simple, String dirreccion_exacta, String Cedula,String Telefonos){
         DAO.DAO_Cliente daoCli = new DAO_Cliente();
        return  daoCli.modificarCliente(idCliente, Nombre, direccion_simple, dirreccion_exacta, Cedula,Telefonos); 
    }
 
    public ArrayList<BL_Cliente> cargarClientes() {
        ArrayList<TO_Cliente> listaToClientes;
        ArrayList<BL_Cliente> listaBlClientes = new ArrayList<>();
        DAO_Cliente daoCliente = new DAO_Cliente();
        listaToClientes = daoCliente.cargarClientes();
        for(TO_Cliente tem : listaToClientes) {
            listaBlClientes.add(new BL_Cliente(tem.idCliente, tem.Nombre, tem.direccion_simple, tem.direccion_exacta, tem.Cedula, tem.Telefonos));
        }
        return listaBlClientes;
    }
    
    public boolean eliminarCliente() {
        DAO_Cliente daoCliente = new DAO_Cliente();
        return daoCliente.eliminarCliente(idCliente);
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
