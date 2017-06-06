/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.BL_Usuario;
import config.Validacion;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class UI_Usuario extends javax.swing.JDialog {

    /**
     * Creates new form UI_Usuario
     */
    
    private BL_Usuario usuarioCargar;
    public boolean actualizarLista;
    
    public UI_Usuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pn_IngresarLlanta = new javax.swing.JPanel();
        lb_numeroAro = new javax.swing.JLabel();
        lb_marca = new javax.swing.JLabel();
        lb_codigo = new javax.swing.JLabel();
        lb_cantidad = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        bt_ingresarUsuario = new javax.swing.JButton();
        cb_tipoUsuario = new javax.swing.JComboBox<>();
        pf_contrasena = new javax.swing.JPasswordField();
        pf_confirmar = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_IngresarLlanta.setBackground(new java.awt.Color(51, 51, 51));
        pn_IngresarLlanta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_numeroAro.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_numeroAro.setForeground(new java.awt.Color(255, 255, 255));
        lb_numeroAro.setText("Nombre del usuario");
        pn_IngresarLlanta.add(lb_numeroAro, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 31));

        lb_marca.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_marca.setForeground(new java.awt.Color(255, 255, 255));
        lb_marca.setText("Contraseña");
        pn_IngresarLlanta.add(lb_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, 148, 32));

        lb_codigo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_codigo.setForeground(new java.awt.Color(255, 255, 255));
        lb_codigo.setText("Tipo");
        pn_IngresarLlanta.add(lb_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 136, 148, 32));

        lb_cantidad.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_cantidad.setForeground(new java.awt.Color(255, 255, 255));
        lb_cantidad.setText("Confirmar contraseña");
        pn_IngresarLlanta.add(lb_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, -1, 32));

        tf_nombre.setForeground(new java.awt.Color(51, 51, 51));
        tf_nombre.setPreferredSize(new java.awt.Dimension(258, 31));
        tf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nombreKeyTyped(evt);
            }
        });
        pn_IngresarLlanta.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 6, 258, 31));

        bt_ingresarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        bt_ingresarUsuario.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        bt_ingresarUsuario.setForeground(new java.awt.Color(204, 204, 204));
        bt_ingresarUsuario.setText("Ingresar Usuario");
        bt_ingresarUsuario.setPreferredSize(new java.awt.Dimension(148, 32));
        bt_ingresarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ingresarUsuarioActionPerformed(evt);
            }
        });
        pn_IngresarLlanta.add(bt_ingresarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 186, 258, -1));

        cb_tipoUsuario.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        cb_tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estandar", "Administrador" }));
        pn_IngresarLlanta.add(cb_tipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 136, 258, 32));

        pf_contrasena.setPreferredSize(new java.awt.Dimension(258, 31));
        pn_IngresarLlanta.add(pf_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 260, -1));

        pf_confirmar.setPreferredSize(new java.awt.Dimension(258, 31));
        pn_IngresarLlanta.add(pf_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 260, -1));

        getContentPane().add(pn_IngresarLlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombreKeyTyped
        Validacion.validarLongitud(tf_nombre.getText(), evt, 15);
    }//GEN-LAST:event_tf_nombreKeyTyped

    private void bt_ingresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ingresarUsuarioActionPerformed
        String nombreUsuario = tf_nombre.getText().trim();
        String contrasena = new String(pf_contrasena.getPassword());
        String confirmar = new String(pf_confirmar.getPassword());
        String tipoUsuario = cb_tipoUsuario.getSelectedItem().toString().trim();

        boolean consultaExitosa;

        if (nombreUsuario.isEmpty() || contrasena.isEmpty() || confirmar.isEmpty() || tipoUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos", "Faltan Datos", JOptionPane.INFORMATION_MESSAGE);
        } else {
                BL_Usuario blu = new BL_Usuario();
                if (bt_ingresarUsuario.getText().equals("Ingresar Aro")) {// ingresar aro nuevo
                    consultaExitosa = blu.guardarUsuario(nombreUsuario, contrasena, tipoUsuario);
                    if (consultaExitosa) {
                        actualizarLista = true;
                        JOptionPane.showMessageDialog(null, "Aro Añadido", "Aro Ingresado", JOptionPane.INFORMATION_MESSAGE);
                        Object[] opciones = {"Si", "No"};
                        int n = JOptionPane.showOptionDialog(null, "Desea ingresar otro aro?", "Aro Nuevo",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                        if (n == 1) {
                            this.dispose();
                        } else {
                            limpiarCampos();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar Aro, si el error persiste, contacte al adminstrador del sistema", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {//modificar Aro
                    usuarioCargar.setNombreUsuario(nombreUsuario);
                    usuarioCargar.setContrasena(contrasena);
                    usuarioCargar.setTipoUsuario(tipoUsuario);
                    consultaExitosa = usuarioCargar.modificarUsuario(usuarioCargar.getIdUsuario(), usuarioCargar.getNombreUsuario(), usuarioCargar.getContrasena(),
                        usuarioCargar.getTipoUsuario());
                    if (consultaExitosa) {
                        actualizarLista=true;
                        JOptionPane.showMessageDialog(null, "Usuario Actualizado con exito", "Usuario Actualizado", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al ingresar el Usuario, si el error persiste, contacte al adminstrador del sistema", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
           
        }
    }//GEN-LAST:event_bt_ingresarUsuarioActionPerformed

    public void limpiarCampos(){
        tf_nombre.setText("");
        pf_contrasena.setText("");
        pf_confirmar.setText("");
        cb_tipoUsuario.setSelectedIndex(0);
    }
    
    public void cargarUsuarioEditar(BL_Usuario usuairoVer){
        usuarioCargar = usuairoVer;
        tf_nombre.setText(usuarioCargar.getNombreUsuario());
        pf_contrasena.setText(usuarioCargar.getContrasena());
        pf_confirmar.setText(usuarioCargar.getContrasena());
        if(usuarioCargar.getTipoUsuario().equalsIgnoreCase("admin")){
           cb_tipoUsuario.setSelectedIndex(1);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ingresarUsuario;
    private javax.swing.JComboBox<String> cb_tipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_cantidad;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_marca;
    private javax.swing.JLabel lb_numeroAro;
    private javax.swing.JPasswordField pf_confirmar;
    private javax.swing.JPasswordField pf_contrasena;
    private javax.swing.JPanel pn_IngresarLlanta;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
