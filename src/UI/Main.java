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
import BL.BL_Imprimir;
import HE.Exepciones;
import javax.swing.UIManager;
import config.ConfBD;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException, Exepciones {
        try {
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

            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        ConfBD confdb = new ConfBD();
//        UI_LogIn login = new UI_LogIn(null, true);
//        if (login.iniciarLogIn()) {
//            login.setVisible(true);
//        } else {
//            System.exit(0);
//        }

//        LogIn li = new LogIn(null, true);
//        li.setVisible(true);
        Principal p = new Principal();
        p.setVisible(true);
//        BL_Imprimir bli = new BL_Imprimir();
//        bli.imprimir();
//        
    }

}
