/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAO.DAO_Aro;
import TO.TO_Aro;
import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class BL_Aro extends BL_Producto{
    private int idAro;
    private String NumeroAro;
    private String Marca;
    private String Codigo;
    
    
   public BL_Aro(int idAro,String NumeroAro, String Marca,int Cantidad,String Codigo){
       super(Cantidad);
       this.idAro = idAro;
       this.NumeroAro = NumeroAro;
       this.Marca = Marca;
       this.Codigo = Codigo;
   }
  public BL_Aro(String NumeroAro, String Marca,int Cantidad,String Codigo){
       super(Cantidad);
       this.NumeroAro = NumeroAro;
       this.Marca = Marca;
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
    
    public boolean modificarAro(int idAro, String numeroAro, String Marca, int Cantidad, String Codigo){
        DAO_Aro daoaro = new DAO_Aro();
        return daoaro.modificarAro(idAro, numeroAro, Marca, Cantidad, Codigo);
    }
    
    public ArrayList<BL_Aro> cargarAros() {
        ArrayList<BL_Aro> listaBlAros = new ArrayList<>();
        ArrayList<TO_Aro> listaToAros = new ArrayList<>();
        DAO_Aro daoAro = new DAO_Aro();
        listaToAros = daoAro.cargarAros();
        for(TO_Aro tem : listaToAros) {
            listaBlAros.add(new BL_Aro(tem.getidAro(), tem.getNumeroAro(), tem.getMarca(), tem.getCantidad(), tem.getCodigo()));
        }
        return listaBlAros;
    }
    
    public boolean eliminarAro() {
        DAO_Aro daoAro = new DAO_Aro();
        return daoAro.eliminarAro(idAro);
    }

    @Override
    public String toString() {
        return "Aro " + NumeroAro +" "+ Marca +" "+ Codigo;
    }
    
    
    
}
