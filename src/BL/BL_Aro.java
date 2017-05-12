/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAO.DAO_Aro;

/**
 *
 * @author michael
 */
public class BL_Aro {
     public int idAro;
    public String NumeroAro;
    public String Marca;
    public int Cantidad;
    public String Codigo;
    
    
   public BL_Aro(int idAro,String NumeroAro, String Marca,int Cantidad,String Codigo){
       this.idAro = idAro;
       this.NumeroAro = NumeroAro;
       this.Marca = Marca;
       this.Cantidad = Cantidad;
       this.Codigo = Codigo;
   }
  public BL_Aro(String NumeroAro, String Marca,int Cantidad,String Codigo){
       this.NumeroAro = NumeroAro;
       this.Marca = Marca;
       this.Cantidad = Cantidad;
       this.Codigo = Codigo;
   }
   
   public BL_Aro(){
       
   }
   
   public int getidAro() {
        return idAro;
    }

    public void setidAro(int idAro) {
        this.idAro = idAro;
    }
    
    public String getNumeroAro() {
        return NumeroAro;
    }

    public void setNumeroAro(String NumeroAro) {
        this.NumeroAro= NumeroAro;
    }
    
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad ;
    }
    
     public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
   
    public boolean IngresarAro(String numeroAro, String marca,int cantidad,String codigo){
        DAO_Aro daoAro = new DAO_Aro();
        return daoAro.ingresarAro(numeroAro, marca, cantidad, codigo);
    }
    
}
