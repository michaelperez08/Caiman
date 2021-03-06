/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAO.DAO_Llanta;
import TO.TO_Llanta;
import java.util.ArrayList;

/**
 *
 * @author Extreme PC
 */
public class BL_Llanta extends BL_Producto{
    private String NumeroLlanta;
    private String Marca;
    private String Diseno;
    private String NumeroCapas;
    private String TipoLlanta;
    
   public BL_Llanta(int idLlanta,String NumeroLlanta, String Marca,String Diseno,String NumeroCapas,int Cantidad,String TipoLlanta){
       super(Cantidad, idLlanta);
       this.NumeroLlanta = NumeroLlanta;
       this.Marca = Marca;
       this.Diseno = Diseno;
       this.NumeroCapas = NumeroCapas;
       this.TipoLlanta = TipoLlanta;
   }
   
   public BL_Llanta(BL_Llanta llanta){
       super(llanta.getCantidad(), llanta.getIdProducto());
       this.NumeroLlanta = llanta.NumeroLlanta;
       this.Marca = llanta.Marca;
       this.Diseno = llanta.Diseno;
       this.NumeroCapas = llanta.NumeroCapas;
       this.TipoLlanta = llanta.TipoLlanta;
   }
   
   public BL_Llanta(String NumeroLlanta, String Marca,String Diseno,String NumeroCapas,int Cantidad,String TipoLlanta){
       super(Cantidad);
       this.NumeroLlanta = NumeroLlanta;
       this.Marca = Marca;
       this.Diseno = Diseno;
       this.NumeroCapas = NumeroCapas;
       this.TipoLlanta = TipoLlanta;
   }
   
   public BL_Llanta(){
       super();
   }
    
    public String getNumeroLlanta() {
        return NumeroLlanta;
    }

    public void setNumeroLlantas(String NumeroLlanta) {
        this.NumeroLlanta = NumeroLlanta;
    }
    
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    public String getDiseno() {
        return Diseno;
    }

    public void setDiseno(String Diseno) {
        this.Diseno = Diseno;
    }
    
    public String getNumeroCapas() {
        return NumeroCapas;
    }

    public void setNumeroCapas(String NumeroCapas) {
        this.NumeroCapas= NumeroCapas;
    }
    
     public String getTipoLlanta() {
        return TipoLlanta;
    }

    public void setTipoLlanta(String TipoLlanta) {
        this.TipoLlanta = TipoLlanta;
    }
   
    public boolean IngresarLlanta(String numeroLlanta, String marca,String diseno,String numeroCapas,int cantidad,String tipoLlanta){
        DAO_Llanta daoLlanta = new DAO_Llanta();
        return daoLlanta.ingresarLLanta(numeroLlanta, marca, diseno, numeroCapas, cantidad, tipoLlanta);
    }
    
    public boolean modificarLlanta(int idLlanta,String NumeroLlanta, String Marca,String Diseno,String NumeroCapas,int Cantidad,String TipoLlanta){
        DAO_Llanta daoLlanta = new DAO_Llanta();
        return daoLlanta.modificarLlanta(idLlanta, NumeroLlanta, Marca, Diseno, NumeroCapas, Cantidad, TipoLlanta);
        
    }
    public boolean eliminarLlanta() {
        DAO_Llanta daoLlanta = new DAO_Llanta();
        return daoLlanta.eliminarLlanta(idProducto);
    }
    
    
    
    public ArrayList<BL_Llanta> cargarLlantas() {
        ArrayList<TO_Llanta> listaToLlantas;
        ArrayList<BL_Llanta> listaBlLlantas = new ArrayList<>();
        DAO_Llanta daoLlanta = new DAO_Llanta();
        listaToLlantas = daoLlanta.cargarLlantas();

        for (TO_Llanta tem : listaToLlantas) {
            listaBlLlantas.add(new BL_Llanta(tem.idLlanta, tem.NumeroLlanta, tem.Marca, tem.Diseno, tem.NumeroCapas, tem.Cantidad, tem.TipoLlanta));
        }
        return listaBlLlantas;
    }
    
    @Override
    public boolean actualizarCantidad(int cantidad){
        DAO_Llanta daoLlanta = new DAO_Llanta();
        return daoLlanta.actualizarCantidad(this.idProducto, this.cantidad-cantidad);
    }

    @Override
    public String toString() {
        String tipo_detalle = "";
        String capas = "";
        if(!NumeroCapas.isEmpty()){
            capas = NumeroCapas + "ply";
        }
        if(TipoLlanta.equals("Agricola") || TipoLlanta.equals("Industrial")){
            tipo_detalle = TipoLlanta;
        }
        return "Llantas "+ tipo_detalle +" "+ NumeroLlanta +" "+ Marca +" "+ Diseno+" "+capas;
    }
    
    
}
