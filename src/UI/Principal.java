/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.BL_Cliente;
import BL.BL_Llanta;
import com.sun.jmx.snmp.SnmpDataTypeEnums;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
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
    private TableRowSorter trsfiltroCliente;
    private BL_Cliente cliente;
    private int filaSeleccionada;
    private BL_Llanta llanta;
    private ArrayList<BL_Llanta> listaLlantas;
    private DefaultTableModel dtmLlantas;
    private TableRowSorter trsfiltroLlantas;

    public Principal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../IMG/tire-icon.png")).getImage());
        setLocationRelativeTo(null);
        setResizable(false);
        cargarClientes();
        cargarLlantas();
        jt_clientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jt_llantas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
        pum_tbLlantas = new javax.swing.JPopupMenu();
        jmi_verLlanta = new javax.swing.JMenuItem();
        jmi_modificarLlanta = new javax.swing.JMenuItem();
        jmi_eliminarLlanta = new javax.swing.JMenuItem();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_llantas = new javax.swing.JTable();
        tf_buscarLlantas = new javax.swing.JTextField();
        jl_Buscar1 = new javax.swing.JLabel();
        bt_verLlanta = new javax.swing.JButton();
        bt_agregarLlanta = new javax.swing.JButton();
        bt_modificarLlanta = new javax.swing.JButton();
        bt_eliminarLlanta = new javax.swing.JButton();
        jcb_filtroBusqueda = new javax.swing.JComboBox();
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
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        pum_tbClientes.add(jmi_eliminar);

        jmi_verLlanta.setText("Ver");
        jmi_verLlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_verLlantaActionPerformed(evt);
            }
        });
        pum_tbLlantas.add(jmi_verLlanta);

        jmi_modificarLlanta.setText("Modificar");
        jmi_modificarLlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarLlantaActionPerformed(evt);
            }
        });
        pum_tbLlantas.add(jmi_modificarLlanta);

        jmi_eliminarLlanta.setText("Eliminar");
        jmi_eliminarLlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarLlantaActionPerformed(evt);
            }
        });
        pum_tbLlantas.add(jmi_eliminarLlanta);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LLantas y Reencauches Griegos");

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
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
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

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jt_llantas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jt_llantas.setComponentPopupMenu(pum_tbLlantas);
        jScrollPane2.setViewportView(jt_llantas);

        tf_buscarLlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_buscarLlantasActionPerformed(evt);
            }
        });
        tf_buscarLlantas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_buscarLlantasKeyReleased(evt);
            }
        });

        jl_Buscar1.setBackground(new java.awt.Color(153, 153, 153));
        jl_Buscar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jl_Buscar1.setForeground(new java.awt.Color(204, 204, 204));
        jl_Buscar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Buscar1.setText("Buscar");

        bt_verLlanta.setText("Ver");
        bt_verLlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_verLlantaActionPerformed(evt);
            }
        });

        bt_agregarLlanta.setText("Agregar");
        bt_agregarLlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarLlantaActionPerformed(evt);
            }
        });

        bt_modificarLlanta.setText("Modificar");
        bt_modificarLlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarLlantaActionPerformed(evt);
            }
        });

        bt_eliminarLlanta.setText("Eliminar");
        bt_eliminarLlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarLlantaActionPerformed(evt);
            }
        });

        jcb_filtroBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marca", "Número", "Diseño" }));
        jcb_filtroBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_filtroBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Buscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_verLlanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_eliminarLlanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bt_modificarLlanta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bt_agregarLlanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tf_buscarLlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcb_filtroBusqueda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_buscarLlantas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Buscar1)
                    .addComponent(jcb_filtroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bt_verLlanta)
                        .addGap(27, 27, 27)
                        .addComponent(bt_agregarLlanta)
                        .addGap(18, 18, 18)
                        .addComponent(bt_modificarLlanta)
                        .addGap(26, 26, 26)
                        .addComponent(bt_eliminarLlanta))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inventario", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
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
            filtrarClientes();
            jt_clientes.setRowSorter(trsfiltroCliente);
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
        cargarClientes();
    }//GEN-LAST:event_bt_agregarActionPerformed

    private void jt_clientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_clientesMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            verCliente();
        }
    }//GEN-LAST:event_jt_clientesMouseReleased

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        // TODO add your handling code here:
        eliminarCliente();
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        // TODO add your handling code here:
        eliminarCliente();
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void tf_buscarLlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_buscarLlantasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_buscarLlantasActionPerformed

    private void bt_eliminarLlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarLlantaActionPerformed
        // TODO add your handling code here:
        eliminarLlanta();
    }//GEN-LAST:event_bt_eliminarLlantaActionPerformed

    private void bt_modificarLlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarLlantaActionPerformed
        modificarLlanta();
    }//GEN-LAST:event_bt_modificarLlantaActionPerformed

    private void bt_verLlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_verLlantaActionPerformed
        // TODO add your handling code here:
        verLlanta();
    }//GEN-LAST:event_bt_verLlantaActionPerformed

    private void bt_agregarLlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarLlantaActionPerformed
        // TODO add your handling code here:
        UI_Llanta uil = new UI_Llanta(this, rootPaneCheckingEnabled);
        uil.setVisible(true);
        cargarLlantas();
    }//GEN-LAST:event_bt_agregarLlantaActionPerformed

    private void jmi_verLlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_verLlantaActionPerformed
        // TODO add your handling code here:
        verLlanta();
    }//GEN-LAST:event_jmi_verLlantaActionPerformed

    private void jmi_modificarLlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarLlantaActionPerformed
        // TODO add your handling code here:
        modificarLlanta();
    }//GEN-LAST:event_jmi_modificarLlantaActionPerformed

    private void jmi_eliminarLlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarLlantaActionPerformed
        // TODO add your handling code here:
        eliminarLlanta();
    }//GEN-LAST:event_jmi_eliminarLlantaActionPerformed

    private void tf_buscarLlantasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_buscarLlantasKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            //new AyudaF1().abrirAyuda();
        } else {
            filtrarLlantas();
            jt_llantas.setRowSorter(trsfiltroLlantas);
        }
    }//GEN-LAST:event_tf_buscarLlantasKeyReleased

    private void jcb_filtroBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_filtroBusquedaActionPerformed
        // TODO add your handling code here:
        filtrarLlantas();
        jt_llantas.setRowSorter(trsfiltroLlantas);
    }//GEN-LAST:event_jcb_filtroBusquedaActionPerformed

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

    public void filtrarClientes() {
        String hilera = tf_buscarCliente.getText();
        if (!hilera.isEmpty() && hilera.charAt(0) >= 97) {
            hilera = (char) ((hilera.charAt(0) - 32)) + hilera.substring(1);
        }
        trsfiltroCliente.setRowFilter(RowFilter.regexFilter(hilera, 1));
    }

    public void filtrarLlantas() {
        String hilera = tf_buscarLlantas.getText();
        String filtro = jcb_filtroBusqueda.getSelectedItem() + "";
            int fila = 0;
            switch (filtro) {
                case "Marca": 
                    fila = 2;
                    break;
                case "Número": 
                    fila = 1;
                    break;
                    
                case "Diseño": 
                    fila = 3;
                    break;
                
            }
        if (!hilera.isEmpty() && hilera.charAt(0) >= 97) {
            hilera = (char) ((hilera.charAt(0) - 32)) + hilera.substring(1);
        }
        trsfiltroLlantas.setRowFilter(RowFilter.regexFilter(hilera, fila));
    }

    public void cargarClientes() {
        cliente = new BL_Cliente();
        listaClientes = cliente.cargarClientes();
        String[] nombreColumnas = {"numeroFila", "Nombre", "Dirección", "Cedula"};
        dtmClientes = new DefaultTableModel(null, nombreColumnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        if (!listaClientes.isEmpty()) {

            for (BL_Cliente cliente_temp : listaClientes) {
                dtmClientes.addRow(new Object[]{dtmClientes.getRowCount(), cliente_temp.getNombre(), cliente_temp.getDireccion(), cliente_temp.getCedula()});
            }
        }
        jt_clientes.setModel(dtmClientes);
        jt_clientes.getColumnModel().getColumn(0).setMinWidth(0);
        jt_clientes.getColumnModel().getColumn(0).setMaxWidth(0);
        jt_clientes.getColumnModel().getColumn(3).setMinWidth(100);
        jt_clientes.getColumnModel().getColumn(3).setMaxWidth(100);
        //((DefaultTableCellRenderer)jt_clientes.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        trsfiltroCliente = new TableRowSorter(jt_clientes.getModel());
    }

    public void cargarLlantas() {
        llanta = new BL_Llanta();
        listaLlantas = llanta.cargarLlantas();
        String[] nombreColumnas = {"numeroFila", "Numero Llanta", "Marca", "Diseño", "Capas", "Cantidad", "TipoLlanta"};
        dtmLlantas = new DefaultTableModel(null, nombreColumnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        if (!listaLlantas.isEmpty()) {
            for (BL_Llanta llanta_temp : listaLlantas) {
                dtmLlantas.addRow(new Object[]{dtmLlantas.getRowCount(), llanta_temp.getNumeroLlanta(), llanta_temp.getMarca(), llanta_temp.getDiseno(),
                    llanta_temp.getNumeroCapas(), llanta_temp.getCantidad(), llanta_temp.getTipoLlanta()});
            }
        }
        jt_llantas.setModel(dtmLlantas);
        jt_llantas.getColumnModel().getColumn(0).setMinWidth(0);
        jt_llantas.getColumnModel().getColumn(0).setMaxWidth(0);
        jt_llantas.getColumnModel().getColumn(6).setMinWidth(0);
        jt_llantas.getColumnModel().getColumn(6).setMaxWidth(0);
        trsfiltroLlantas = new TableRowSorter(jt_llantas.getModel());
    }

    public void verCliente() {
        BL_Cliente clienteVer;
        if (validarSeleccion()) {
            UI_Cliente uic = new UI_Cliente(this, rootPaneCheckingEnabled);
            int fila = jt_clientes.getSelectedRow();
            int numeroFila = Integer.parseInt("" + jt_clientes.getValueAt(fila, 0));
            clienteVer = listaClientes.get(numeroFila);
            uic.cargarCliente(clienteVer);
            uic.setVisible(true);
            cargarClientes();
        }
    }

    public void verLlanta() {
        BL_Llanta llantaVer;
        if (validarSeleccionLlantas()) {
            UI_Llanta uill = new UI_Llanta(this, rootPaneCheckingEnabled);
            int fila = jt_llantas.getSelectedRow();
            int numeroFila = Integer.parseInt("" + jt_llantas.getValueAt(fila, 0));
            llantaVer = listaLlantas.get(numeroFila);
            uill.cargarLlanta(llantaVer);
            uill.setVisible(true);
            cargarLlantas();
        }
    }

    public void modificarCliente() {
        verCliente();
    }

    public void modificarLlanta() {
        verLlanta();
    }

    public boolean validarSeleccion() {
        filaSeleccionada = jt_clientes.getSelectedRow();
        if (filaSeleccionada >= 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun Cliente", "Llantas y reencauches Griegos", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    public boolean validarSeleccionLlantas() {
        filaSeleccionada = jt_llantas.getSelectedRow();
        if (filaSeleccionada >= 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna Llanta", "Llantas y reencauches Griegos", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    private void eliminarCliente() {
        BL_Cliente blCliente;
        if (validarSeleccion()) {
            UI_Cliente uic = new UI_Cliente(this, rootPaneCheckingEnabled);
            int fila = jt_clientes.getSelectedRow();
            int numeroFila = Integer.parseInt("" + jt_clientes.getValueAt(fila, 0));
            blCliente = listaClientes.get(numeroFila);
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar a " + blCliente.getNombre() + "?", "Warning", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                if (blCliente.eliminarCliente()) {
                    JOptionPane.showMessageDialog(null, "Cliente Elimiado con exito", "Llantas y reencauches Griegos", JOptionPane.INFORMATION_MESSAGE);
                    cargarClientes();
                } else {
                    JOptionPane.showMessageDialog(null, "Fallo al eliminar el cliente", "Llantas y reencauches Griegos", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

    }

    private void eliminarLlanta() {
        BL_Llanta blLanta;
        if (validarSeleccionLlantas()) {
            int fila = jt_llantas.getSelectedRow();
            int numeroFila = Integer.parseInt("" + jt_llantas.getValueAt(fila, 0));
            blLanta = listaLlantas.get(numeroFila);
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar a esta llanta?", "Warning", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                if (blLanta.eliminarLlanta()) {
                    JOptionPane.showMessageDialog(null, "Llanta Elimiada con exito", "Llantas y reencauches Griegos", JOptionPane.INFORMATION_MESSAGE);
                    cargarLlantas();
                } else {
                    JOptionPane.showMessageDialog(null, "Fallo al eliminar el llanta", "Llantas y reencauches Griegos", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_agregarLlanta;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_eliminarLlanta;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JButton bt_modificarLlanta;
    private javax.swing.JButton bt_ver;
    private javax.swing.JButton bt_verLlanta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox jcb_filtroBusqueda;
    private javax.swing.JLabel jl_Buscar;
    private javax.swing.JLabel jl_Buscar1;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_eliminarLlanta;
    private javax.swing.JMenuItem jmi_modificarCliente;
    private javax.swing.JMenuItem jmi_modificarLlanta;
    private javax.swing.JMenuItem jmi_verCliente;
    private javax.swing.JMenuItem jmi_verLlanta;
    private javax.swing.JTable jt_clientes;
    private javax.swing.JTable jt_llantas;
    private javax.swing.JPopupMenu pum_tbClientes;
    private javax.swing.JPopupMenu pum_tbLlantas;
    private javax.swing.JTextField tf_buscarCliente;
    private javax.swing.JTextField tf_buscarLlantas;
    // End of variables declaration//GEN-END:variables
}
