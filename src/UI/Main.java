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
import BL.BL_Llanta;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import config.ConfBD;

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
               
        } catch (Exception e) {
            
        }

        ConfBD confdb = new ConfBD();
        /*LogIn login = new LogIn(null, true);
         if(login.iniciarLogIn()) {
         login.setVisible(true);
         } else {
         System.exit(0);
         }
         */
        //LogIn li = new LogIn(null, true);
        //li.setVisible(true);
        Principal p = new Principal();
        p.setVisible(true);

    }

}
