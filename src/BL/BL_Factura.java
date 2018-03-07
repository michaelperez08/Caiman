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
    private String CedulaCliente;
    private Double PrecioTotal;
    private Date FechaExpiracion;
    private Date FechaFactura;
    private Double Subtotal;
    private Boolean Contado;
    private Double ImpVenta;
    ArrayList<BL_LineaFactura> ListaLineaFactura = new ArrayList();

    public BL_Factura(int idFactura, String NombreCliente, String TelefonoCliente, String DireccionCliente, Double PrecioTotal, Date fechaExpiracion, Date fechaFactura, 
            Double subtotal, Double impventa, Boolean contado, ArrayList<BL_LineaFactura> listaLineaFactura, String cedulaCliente) {
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

    public BL_Factura(int idFactura, String NombreCliente, String TelefonoCliente, String DireccionCliente, Double PrecioTotal, Date fecha, Date fechaFactura
            , Double subtotal, Double impventa, Boolean contado, String cedulaCliente) {
        this.NombreCliente = NombreCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.DireccionCliente = DireccionCliente;
        this.PrecioTotal = PrecioTotal;
        this.FechaExpiracion = fecha;
        this.Subtotal = subtotal;
        this.ImpVenta = impventa;
        this.Contado = contado;
        this.CedulaCliente = cedulaCliente;
        this.FechaFactura = fechaFactura;
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

    public String getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(String CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }
    

    public ArrayList<BL_LineaFactura> Retornar() {
        return this.ListaLineaFactura;
    }

    public Date getFechaFactura() {
        return FechaFactura;
    }

    public void setFechaFactura(Date FechaFactura) {
        this.FechaFactura = FechaFactura;
    }

    public ArrayList<BL_LineaFactura> getListaLineaFactura() {
        return ListaLineaFactura;
    }

    public void setListaLineaFactura(ArrayList<BL_LineaFactura> ListaLineaFactura) {
        this.ListaLineaFactura = ListaLineaFactura;
    }
    
    public boolean ingresarFactura(String nombreCliente, String telefono, String direccion,
            double precioTotal, ArrayList<BL_LineaFactura> blListaLineas, double subTotal, double impVenta, 
            boolean contado, Date fechaExpiracion, String cedulaCliente, Date fechaFactura) {
        DAO_Factura daoFactura = new DAO_Factura();
        ArrayList<TO_LineaFactura> toListaLineas = new ArrayList<>();
        for (BL_LineaFactura blListaLinea : blListaLineas) {
            toListaLineas.add(new TO_LineaFactura(blListaLinea.getCantidad(), blListaLinea.getDetalle(),
                    blListaLinea.getPrecioUnitario(), blListaLinea.getPrecioTotalLinea()));
        }
        return daoFactura.ingresarFactura(nombreCliente, telefono, direccion, precioTotal, toListaLineas, subTotal, impVenta, contado, fechaExpiracion, cedulaCliente, fechaFactura);
    }

    public ArrayList<BL_Factura> cargarFactura() {
        ArrayList<TO_Factura> listaToFactura;
        ArrayList<BL_Factura> listaBlFactura = new ArrayList<>();
        ArrayList<BL_LineaFactura> listaBl_LineaFactura = new ArrayList<>();
        DAO_Factura daoFactura = new DAO_Factura();
        listaToFactura = daoFactura.cargarFactura();

        for (TO_Factura facturaTemp : listaToFactura) {
            listaBlFactura.add(new BL_Factura(facturaTemp.idFactura, facturaTemp.NombreCliente, facturaTemp.TelefonoCliente, facturaTemp.DireccionCliente,
                    facturaTemp.PrecioTotal, facturaTemp.FechaExpiracion, facturaTemp.getFechaFactura(), facturaTemp.Subtotal, facturaTemp.ImpVenta, facturaTemp.Contado, listaBl_LineaFactura, facturaTemp.CedulaCliente));
            listaBlFactura.get(listaBlFactura.size()-1).ListaLineaFactura = new ArrayList<BL_LineaFactura>();
            for (TO_LineaFactura toTempLineaFactura : facturaTemp.ListaLineaFactura) {    
                listaBlFactura.get(listaBlFactura.size()-1).ListaLineaFactura.add(new BL_LineaFactura(toTempLineaFactura.getIdFactura(),0, 
                        toTempLineaFactura.getCantidad(), toTempLineaFactura.getDetalle(), toTempLineaFactura.getPrecioUnitario(), toTempLineaFactura.getPrecioTotalLinea()));
            }
        }
        return listaBlFactura;
    }
    
    public ArrayList<BL_Factura> busquedaFacturaAvanzada(String cliente, Date desde, Date hasta, int id) {
        ArrayList<TO_Factura> listaToFactura;
        ArrayList<BL_Factura> listaBlFactura = new ArrayList<>();
        ArrayList<BL_LineaFactura> listaBl_LineaFactura = new ArrayList<>();
        DAO_Factura daoFactura = new DAO_Factura();
        listaToFactura = daoFactura.cargarFacturaAvanzado(tipoBusquda(cliente, desde, hasta, id), cliente, desde, hasta, id);
        for (TO_Factura facturaTemp : listaToFactura) {
            listaBlFactura.add(new BL_Factura(facturaTemp.idFactura, facturaTemp.NombreCliente, facturaTemp.TelefonoCliente, facturaTemp.DireccionCliente,
                    facturaTemp.PrecioTotal, facturaTemp.FechaExpiracion, facturaTemp.getFechaFactura(), facturaTemp.Subtotal, facturaTemp.ImpVenta, facturaTemp.Contado, listaBl_LineaFactura, facturaTemp.CedulaCliente));
            listaBlFactura.get(listaBlFactura.size()-1).ListaLineaFactura = new ArrayList<BL_LineaFactura>();
            for (TO_LineaFactura toTempLineaFactura : facturaTemp.ListaLineaFactura) {    
                listaBlFactura.get(listaBlFactura.size()-1).ListaLineaFactura.add(new BL_LineaFactura(toTempLineaFactura.getIdFactura(),0, 
                        toTempLineaFactura.getCantidad(), toTempLineaFactura.getDetalle(), toTempLineaFactura.getPrecioUnitario(), toTempLineaFactura.getPrecioTotalLinea()));
            }
        }
        return listaBlFactura;
    }
    
    public String tipoBusquda(String cliente, Date desde, Date hasta, int id){
        if(!cliente.isEmpty() && desde!=null && hasta!=null){
            return "CF";
        }else if(cliente.isEmpty() && desde!=null && hasta!=null){
            return "F";
        }else if(id>0){
            return "N";
        }else{
            return null;
        }
    }
    
    public static String formatearIDFactura(int id){
        return ("00000" + id).substring(String.valueOf(id).length());
    }

}
