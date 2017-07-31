/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael
 */
public class BL_Formatos {

    public static String fomratoPrecio(double precio) {
        NumberFormat format = DecimalFormat.getInstance();
        format.setRoundingMode(RoundingMode.FLOOR);
        format.setMinimumFractionDigits(0);
        format.setMaximumFractionDigits(2);
        return ("           " + format.format(precio)).substring(String.valueOf(precio).length());
        //return format.format(precio);
    }

    public static Double getDoubleValue(String valor) {
        double d = 0.0;
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        Number number;
        try {
            number = format.parse(valor);
            d = number.doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(BL_Formatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }

}
