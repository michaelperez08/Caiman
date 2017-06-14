/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAO.DAO_LineaFactura;
import TO.TO_LineaFactura;
import java.util.ArrayList;

/**
 *
 * @author alberto
 */
public class BL_LineaFactura {
   
    private int id;
    private int idFactura;
    private int idProducto;
    private int cantidad;
    private String detalle;
    private double precioUnitario;
    private double precioTotalLinea;
    
    
 //<editor-fold defaultstate="collapsed" desc="Constructores">
    public BL_LineaFactura(int id, int idFactura, int idProducto, int cantidad, String detalle, double precioUnitario, double precioTotalLinea) {
        this.id = id;
        this.idFactura = idFactura;
        this.idProducto=idProducto;
        this.cantidad = cantidad;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;
        this.precioTotalLinea = precioTotalLinea;
    }

    public BL_LineaFactura(int idFactura, int idProducto, int cantidad, String detalle, double precioUnitario, double precioTotalLinea) {
        this.idFactura = idFactura;
        this.idProducto=idProducto;
        this.cantidad = cantidad;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;
        this.precioTotalLinea = precioTotalLinea;
    }

    public BL_LineaFactura(int cantidad, String detalle, double precioUnitario, double precioTotalLinea) {
        this.cantidad = cantidad;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;
        this.precioTotalLinea = precioTotalLinea;
    }

    public BL_LineaFactura(int idProducto, int cantidad, String detalle, double precioUnitario, double precioTotalLinea) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;
        this.precioTotalLinea = precioTotalLinea;
    }
    
    public BL_LineaFactura() {
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

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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
    
    public boolean ingresarLineaFactura(){
        DAO_LineaFactura daoLineaFactura = new DAO_LineaFactura();
        return daoLineaFactura.ingresarLineaFactura(idFactura, cantidad, detalle, precioUnitario, precioTotalLinea);
    }
    
    public boolean eliminarLineaFactura() {
        DAO_LineaFactura daoLineaFactura = new DAO_LineaFactura();
        return daoLineaFactura.eliminarLineaFactura(id);
    }
    
    public ArrayList<BL_LineaFactura> cargarLineasFactura(){
        DAO_LineaFactura daoLineaFactura = new DAO_LineaFactura();
        ArrayList<BL_LineaFactura> blLineasFactura = new ArrayList<>();
        ArrayList<TO_LineaFactura> toLineasFactura = daoLineaFactura.cargarLineasFactura();
        
        for (TO_LineaFactura tO_LineaFactura : toLineasFactura) {
            blLineasFactura.add(new BL_LineaFactura(tO_LineaFactura.getId(), tO_LineaFactura.getIdFactura(),
                    tO_LineaFactura.getCantidad(), tO_LineaFactura.getDetalle(), tO_LineaFactura.getPrecioUnitario(), 
                    tO_LineaFactura.getPrecioTotalLinea()));
        }
       return blLineasFactura;
    }
    
    public boolean modificarLineaFactura(){
        DAO_LineaFactura daoLineaFactura = new DAO_LineaFactura();
        return daoLineaFactura.modificarLineaFactura(id, idFactura, cantidad, detalle, precioUnitario, precioTotalLinea);
    }
    
    
}
