/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HE;

/**
 *
 * @author michael
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroExcepciones {

    static BufferedWriter bw = null;
    static FileWriter fw = null;

    public static void RegistrarExcepcion(String excepcion) {
        try {
            fw = new FileWriter(config.ManejoDirecctorios.getDirectoriosPorSO() + config.ManejoDirecctorios.getNombreArchivoRegistroExcepciones(),true);
            bw = new BufferedWriter(fw);
            bw.write(excepcion);
        } catch (IOException ex) {
            Logger.getLogger(RegistroExcepciones.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }
}