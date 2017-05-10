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
public class ManejoDirecctorios {
    
    public static String os = System.getProperty("os.name").toLowerCase();
    
    public static String getDirectoriosPorSO() {
        String os = System.getProperty("os.name").toLowerCase();
        String direccWind = System.getProperty("user.home") + "\\.llyrg";
        String direccLinux = System.getProperty("user.home") + "/.llyrg";
        if (os.equals("linux")) {
            return direccLinux;
        } else {
            return direccWind;
        }
    }
    
    public static String getNombreArchivoConfDB(){
        if (os.equals("linux")) {
            return "/dbconfig.properties";
        }else{
            return "\\dbconfig.properties";
        }
    }
    
    public static String getNombreArchivoRegistroExcepciones(){
        if (os.equals("linux")) {
            return "/logExcepciones.txt";
        }else{
            return "\\logExcepciones.txt";
        }
    }
    
}
