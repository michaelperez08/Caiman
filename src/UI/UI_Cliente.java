/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.BL_Cliente;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author victoru
 */
public class UI_Cliente extends javax.swing.JDialog {

    /**
     * Creates new form UI_Cliente
     */
    public DefaultListModel dlm_telfonos;
    public BL_Cliente clienteAMostrar;

    public UI_Cliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        dlm_telfonos = new DefaultListModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pum_telefonos = new javax.swing.JPopupMenu();
        jmi_eliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jl_nombre = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        bl_direccion = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        lb_telefono = new javax.swing.JLabel();
        tf_telefono = new javax.swing.JTextField();
        bt_ingresarCliente = new javax.swing.JButton();
        bt_agregarTelefono = new javax.swing.JButton();
        jl_nombre1 = new javax.swing.JLabel();
        tf_cedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_telefonos = new javax.swing.JList();

        jmi_eliminar.setText("Eliminar");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        pum_telefonos.add(jmi_eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar Usuario");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jl_nombre.setForeground(new java.awt.Color(204, 204, 204));
        jl_nombre.setText("Nombre:");

        tf_nombre.setBackground(new java.awt.Color(204, 204, 204));
        tf_nombre.setForeground(new java.awt.Color(51, 51, 51));

        bl_direccion.setForeground(new java.awt.Color(204, 204, 204));
        bl_direccion.setText("Dirección:");

        tf_direccion.setBackground(new java.awt.Color(204, 204, 204));
        tf_direccion.setForeground(new java.awt.Color(51, 51, 51));

        lb_telefono.setForeground(new java.awt.Color(204, 204, 204));
        lb_telefono.setText("Teléfono:");

        tf_telefono.setBackground(new java.awt.Color(204, 204, 204));
        tf_telefono.setForeground(new java.awt.Color(51, 51, 51));
        tf_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_telefonoKeyReleased(evt);
            }
        });

        bt_ingresarCliente.setBackground(new java.awt.Color(51, 51, 51));
        bt_ingresarCliente.setForeground(new java.awt.Color(204, 204, 204));
        bt_ingresarCliente.setText("Ingresar Cliente");
        bt_ingresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ingresarClienteActionPerformed(evt);
            }
        });

        bt_agregarTelefono.setBackground(new java.awt.Color(51, 51, 51));
        bt_agregarTelefono.setForeground(new java.awt.Color(204, 204, 204));
        bt_agregarTelefono.setText("Agregar Teléfono");
        bt_agregarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarTelefonoActionPerformed(evt);
            }
        });

        jl_nombre1.setForeground(new java.awt.Color(204, 204, 204));
        jl_nombre1.setText("Cedula:");

        tf_cedula.setBackground(new java.awt.Color(204, 204, 204));
        tf_cedula.setForeground(new java.awt.Color(51, 51, 51));

        jl_telefonos.setBackground(new java.awt.Color(204, 204, 204));
        jl_telefonos.setForeground(new java.awt.Color(51, 51, 51));
        jl_telefonos.setComponentPopupMenu(pum_telefonos);
        jl_telefonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jl_telefonosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jl_telefonos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bl_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_agregarTelefono)
                            .addComponent(bt_ingresarCliente))))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombre)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombre1)
                    .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bl_direccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_agregarTelefono)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_ingresarCliente)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_agregarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarTelefonoActionPerformed
        String telefono = tf_telefono.getText().trim();
        if (esNumero(telefono)) {
            if (bt_agregarTelefono.getText().equals("Modificar Teléfono")) {
                int telefonoSeleccionado = jl_telefonos.getSelectedIndex();
                dlm_telfonos.setElementAt(telefono, telefonoSeleccionado);
                jl_telefonos.setModel(dlm_telfonos);
                tf_telefono.setText("");
                bt_agregarTelefono.setText("Agregar Teléfono");
            } else {
                //String telefonos = tf_telefono.getText();
                Integer.parseInt(telefono.trim());
                if (!telefono.isEmpty()) {
                    dlm_telfonos.addElement(telefono);
                    jl_telefonos.setModel(dlm_telfonos);
                    tf_telefono.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "No hay telefono que agregar", "Telefonos", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        } else {
            tf_telefono.setText("");
        }
    }//GEN-LAST:event_bt_agregarTelefonoActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        // TODO add your handling code here:
        int tel_seleccionado = jl_telefonos.getSelectedIndex();
        if (tel_seleccionado >= 0) {
            dlm_telfonos.remove(tel_seleccionado);
            jl_telefonos.setModel(dlm_telfonos);
            tf_telefono.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado un teléfono", "Telefono", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void bt_ingresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ingresarClienteActionPerformed
        String nombre = tf_nombre.getText().trim();
        String cedula = tf_cedula.getText().trim();
        String direccion = tf_direccion.getText().trim();
        String telefonos = concatenarTelefonos();
        boolean consultaExitosa;

        if (nombre.isEmpty() || cedula.isEmpty() || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos", "Faltan Datos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (esNumero(cedula)) {
                Integer.parseInt(cedula);
                BL_Cliente cliente = new BL_Cliente();
                if (bt_ingresarCliente.getText().equals("Ingresar Cliente")) {// ingresar cliente nuevo
                    consultaExitosa = cliente.insertarCliente(nombre, direccion, cedula, concatenarTelefonos());
                    if (consultaExitosa) {
                        JOptionPane.showMessageDialog(null, "Cliente Añadido", "Cliente Ingresado", JOptionPane.INFORMATION_MESSAGE);
                        Object[] opciones = {"Si", "No"};
                        int n = JOptionPane.showOptionDialog(null, "Desea ingresar otro cliente?", "Cliente Nuevo",
                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                        if (n == 1) {
                            this.dispose();
                        } else {
                            limpiarCampos();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar cliente, si el error persiste, contacte al adminstrador del sistema", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {//modificar cliente
                    clienteAMostrar.setNombre(nombre);
                    clienteAMostrar.setDireccion(direccion);
                    clienteAMostrar.setCedula(cedula);
                    clienteAMostrar.setTelefonos(telefonos);
                    consultaExitosa = cliente.modificarCliente(clienteAMostrar.getIdCliente(), clienteAMostrar.getNombre(),
                            clienteAMostrar.getDireccion(), clienteAMostrar.getCedula(), clienteAMostrar.getTelefonos());
                    if (consultaExitosa) {
                        JOptionPane.showMessageDialog(null, "Cliente Actualizado con exito", "Cliente Actualizado", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar cliente, si el error persiste, contacte al adminstrador del sistema", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                tf_cedula.setText("");
            }
        }
    }//GEN-LAST:event_bt_ingresarClienteActionPerformed

    private void jl_telefonosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_telefonosMouseReleased
        if (clienteAMostrar != null) {
            bt_agregarTelefono.setText("Modificar Teléfono");
            tf_telefono.setText(jl_telefonos.getSelectedValue() + "");
        }
    }//GEN-LAST:event_jl_telefonosMouseReleased

    private void tf_telefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_telefonoKeyReleased
        // TODO add your handling code here:
        if (tf_telefono.getText().trim().equals("")) {
            bt_agregarTelefono.setText("Agregar Teléfono");
        }
    }//GEN-LAST:event_tf_telefonoKeyReleased

    public String concatenarTelefonos() {
        String telefonos = "";
        for (int i = 0; i < dlm_telfonos.getSize(); i++) {
            telefonos += dlm_telfonos.getElementAt(i) + " ";
        }
        return telefonos;
    }

    public DefaultListModel separarTelefonos(String telefonos) {
        DefaultListModel dlm_temp = new DefaultListModel();
        String[] partTele = telefonos.split(" ");
        for (String telefono : partTele) {
            dlm_temp.addElement(telefono);
        }
        return dlm_temp;
    }

    public void cargarCliente(BL_Cliente cliente) {
        clienteAMostrar = cliente;
        tf_nombre.setText(clienteAMostrar.getNombre());
        tf_direccion.setText(clienteAMostrar.getDireccion());
        tf_cedula.setText(clienteAMostrar.getCedula());
        dlm_telfonos = separarTelefonos(clienteAMostrar.getTelefonos());
        jl_telefonos.setModel(dlm_telfonos);
        bt_ingresarCliente.setText("Modificar Cliente");
    }

    public void limpiarCampos() {
        tf_cedula.setText("");
        tf_direccion.setText("");
        tf_nombre.setText("");
        tf_telefono.setText("");
        dlm_telfonos.clear();
    }

    public boolean esNumero(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe digitar numeros", "Cliente", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                UI_Cliente dialog = new UI_Cliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bl_direccion;
    private javax.swing.JButton bt_agregarTelefono;
    private javax.swing.JButton bt_ingresarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_nombre1;
    private javax.swing.JList jl_telefonos;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JLabel lb_telefono;
    private javax.swing.JPopupMenu pum_telefonos;
    private javax.swing.JTextField tf_cedula;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
}
