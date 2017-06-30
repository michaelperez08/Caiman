/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HE;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author michael
 */
public class Exepciones extends Exception{

    public Exepciones() {
    }

    public Exepciones(Throwable cause) {
        super(cause);
        RegistrarError(cause);
    }
    
    
    
    public static void RegistrarError(Throwable cause){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String fecha = dateFormat.format(date);
        String nombre = "---------------------------------------------------\n"+fecha+"\n"+cause.toString()+"\n";
        StackTraceElement[] ste = cause.getStackTrace();
        String trazo = "";
        for (int i = 0; i < ste.length; i++) {
            trazo+=ste[i].toString()+"\n";
        }
        RegistroExcepciones.RegistrarExcepcion(nombre+trazo);
    }
    
    
}
