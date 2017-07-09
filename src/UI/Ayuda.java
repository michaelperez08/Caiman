/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author alberto
 */
public class Ayuda {
     public void abrirAyuda() {
        String direcCarp = getDirectoriosPorSO()[0];
        String archivoCHM = getDirectoriosPorSO()[1];
        InputStream is = null;
        File helpchm = new File(direcCarp+archivoCHM);
        if (helpchm.exists()) {
            ejecutarComando(helpchm);
        } else {
            try {
                is = this.getClass().getResourceAsStream("/help/Help.chm");
                Files.copy(is, helpchm.toPath(), StandardCopyOption.REPLACE_EXISTING);
                abrirAyuda();
            } catch (IOException ex1) {
                Logger.getLogger(Ayuda.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    public void ejecutarComando(File file){
        String os = System.getProperty("os.name");
        String url = file.getAbsolutePath();
            if (os.equals("Linux")) {
                String comnado = "chmsee " + URLparaLinux(url);
                try {
                    Runtime.getRuntime().exec(new String[]{"bash", "-c", comnado});
                    //file.delete();
                } catch (IOException ex) {
                    Logger.getLogger(UI_LogIn.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {try {
                    Runtime.getRuntime().exec("hh.exe " + URLparaWindows(url));
                } catch (IOException ex) {
                    Logger.getLogger(UI_LogIn.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }

    public String[] getDirectoriosPorSO() {
        String os = System.getProperty("os.name").toLowerCase();
        String[] direccWind = {System.getProperty("user.home") + "\\.expDig", "\\help.chm"};
        String[] direccLinux = {System.getProperty("user.home") + "/.expDig", "/help.chm"};
        if (os.equals("linux")) {
            return direccLinux;
        } else {
            return direccWind;
        }
    }

    public static String URLparaLinux(String url) {
        String nuevaURL = "";
        int desde = 0;
        if (url.substring(0, 5).equals("file:")) {
            url = url.substring(5);
        }
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) == '%') {
                nuevaURL += url.substring(desde, i) + '\\' + " ";
                i += 3;
                desde = i;
            } else if (url.charAt(i) == '\'') {
                nuevaURL += url.substring(desde, i) + '\\' + "'";
                desde = i + 1;
            } else if (url.charAt(i) == '!') {
                nuevaURL += url.substring(desde, i) + '\\';
                desde = i + 1;
            }
        }
        nuevaURL += url.substring(desde, url.length());
        return nuevaURL;
    }

    public static String URLparaWindows(String url) {
        String nuevaURL = "";
        int desde = 0;
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) == '%') {
                nuevaURL += url.substring(desde, i) + " ";
                i += 3;
                desde = i;
            }
        }
        nuevaURL += url.substring(desde, url.length());
        return nuevaURL.substring(1);
    }
}
