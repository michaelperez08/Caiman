/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author michael
 */
public class Validacion {
    
    public static void validarLongitud(String texto, java.awt.event.KeyEvent evt, int maximo){
        if (texto.length()>=maximo) {
            evt.consume();
        }
    }
    
    public static boolean soloNumeros(java.awt.event.KeyEvent evt){
        int codigo = evt.getKeyChar();
        if(codigo<=47 || codigo>=58){
            evt.consume();
            return false;
        }else{
            return true;
        }
    }
    
}
