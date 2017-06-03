/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TO;

/**
 *
 * @author alberto
 */
public class TO_LineaFactura {
    
    private int id;
    private int idFactura;
    private int cantidad;
    private String detalle;
    private double precioUnitario;
    private double precioTotalLinea;

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public TO_LineaFactura(int id, int idFactura, int cantidad, String detalle, double precioUnitario, double precioTotalLinea) {
        this.id = id;
        this.idFactura = idFactura;
        this.cantidad = cantidad;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;
        this.precioTotalLinea = precioTotalLinea;
    }

    public TO_LineaFactura(int idFactura, int cantidad, String detalle, double precioUnitario, double precioTotalLinea) {
        this.idFactura = idFactura;
        this.cantidad = cantidad;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;
        this.precioTotalLinea = precioTotalLinea;
    }

    public TO_LineaFactura() {
    }
   //</editor-fold> 
    
     //<editor-fold defaultstate="collapsed" desc="getter and setter">

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioTotalLinea() {
        return precioTotalLinea;
    }

    public void setPrecioTotalLinea(double precioTotalLinea) {
        this.precioTotalLinea = precioTotalLinea;
    }
    //</editor-fold>
    
}
