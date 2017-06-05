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
private int idFactura;
private String NombreCliente;
private String TelefonoCliente;
private String DireccionCliente;
private Double PrecioTotal;
private Date Fecha;
ArrayList<TO_LineaFactura> ListaLineaFactura = new ArrayList();

    public TO_Factura(int idFactura, String NombreCliente, String TelefonoCliente, String DireccionCliente, Double PrecioTotal, Date fecha, ArrayList<TO_LineaFactura> listaLineaFactura) {
        this.idFactura = idFactura;
        this.NombreCliente = NombreCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.DireccionCliente = DireccionCliente;
        this.PrecioTotal = PrecioTotal;
        this.Fecha = fecha;
        this.ListaLineaFactura = listaLineaFactura;
    }
    public TO_Factura( String NombreCliente, String TelefonoCliente, String DireccionCliente, Double PrecioTotal, Date fecha, ArrayList<TO_LineaFactura> listaLineaFactura ) {
        
        this.NombreCliente = NombreCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.DireccionCliente = DireccionCliente;
        this.PrecioTotal = PrecioTotal;
        this.Fecha = fecha;
        this.ListaLineaFactura = listaLineaFactura;
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

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        this.Fecha = fecha;
    }
    
}
