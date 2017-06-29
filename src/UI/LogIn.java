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

import BL.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import config.ConfBD;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;

public class LogIn extends javax.swing.JDialog {

    /**
     * Creates new form LogIn
     */
    
    public static BL_Usuario bl_usuairo;
    
    public LogIn(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public boolean iniciarLogIn() {
        BL_Usuario blu = new BL_Usuario();
        int cantUsu = blu.getCantidadUsuarios();
        if (cantUsu == 0) {
            if (!guardarUsuario()) {
                return false;
            }
        } else if (cantUsu < 0) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "ERROR DE CONEXION", JOptionPane.ERROR_MESSAGE);
            bloquerLogIn();
        }
        return true;
    }
    
    public void probarConeccion() {
        if (new DAO.DAO_Conexion().probarConeccion()) {
            desbloquerLogIn();
            JOptionPane.showMessageDialog(null, "Conexion Establecida", "Nueva Conexion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            bloquerLogIn();
            JOptionPane.showMessageDialog(null, "No hay conexion con la Base de Datos", "Nueva Conexion", JOptionPane.ERROR_MESSAGE);
        }
    }
 
    public void bloquerLogIn() {
        tf_usuario.setEnabled(false);
        tf_contrasena.setEnabled(false);
        bt_logIn.setEnabled(false);
    }
 
    public void desbloquerLogIn() {/*
        tf_usuario.setEnabled(true);
        jpf_contraseña.setEnabled(true);
        bt_entrar.setEnabled(true);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_contrasena = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        bt_logIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tf_contrasena.setBackground(new java.awt.Color(204, 204, 204));
        tf_contrasena.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tf_contrasena.setForeground(new java.awt.Color(51, 51, 51));
        tf_contrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_contrasena.setPreferredSize(new java.awt.Dimension(14, 25));
        tf_contrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_contrasenaKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contraseña");

        bt_logIn.setBackground(new java.awt.Color(0, 51, 255));
        bt_logIn.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        bt_logIn.setForeground(new java.awt.Color(0, 0, 0));
        bt_logIn.setText("Aceptar");
        bt_logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_logInActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");
        jLabel2.setPreferredSize(new java.awt.Dimension(91, 17));

        tf_usuario.setBackground(new java.awt.Color(204, 204, 204));
        tf_usuario.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tf_usuario.setForeground(new java.awt.Color(51, 51, 51));
        tf_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_usuarioKeyReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/llanta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_usuario)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(bt_logIn)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(bt_logIn)
                .addContainerGap())
        );

        jMenu1.setText("Conexión");

        jMenuItem1.setText("Probar Conexión");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_logInActionPerformed
        // TODO add your handling code here:
        logIn();
    }//GEN-LAST:event_bt_logInActionPerformed

    
    private void tf_contrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_contrasenaKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    logIn();
                }
    }//GEN-LAST:event_tf_contrasenaKeyReleased

    private void tf_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_usuarioKeyReleased
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    tf_contrasena.requestFocusInWindow();
                }
    }//GEN-LAST:event_tf_usuarioKeyReleased

    /**
     * @param args the command line arguments
     */

    
    private boolean guardarUsuario() {
        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
        JTextField password2 = new JPasswordField();
        String name = "";
        Object[] message = {"Ingrese un usuario para administrar el sistema",
            "Username:", username,
            "Contraseña:", password,
            "Repetir Contraseña:", password2
        };
        boolean continuar = false;
 
        do {
            int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
 
            if (option == JOptionPane.OK_OPTION) {
 
                if (username.getText().trim().equals("") || password.getText().trim().equals("")
                        || password2.getText().trim().equals("") || username.getText().length() > 45
                        || password.getText().length() > 45 || password2.getText().length() > 45) {
 
                    JOptionPane.showMessageDialog(null, "Todos los campos deben tener entre 1 y 45 caracteres", "Campos no validos", JOptionPane.INFORMATION_MESSAGE);
                    username.setText("");
                    password.setText("");
                    password2.setText("");
 
                } else {
                    if (password.getText().trim().equals(password2.getText().trim())) {
                        BL_Usuario blu = new BL_Usuario();
                        blu.guardarUsuario(username.getText().trim(), password.getText().trim(), "Administrador");
                        JOptionPane.showMessageDialog(null, "Usuario guardado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
                        continuar = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Las contraseñas deben ser iguales", "Contraseñas diferentes", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } else if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION) {
                return false;
            }
        } while (!continuar);
 
        return true;
    }
    
    private void logIn(){
        if (tf_usuario.getText().trim().isEmpty() || tf_contrasena.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo de usuario o conraseña vacios", "ERROR",JOptionPane.ERROR_MESSAGE);
        } else {
            bl_usuairo = new BL_Usuario(tf_usuario.getText(), new String(tf_contrasena.getPassword()), "Administrador").LogIn();
            if (bl_usuairo != null) {
                Principal p = new Principal();
                p.setVisible(true);
                this.setVisible(false);
            } else {
                 JOptionPane.showMessageDialog(null, "Campo de usuario o conraseña incorrectos", "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_logIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tf_contrasena;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
}
