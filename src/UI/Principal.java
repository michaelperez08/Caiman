/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.BL_Cliente;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author michael
 */
public final class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    private DefaultTableModel dtmClientes;
    private ArrayList<BL_Cliente> listaClientes;
    private TableRowSorter trsfiltro;
    private BL_Cliente cliente;
    private int filaSeleccionada;
    
    public Principal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../IMG/tire-icon.png")).getImage());
        setLocationRelativeTo(null);
        setResizable(false);
        formatoTablaPacientes();
        jt_clientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pum_tbClientes = new javax.swing.JPopupMenu();
        jmi_verCliente = new javax.swing.JMenuItem();
        jmi_modificarCliente = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jl_Buscar = new javax.swing.JLabel();
        tf_buscarCliente = new javax.swing.JTextField();
        bt_ver = new javax.swing.JButton();
        bt_agregar = new javax.swing.JButton();
        bt_modificar = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_clientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        jmi_verCliente.setText("Ver");
        jmi_verCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_verClienteActionPerformed(evt);
            }
        });
        pum_tbClientes.add(jmi_verCliente);

        jmi_modificarCliente.setText("Modificar");
        jmi_modificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarClienteActionPerformed(evt);
            }
        });
        pum_tbClientes.add(jmi_modificarCliente);

        jmi_eliminar.setText("Eliminar");
        pum_tbClientes.add(jmi_eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jl_Buscar.setBackground(new java.awt.Color(153, 153, 153));
        jl_Buscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jl_Buscar.setForeground(new java.awt.Color(204, 204, 204));
        jl_Buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Buscar.setText("Buscar");

        tf_buscarCliente.setBackground(new java.awt.Color(204, 204, 204));
        tf_buscarCliente.setForeground(new java.awt.Color(51, 51, 51));
        tf_buscarCliente.setSelectionColor(new java.awt.Color(153, 153, 153));
        tf_buscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_buscarClienteKeyReleased(evt);
            }
        });

        bt_ver.setBackground(new java.awt.Color(51, 51, 51));
        bt_ver.setForeground(new java.awt.Color(204, 204, 204));
        bt_ver.setText("Ver");
        bt_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_verActionPerformed(evt);
            }
        });

        bt_agregar.setBackground(new java.awt.Color(51, 51, 51));
        bt_agregar.setForeground(new java.awt.Color(204, 204, 204));
        bt_agregar.setText("Agregar");
        bt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarActionPerformed(evt);
            }
        });

        bt_modificar.setBackground(new java.awt.Color(51, 51, 51));
        bt_modificar.setForeground(new java.awt.Color(204, 204, 204));
        bt_modificar.setText("Modificar");
        bt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarActionPerformed(evt);
            }
        });

        bt_eliminar.setBackground(new java.awt.Color(51, 51, 51));
        bt_eliminar.setForeground(new java.awt.Color(204, 204, 204));
        bt_eliminar.setText("Eliminar");

        jt_clientes.setBackground(new java.awt.Color(51, 51, 51));
        jt_clientes.setForeground(new java.awt.Color(153, 153, 153));
        jt_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cedula", "Telefono"
            }
        ));
        jt_clientes.setComponentPopupMenu(pum_tbClientes);
        jt_clientes.setGridColor(new java.awt.Color(51, 51, 51));
        jt_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jt_clientesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jt_clientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_ver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addComponent(tf_buscarCliente))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Buscar)
                    .addComponent(tf_buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_ver)
                        .addGap(27, 27, 27)
                        .addComponent(bt_agregar)
                        .addGap(26, 26, 26)
                        .addComponent(bt_modificar)
                        .addGap(29, 29, 29)
                        .addComponent(bt_eliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clientes", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inventario", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Facturacion", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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

    private void tf_buscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_buscarClienteKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            //new AyudaF1().abrirAyuda();
        } else {
            filtrar();
            jt_clientes.setRowSorter(trsfiltro);
        }
    }//GEN-LAST:event_tf_buscarClienteKeyReleased

    private void bt_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_verActionPerformed
        // TODO add your handling code here:
        verCliente();
    }//GEN-LAST:event_bt_verActionPerformed

    private void jmi_verClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_verClienteActionPerformed
        // TODO add your handling code here:
        verCliente();
    }//GEN-LAST:event_jmi_verClienteActionPerformed

    private void jmi_modificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarClienteActionPerformed
        // TODO add your handling code here:
        modificarCliente();
    }//GEN-LAST:event_jmi_modificarClienteActionPerformed

    private void bt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarActionPerformed
        // TODO add your handling code here:
        modificarCliente();
    }//GEN-LAST:event_bt_modificarActionPerformed

    private void bt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarActionPerformed
        // TODO add your handling code here:
        UI_Cliente ic = new UI_Cliente(this, rootPaneCheckingEnabled);
        ic.setVisible(true);
        formatoTablaPacientes();
    }//GEN-LAST:event_bt_agregarActionPerformed

    private void jt_clientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_clientesMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount()==2){
            verCliente();
        }
    }//GEN-LAST:event_jt_clientesMouseReleased

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
        
    }
    
     public void filtrar() {
        String hilera = tf_buscarCliente.getText();
        if (!hilera.isEmpty() && hilera.charAt(0) >= 97) {
            hilera = (char) ((hilera.charAt(0) - 32)) + hilera.substring(1);
        }
        trsfiltro.setRowFilter(RowFilter.regexFilter(hilera, 1));
    }
     
    public void formatoTablaPacientes() {
        cliente = new BL_Cliente();
        listaClientes = cliente.cargarClientes();
        String[] nombreColumnas =  {"numeroFila","Nombre", "Dirección", "Cedula"};
        dtmClientes = new DefaultTableModel(null, nombreColumnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        if (!listaClientes.isEmpty()) {
            Bayron:
            for (BL_Cliente cliente_temp : listaClientes) {
                dtmClientes.addRow(new Object[]{dtmClientes.getRowCount(),cliente_temp.getNombre(), cliente_temp.getDireccion(), cliente_temp.getCedula()});
            }
        }
        jt_clientes.setModel(dtmClientes);
        trsfiltro = new TableRowSorter(jt_clientes.getModel());
    }
    
    public void verCliente(){
        BL_Cliente clienteVer;
        if(validarSeleccion()) {
            UI_Cliente uic = new UI_Cliente(this, rootPaneCheckingEnabled);
            int fila = jt_clientes.getSelectedRow();
            int numeroFila = Integer.parseInt(""+jt_clientes.getValueAt(fila, 0));
            clienteVer = listaClientes.get(numeroFila);
            uic.cargarCliente(clienteVer);
            uic.setVisible(true);
        }
    }
    
    public void modificarCliente(){
        if (validarSeleccion()) {
            
        }
    }
    
    public boolean validarSeleccion(){
        filaSeleccionada = jt_clientes.getSelectedRow();
        if(filaSeleccionada >= 0){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun Cliente", "Llantas y reencauches Griegos", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JButton bt_ver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jl_Buscar;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_modificarCliente;
    private javax.swing.JMenuItem jmi_verCliente;
    private javax.swing.JTable jt_clientes;
    private javax.swing.JPopupMenu pum_tbClientes;
    private javax.swing.JTextField tf_buscarCliente;
    // End of variables declaration//GEN-END:variables
}
