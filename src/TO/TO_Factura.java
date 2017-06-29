/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TO;

import BL.BL_LineaFactura;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Extreme PC
 */
public class TO_Factura {
public int idFactura;
public String NombreCliente;
public String TelefonoCliente;
public String DireccionCliente;
public String CedulaCliente;
public Double PrecioTotal;
public Date FechaExpiracion;
private Date FechaFactura;
public Double Subtotal;
public Boolean Contado;
public Double ImpVenta;
public ArrayList<TO_LineaFactura> ListaLineaFactura = new ArrayList();

   public TO_Factura(int idFactura, String NombreCliente, String TelefonoCliente, 
           String DireccionCliente, Double PrecioTotal, Date fechaExpiracion, Date fechaFactura,Double subtotal,Double impventa,
           Boolean contado, ArrayList<TO_LineaFactura> listaLineaFactura, String cedulaCliente ) {
        this.idFactura = idFactura;
        this.NombreCliente = NombreCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.DireccionCliente = DireccionCliente;
        this.PrecioTotal = PrecioTotal;
        this.FechaExpiracion = fechaExpiracion;
        this.Subtotal = subtotal;
        this.ImpVenta = impventa;
        this.Contado = contado;
        this.ListaLineaFactura = listaLineaFactura;
        this.CedulaCliente = cedulaCliente;
        this.FechaFactura = fechaFactura;
    }
    public TO_Factura( String NombreCliente, String TelefonoCliente, String DireccionCliente, Double PrecioTotal, 
            Date fechaExpiracion, Date fechaFactura,Double subtotal,Double impventa,Boolean contado, ArrayList<TO_LineaFactura> listaLineaFactura, String cedulaCliente ) {
        
        this.NombreCliente = NombreCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.DireccionCliente = DireccionCliente;
        this.PrecioTotal = PrecioTotal;
        this.FechaExpiracion = fechaExpiracion;
        this.Subtotal = subtotal;
        this.ImpVenta = impventa;
        this.Contado = contado;
        this.ListaLineaFactura = listaLineaFactura;
        this.CedulaCliente = cedulaCliente;
        this.FechaFactura = fechaFactura;
    }

    public TO_Factura() {
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

    public String getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(String CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }

    public Date getFechaFactura() {
        return FechaFactura;
    }

    public void setFechaFactura(Date FechaFactura) {
        this.FechaFactura = FechaFactura;
    }
    
    
     public ArrayList<TO_LineaFactura> Retornar()
        {
            return this.ListaLineaFactura;
        }
}
