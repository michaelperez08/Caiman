/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael
 */
public final class ConfBD {

    public ConfBD() {
        leerConfigXML();
    }

    public void leerConfigXML() {

        String pathCarpProperties = ManejoDirecctorios.getDirectoriosPorSO();
        String pathArchProperties = ManejoDirecctorios.getNombreArchivoConfDB();
        Properties prop = new Properties();
        OutputStream output = null;
        try {
            InputStream is = new FileInputStream(pathCarpProperties + pathArchProperties);
            prop.load(is);
        } catch (FileNotFoundException fnfe) {
            try {
                new File(pathCarpProperties).mkdir();
                new File(pathCarpProperties + pathArchProperties).createNewFile();
                output = new FileOutputStream(pathCarpProperties + pathArchProperties);
                prop.setProperty("servidor", "localhost");
                prop.setProperty("usuarioDB", "root");
                prop.setProperty("nombreDB", "LlantasyReencauchesGriegos");
                prop.setProperty("passwordDB", "root");
                prop.store(output, null);
                leerConfigXML();
            } catch (IOException ex) {
                Logger.getLogger(ConfBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(ConfBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (prop.getProperty("servidor") != null) {
            System.setProperty("servidor", prop.getProperty("servidor"));
            System.setProperty("usuarioDB", prop.getProperty("usuarioDB"));
            System.setProperty("nombreDB", prop.getProperty("nombreDB"));
            System.setProperty("passwordDB", prop.getProperty("passwordDB"));
        }
    }

    public boolean modificarConfigProp(String usuario, String contrasena, String nombreBD,String servidor) {
        Properties prop = new Properties();
        String pathCarpProperties = ManejoDirecctorios.getDirectoriosPorSO();
        String pathArchProperties = ManejoDirecctorios.getNombreArchivoConfDB();
        OutputStream output = null;
        try {
            output = new FileOutputStream(pathCarpProperties + pathArchProperties);
            prop.setProperty("servidor", servidor);
            prop.setProperty("usuarioDB", usuario);
            prop.setProperty("nombreDB", nombreBD);
            prop.setProperty("passwordDB", contrasena);
            prop.store(output, null);
            leerConfigXML();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConfBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConfBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /*public String[] getDirectoriosPorSO() {
        String os = System.getProperty("os.name").toLowerCase();
        String[] direccWind = {System.getProperty("user.home") + "\\.llyrg-dbconfig", "\\dbconfig.properties"};
        String[] direccLinux = {System.getProperty("user.home") + "/.llyrg-dbconfig", "/dbconfig.properties"};
        if (os.equals("linux")) {
            return direccLinux;
        } else {
            return direccWind;
        }
    }*/

}
