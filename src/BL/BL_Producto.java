/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAO.DAO_Aro;
import DAO.DAO_Llanta;

/**
 *
 * @author michael
 */
public abstract class BL_Producto {
    
    protected int cantidad;
    protected int idProducto;

    public BL_Producto(int cantidad, int idProducto) {
        this.cantidad = cantidad;
        this.idProducto = idProducto;
    }
    
    public BL_Producto(int cantidad) {
        this.cantidad = cantidad;
    }

    public BL_Producto() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    public boolean actualizarCantidad(int cantidad){
        return false;
    }
    
    
}
