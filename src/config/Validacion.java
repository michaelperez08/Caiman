/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author michael
 */
public class Validacion {
    
    public static void validarLongitud(JTextComponent campo, java.awt.event.KeyEvent evt, int maximo){
        String texto = campo.getText();
        if(texto.length() > maximo){
            campo.setText(texto.substring(0,maximo-1));
        }
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
    
    public static boolean soloNumerosConDecimales(java.awt.event.KeyEvent evt){
       int codigo = evt.getKeyChar();
        if((codigo<=47 || codigo>=58) && codigo != 46){ //46 es el codigo ascii del punto (.).
            evt.consume();
            return false;
        }else{
            return true;
        }
    }
    
}
