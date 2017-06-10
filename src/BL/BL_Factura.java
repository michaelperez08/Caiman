/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAO.DAO_Factura;
import TO.TO_Factura;
import TO.TO_LineaFactura;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Extreme PC
 */
public class BL_Factura {

    private int idFactura;
    private String NombreCliente;
    private String TelefonoCliente;
    private String DireccionCliente;
    private Double PrecioTotal;
    private Date FechaExpiracion;
    private Double Subtotal;
    private Boolean Contado;
    private Double ImpVenta;
    ArrayList<BL_LineaFactura> ListaLineaFactura = new ArrayList();

    public BL_Factura(int idFactura, String NombreCliente, String TelefonoCliente, String DireccionCliente, Double PrecioTotal, Date fecha, Double subtotal, Double impventa, Boolean contado, ArrayList<BL_LineaFactura> listaLineaFactura) {
        this.idFactura = idFactura;
        this.NombreCliente = NombreCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.DireccionCliente = DireccionCliente;
        this.PrecioTotal = PrecioTotal;
        this.FechaExpiracion = fecha;
        this.Subtotal = subtotal;
        this.ImpVenta = impventa;
        this.Contado = contado;
        this.ListaLineaFactura = listaLineaFactura;

    }

    public BL_Factura(int idFactura, String NombreCliente, String TelefonoCliente, String DireccionCliente, Double PrecioTotal, Date fecha, Double subtotal, Double impventa, Boolean contado) {

        this.NombreCliente = NombreCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.DireccionCliente = DireccionCliente;
        this.PrecioTotal = PrecioTotal;
        this.FechaExpiracion = fecha;
        this.Subtotal = subtotal;
        this.ImpVenta = impventa;
        this.Contado = contado;

    }

    public BL_Factura() {

    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getTelefonoCliente() {
        return TelefonoCliente;
    }

    public void setTelefonoCliente(String TelefonoCliente) {
        this.TelefonoCliente = TelefonoCliente;
    }

    public String getDireccionCliente() {
        return DireccionCliente;
    }

    public void setDireccionCliente(String DireccionCliente) {
        this.DireccionCliente = DireccionCliente;
    }

    public Double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(Double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    public Date getFechaExpiracion() {
        return FechaExpiracion;
    }

    public void setFechaExpiracion(Date fecha) {
        this.FechaExpiracion = fecha;
    }

    public Double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public Boolean getContado() {
        return Contado;
    }

    public void setContado(Boolean Contado) {
        this.Contado = Contado;
    }

    public Double getImpVenta() {
        return ImpVenta;
    }

    public void setImpVenta(Double ImpVenta) {
        this.ImpVenta = ImpVenta;
    }

    public ArrayList<BL_LineaFactura> Retornar() {
        return this.ListaLineaFactura;
    }

    public boolean ingresarFactura(String nombreCliente, String telefono, String direccion,
            double precioTotal, ArrayList<BL_LineaFactura> blListaLineas, double subTotal, double impVenta, int contado, Date fechaExpiracion) {
        DAO_Factura daoFactura = new DAO_Factura();
        ArrayList<TO_LineaFactura> toListaLineas = new ArrayList<>();
        for (BL_LineaFactura blListaLinea : blListaLineas) {
            toListaLineas.add(new TO_LineaFactura(blListaLinea.getCantidad(), blListaLinea.getDetalle(),
                    blListaLinea.getPrecioUnitario(), blListaLinea.getPrecioTotalLinea()));
        }
        return daoFactura.ingresarFactura(nombreCliente, telefono, direccion, precioTotal, toListaLineas, subTotal, impVenta, contado, fechaExpiracion);
    }

    public ArrayList<BL_Factura> cargarFactura() {
        ArrayList<TO_Factura> listaToFactura;
        ArrayList<BL_Factura> listaBlFactura = new ArrayList<>();
        ArrayList<BL_LineaFactura> listaBl_LineaFactura = new ArrayList<>();
        DAO_Factura daoFactura = new DAO_Factura();
        listaToFactura = daoFactura.cargarFactura();

        for (TO_Factura facturaTemp : listaToFactura) {
            listaBlFactura.add(new BL_Factura(facturaTemp.idFactura, facturaTemp.NombreCliente, facturaTemp.TelefonoCliente, facturaTemp.DireccionCliente,
                    facturaTemp.PrecioTotal, facturaTemp.Fecha, facturaTemp.Subtotal, facturaTemp.ImpVenta, facturaTemp.Contado, listaBl_LineaFactura));
            listaBlFactura.get(listaBlFactura.size()-1).ListaLineaFactura = new ArrayList<BL_LineaFactura>();
            for (TO_LineaFactura toTempLineaFactura : facturaTemp.ListaLineaFactura) {    
                listaBlFactura.get(listaBlFactura.size()-1).ListaLineaFactura.add(new BL_LineaFactura(toTempLineaFactura.getIdFactura(),0, 
                        toTempLineaFactura.getCantidad(), toTempLineaFactura.getDetalle(), toTempLineaFactura.getPrecioUnitario(), toTempLineaFactura.getPrecioTotalLinea()));
            }
        }
        return listaBlFactura;
    }
    
    //public BL_LineaFactura cargarLineasFactura()

}
