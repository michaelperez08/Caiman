/*
 * Copyright (C) 2017 michael
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package config;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author michael
 */
public class DBBackUp {

    static BufferedWriter bw = null;
    static FileWriter fw = null;

    public static void crearBackUp() {
        if (ManejoDirecctorios.os.equalsIgnoreCase("linux")) {
            try {
                //String contrasena = getContrasenaUsuario();
                //if (contrasena.equals(UI.UI_LogIn.bl_usuairo.getContrasena())) {
                    leerCredencialesUsuariosDB();
                    String[] cmd = {"/bin/bash", "-c", "echo | mysqldump -u " + System.getProperty("usuarioDB") + " " + System.getProperty("nombreDB") + " > "
                        + System.getProperty("user.home") + "/llyrg_db_backUp.sql"};
                    Process pb = Runtime.getRuntime().exec(cmd);
                    //ConfBD.modificarFechaUltimoBackUp();
                    String line;
                    BufferedReader input = new BufferedReader(new InputStreamReader(pb.getInputStream()));
                    while ((line = input.readLine()) != null) {
                        System.out.println(line);
                    }
                    input.close();
                    if (checkIfBackUpCreated()) {
                        //Mensajes.mensajeInfomracion("BackUp Creado Exitosamente en home", "LLantas y Reencauches Griegos");
                    } else {
                        Mensajes.mensajeError("Error, no se ha creado el back up, si el error persiste contacte al administrado", "LLantas y Reencauches Griegos");
                    }
                //} else {
                    //Mensajes.mensajeError("Contraseña incorrecta, no se ha creado el back up", "LLantas y Reencauches Griegos");
                //}
            } catch (IOException ex) {
                Logger.getLogger(DBBackUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Mensajes.mensajeInfomracion("Los back ups no se pueden crear en windows todavia,\nEstamos trabajando en ello", "");
        }
    }

    public static String getContrasenaUsuario() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Digite la contraseña su contraseña");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, "The title",
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        if (option == 0) // pressing OK button
        {
            return new String(pass.getPassword());
        }
        return "";
    }

    public static void leerCredencialesUsuariosDB() {
        //String pathArchivo = System.getProperty("user.home") + ManejoDirecctorios.getNombreArchivoCredencialesUsuario();
        String pathArchivo = "";
        File file = new File(pathArchivo);
        if (!file.exists()) {
            try {
                fw = new FileWriter(pathArchivo, true);
                bw = new BufferedWriter(fw);
                bw.write("[mysqldump]\n"
                        + "user=" + System.getProperty("usuarioDB") + "\n"
                        + "password=" + System.getProperty("passwordDB"));
            } catch (IOException ex) {
                Logger.getLogger(DBBackUp.class.getName()).log(Level.SEVERE, null, ex);
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

    public static boolean checkIfBackUpCreated() {
        String pathArchivo = System.getProperty("user.home") + "/llyrg_db_backUp.sql";
        File file = new File(pathArchivo);
        Date fechaCreado;
        /*if (file.exists()) {
            fechaCreado = Validacion.stringToDate(Validacion.getFechaLong(file.lastModified()));
            if (fechaCreado.before(Validacion.stringToDate(Validacion.getFechaActual()))) {
                return false;
            }
            return true;
        } else {
            return false;
        }*/
        return true;
    }

}
