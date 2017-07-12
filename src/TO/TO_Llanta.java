/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TO;

/**
 *
 * @author Extreme PC
 */
public class TO_Llanta {
    public int idLlanta;
    public String NumeroLlanta;
    public String Marca;
    public String Diseno;
    public String NumeroCapas;
    public int Cantidad;
    public String TipoLlanta;
    
   public TO_Llanta(int idLlanta,String NumeroLlanta, String Marca,String Diseno,String NumeroCapas,int Cantidad,String TipoLlanta){
       this.idLlanta = idLlanta;
       this.NumeroLlanta = NumeroLlanta;
       this.Marca = Marca;
       this.Diseno = Diseno;
       this.NumeroCapas = NumeroCapas;
       this.Cantidad = Cantidad;
       this.TipoLlanta = TipoLlanta;
   }
   public TO_Llanta(String NumeroLlanta, String Marca,String Diseno,String NumeroCapas,int Cantidad,String TipoLlanta){
       this.NumeroLlanta = NumeroLlanta;
       this.Marca = Marca;
       this.Diseno = Diseno;
       this.NumeroCapas = NumeroCapas;
       this.Cantidad = Cantidad;
       this.TipoLlanta = TipoLlanta;
   }
   
   public TO_Llanta(){
       
   }
   
   public int getidLlanta() {
        return idLlanta;
    }

    public void setidLlanta(int idLlanta) {
        this.idLlanta = idLlanta;
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
    
    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad ;
    }
    
     public String getTipoLlanta() {
        return TipoLlanta;
    }

    public void setTipoLlanta(String TipoLlanta) {
        this.TipoLlanta = TipoLlanta;
    }
   
}
