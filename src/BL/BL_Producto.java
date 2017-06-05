/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

/**
 *
 * @author michael
 */
public abstract class BL_Producto {
    
    protected int cantidad;

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
    
}
