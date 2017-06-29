/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.BL_Cliente;
import config.Mensajes;
import config.Validacion;
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
    public boolean actualizarLista;

    public UI_Cliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        actualizarLista = false;
        this.setLocationRelativeTo(null);
        dlm_telfonos = new DefaultListModel();
        ta_direccionexacta.setLineWrap(true);
        tf_telefono.setText("506");
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
        bt_ingresarCliente = new javax.swing.JButton();
        bt_agregarTelefono = new javax.swing.JButton();
        jl_nombre1 = new javax.swing.JLabel();
        tf_cedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_telefonos = new javax.swing.JList();
        lb_telefono1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_direccionexacta = new javax.swing.JTextArea();
        tf_telefono = new javax.swing.JFormattedTextField();

        jmi_eliminar.setText("Eliminar");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        pum_telefonos.add(jmi_eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Cliente");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jl_nombre.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jl_nombre.setForeground(new java.awt.Color(0, 0, 0));
        jl_nombre.setText("Nombre");

        tf_nombre.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tf_nombre.setForeground(new java.awt.Color(51, 51, 51));
        tf_nombre.setPreferredSize(new java.awt.Dimension(259, 31));
        tf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nombreKeyTyped(evt);
            }
        });

        bl_direccion.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        bl_direccion.setForeground(new java.awt.Color(0, 0, 0));
        bl_direccion.setText("Dirección");

        tf_direccion.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tf_direccion.setForeground(new java.awt.Color(51, 51, 51));
        tf_direccion.setPreferredSize(new java.awt.Dimension(259, 31));
        tf_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_direccionKeyTyped(evt);
            }
        });

        lb_telefono.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_telefono.setForeground(new java.awt.Color(0, 0, 0));
        lb_telefono.setText("Teléfono");

        bt_ingresarCliente.setBackground(new java.awt.Color(0, 102, 204));
        bt_ingresarCliente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        bt_ingresarCliente.setForeground(new java.awt.Color(0, 0, 0));
        bt_ingresarCliente.setText("Ingresar Cliente");
        bt_ingresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ingresarClienteActionPerformed(evt);
            }
        });

        bt_agregarTelefono.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        bt_agregarTelefono.setForeground(new java.awt.Color(0, 0, 0));
        bt_agregarTelefono.setText("Agregar Teléfono");
        bt_agregarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarTelefonoActionPerformed(evt);
            }
        });

        jl_nombre1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jl_nombre1.setForeground(new java.awt.Color(0, 0, 0));
        jl_nombre1.setText("Cedula");

        tf_cedula.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tf_cedula.setForeground(new java.awt.Color(51, 51, 51));
        tf_cedula.setPreferredSize(new java.awt.Dimension(259, 31));
        tf_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cedulaKeyTyped(evt);
            }
        });

        jl_telefonos.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jl_telefonos.setForeground(new java.awt.Color(51, 51, 51));
        jl_telefonos.setComponentPopupMenu(pum_telefonos);
        jl_telefonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jl_telefonosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jl_telefonos);

        lb_telefono1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_telefono1.setForeground(new java.awt.Color(0, 0, 0));
        lb_telefono1.setText("Direccion Exacta");

        ta_direccionexacta.setColumns(20);
        ta_direccionexacta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        ta_direccionexacta.setRows(5);
        ta_direccionexacta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ta_direccionexactaKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(ta_direccionexacta);

        try {
            tf_telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+###) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tf_telefono.setPreferredSize(new java.awt.Dimension(259, 31));
        tf_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_telefonoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jl_nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bl_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_cedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bt_agregarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tf_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(bt_ingresarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_telefono1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addGap(6, 6, 6)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_cedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bl_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(bt_agregarTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_ingresarCliente)
                .addGap(10, 10, 10))
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
            if (bt_agregarTelefono.getText().equals("Modificar Teléfono")) {
                int telefonoSeleccionado = jl_telefonos.getSelectedIndex();
                dlm_telfonos.setElementAt(telefono, telefonoSeleccionado);
                jl_telefonos.setModel(dlm_telfonos);
                tf_telefono.setText("");
                bt_agregarTelefono.setText("Agregar Teléfono");
            } else {
                if (telefonoVacio(tf_telefono.getText().substring(7,11))) {
                    dlm_telfonos.addElement(telefono);
                    jl_telefonos.setModel(dlm_telfonos);
                    tf_telefono.setText("506");
                } else {
                    Mensajes.mensajeInfomracion("No hay telefono que agregar", "Telefonos");
                }
            }
            maximoTelefonos();
    }//GEN-LAST:event_bt_agregarTelefonoActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        // TODO add your handling code here:
        int tel_seleccionado = jl_telefonos.getSelectedIndex();
        if (tel_seleccionado >= 0) {
            dlm_telfonos.remove(tel_seleccionado);
            jl_telefonos.setModel(dlm_telfonos);
            tf_telefono.setText("");
            activ_desa_NuevoTelefono(true);
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado un teléfono", "Telefono", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void bt_ingresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ingresarClienteActionPerformed
        String nombre = tf_nombre.getText().trim();
        String cedula = tf_cedula.getText().trim();
        String direccion_simple = tf_direccion.getText().trim();
        String direccion_exacta = ta_direccionexacta.getText().trim();
        String telefonos = concatenarTelefonos();
        boolean consultaExitosa;

        if (nombre.isEmpty() || cedula.isEmpty() || direccion_simple.isEmpty() || direccion_exacta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos", "Faltan Datos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (esNumero(cedula)) {
                Double.parseDouble(cedula);
                BL_Cliente cliente = new BL_Cliente();
                if (bt_ingresarCliente.getText().equals("Ingresar Cliente")) {// ingresar cliente nuevo
                    consultaExitosa = cliente.insertarCliente(nombre, direccion_simple, direccion_exacta, cedula, concatenarTelefonos());
                    if (consultaExitosa) {
                        actualizarLista = true;
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
                    clienteAMostrar.setDireccion_simple(direccion_simple);
                    clienteAMostrar.setDireccion_exacta(direccion_exacta);
                    clienteAMostrar.setCedula(cedula);
                    clienteAMostrar.setTelefonos(telefonos);
                    consultaExitosa = cliente.modificarCliente(clienteAMostrar.getIdCliente(), clienteAMostrar.getNombre(),
                            clienteAMostrar.getDireccion_simple(), clienteAMostrar.getDireccion_exacta(), clienteAMostrar.getCedula(), clienteAMostrar.getTelefonos());
                    if (consultaExitosa) {
                        actualizarLista = true;
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
            activ_desa_NuevoTelefono(true);
        }
    }//GEN-LAST:event_jl_telefonosMouseReleased

    private void tf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombreKeyTyped
        Validacion.validarLongitud(tf_nombre, evt, 45);
    }//GEN-LAST:event_tf_nombreKeyTyped

    private void tf_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cedulaKeyTyped
        if(Validacion.soloNumeros(evt)){
            Validacion.validarLongitud(tf_cedula, evt, 25);
        }
    }//GEN-LAST:event_tf_cedulaKeyTyped

    private void tf_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_direccionKeyTyped
        Validacion.validarLongitud(tf_direccion, evt, 100);
    }//GEN-LAST:event_tf_direccionKeyTyped

    private void ta_direccionexactaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ta_direccionexactaKeyTyped
        Validacion.validarLongitud(ta_direccionexacta, evt, 150);
    }//GEN-LAST:event_ta_direccionexactaKeyTyped

    private void tf_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_telefonoKeyTyped
        if(!telefonoVacio(tf_telefono.getText().substring(1,4))){
            if(jl_telefonos.getModel().getSize()<3){
                bt_agregarTelefono.setText("Agregar Teléfono");
            }
        }
        if(!telefonoVacio(tf_telefono.getText().substring(2, 5))){
            tf_telefono.setText("506");
            maximoTelefonos();
        }
    }//GEN-LAST:event_tf_telefonoKeyTyped

    
    public String concatenarTelefonos() {
        String telefonos = "";
        for (int i = 0; i < dlm_telfonos.getSize(); i++) {
            telefonos += dlm_telfonos.getElementAt(i) + " / ";
        }
        return telefonos;
    }

    public DefaultListModel separarTelefonos(String telefonos) {
        DefaultListModel dlm_temp = new DefaultListModel();
        String[] partTele = telefonos.split(" / ");
        for (String telefono : partTele) {
            dlm_temp.addElement(telefono);
        }
        return dlm_temp;
    }
    
    public void maximoTelefonos(){
         if(jl_telefonos.getModel().getSize()==3){
             activ_desa_NuevoTelefono(false);
         }
    }
    
    public void activ_desa_NuevoTelefono(boolean b){
        tf_telefono.setEditable(b);
        bt_agregarTelefono.setEnabled(b);
    }
    public void cargarCliente(BL_Cliente cliente) {
        clienteAMostrar = cliente;
        tf_nombre.setText(clienteAMostrar.getNombre());
        tf_direccion.setText(clienteAMostrar.getDireccion_simple());
        ta_direccionexacta.setText(clienteAMostrar.getDireccion_exacta());
        tf_cedula.setText(clienteAMostrar.getCedula());
        dlm_telfonos = separarTelefonos(clienteAMostrar.getTelefonos());
        jl_telefonos.setModel(dlm_telfonos);
        bt_ingresarCliente.setText("Modificar Cliente");
        bt_agregarTelefono.setText("Modificar Teléfono");
        tf_telefono.setText(dlm_telfonos.getElementAt(0)+"");
        jl_telefonos.setSelectedIndex(0);
    }

    public void limpiarCampos() {
        tf_cedula.setText("");
        tf_direccion.setText("");
        tf_nombre.setText("");
        ta_direccionexacta.setText("");
        tf_telefono.setText("506");
        tf_telefono.setEnabled(true);
        bt_agregarTelefono.setEnabled(true);
        dlm_telfonos.clear();
    }

    public boolean esNumero(String numero) {
        try {
            Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe digitar numeros", "Cliente", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public boolean telefonoVacio(String numero) {
        try {
            Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bl_direccion;
    private javax.swing.JButton bt_agregarTelefono;
    private javax.swing.JButton bt_ingresarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_nombre1;
    private javax.swing.JList jl_telefonos;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JLabel lb_telefono;
    private javax.swing.JLabel lb_telefono1;
    private javax.swing.JPopupMenu pum_telefonos;
    private javax.swing.JTextArea ta_direccionexacta;
    private javax.swing.JTextField tf_cedula;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JFormattedTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
}
