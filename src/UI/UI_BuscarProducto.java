/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.BL_Producto;
import config.Mensajes;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author michael
 */
public class UI_BuscarProducto extends javax.swing.JDialog {

    /**
     * Creates new form UI_BuscarProducto
     */
    private DefaultTableModel dtm_productos;
    private ArrayList<BL_Producto> listaProductos;
    private TableRowSorter trsfiltroProductos;
    private BL_Producto productoSeleccionado;

    public UI_BuscarProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public UI_BuscarProducto(java.awt.Frame parent, boolean modal, ArrayList<BL_Producto> listaProductos) {
        super(parent, modal);
        initComponents();
        this.listaProductos = listaProductos;
        cargarTablaClientes();
        setLocationRelativeTo(null);
    }

    public void cargarTablaClientes() {
        Principal.resaltarProductosAgotados(tb_productos, 2);
        if (listaProductos != null) {
            String[] nombreColumnas = {"# Lista", "Producto", "Cantidad"};
            dtm_productos = new DefaultTableModel(null, nombreColumnas) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            if (!listaProductos.isEmpty()) {
                for (BL_Producto producto_temp : listaProductos) {
                    dtm_productos.addRow(new Object[]{dtm_productos.getRowCount(), producto_temp, producto_temp.getCantidad()});
                }
            }
            tb_productos.setModel(dtm_productos);
            tb_productos.getColumnModel().getColumn(0).setMinWidth(0);
            tb_productos.getColumnModel().getColumn(0).setMaxWidth(0);
            tb_productos.getColumnModel().getColumn(2).setMinWidth(0);
            tb_productos.getColumnModel().getColumn(2).setMaxWidth(0);
            trsfiltroProductos = new TableRowSorter(tb_productos.getModel());
        }
    }

    public void filtrarClientes() {
        String hilera = tf_producto.getText();
        trsfiltroProductos.setRowFilter(RowFilter.regexFilter("(?i)" + hilera, 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_producto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_productos = new javax.swing.JTable();
        bt_sleeccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Productos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 80, 30));

        tf_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_productoKeyReleased(evt);
            }
        });
        jPanel1.add(tf_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 300, 30));

        tb_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Producto"
            }
        ));
        tb_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tb_productosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tb_productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 400, 300));

        bt_sleeccionar.setBackground(new java.awt.Color(0, 102, 204));
        bt_sleeccionar.setForeground(new java.awt.Color(0, 0, 0));
        bt_sleeccionar.setText("Seleccionar");
        bt_sleeccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sleeccionarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_sleeccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 360, 388, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_productoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_productoKeyReleased
        filtrarClientes();
        tb_productos.setRowSorter(trsfiltroProductos);
    }//GEN-LAST:event_tf_productoKeyReleased

    private void bt_sleeccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sleeccionarActionPerformed
        seleccionarProducto();
    }//GEN-LAST:event_bt_sleeccionarActionPerformed

    private void tb_productosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_productosMouseReleased
        if (evt.getClickCount() == 2) {
            seleccionarProducto();
        }
    }//GEN-LAST:event_tb_productosMouseReleased

    /**
     * @param args the command line arguments
     */
    public BL_Producto getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(BL_Producto productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sleeccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_productos;
    private javax.swing.JTextField tf_producto;
    // End of variables declaration//GEN-END:variables

    private void seleccionarProducto() {
        int rowSelected = tb_productos.getSelectedRow();
        if (rowSelected >= 0) {
            Object obProduc = tb_productos.getValueAt(rowSelected, 1);
            if (obProduc instanceof BL_Producto) {
                productoSeleccionado = (BL_Producto) obProduc;
                this.dispose();
            }
        } else {
            Mensajes.mensajeInfomracion("No ha seleccionado ningun produucto", "Productos");
        }
    }
}
