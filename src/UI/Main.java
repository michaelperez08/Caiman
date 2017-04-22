/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author michael
 */
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import dbconfig.ConfBD;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
               //UIManager.setLookAndFeel (WebLookAndFeel.class.getCanonicalName());
              //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
              //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (Exception e) {
    // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        ConfBD confdb = new ConfBD();
        LogIn login = new LogIn(null, true);
        if(login.iniciarLogIn()) {
        login.setVisible(true);
        } else {
            System.exit(0);
        }
    }
    
}
