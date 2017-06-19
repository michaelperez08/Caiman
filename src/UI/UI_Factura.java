package UI;

import BL.BL_Aro;
import BL.BL_Cliente;
import BL.BL_Factura;
import BL.BL_LineaFactura;
import BL.BL_Llanta;
import BL.BL_Producto;
import config.Mensajes;
import config.Validacion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author michael
 */
public class UI_Factura extends javax.swing.JDialog {

    /**
     * Creates new form UI_Factura
     */
    private ArrayList<BL_Cliente> listaClientes;
    private ArrayList<BL_Producto> listaProductos;
    private ArrayList<BL_Producto> listaProductosFacturados;
    private BL_Cliente cliente_seleccionado;
    private DateFormat df;
    private Calendar cal;
    private double libreImpVentas;
    private BL_Producto productoNuevaLinea;
    private int lineaSeleccionada;
    private Date fechaExpiracion;
    private DefaultTableModel dtmLineas;

    public UI_Factura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setModeloTbLineasProducto();
        tb_linea_factura.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb_linea_factura.getTableHeader().setReorderingAllowed(false);
    }

    public UI_Factura(java.awt.Frame parent, boolean modal, ArrayList<BL_Cliente> listaClientes, ArrayList<BL_Llanta> listaLlantas, ArrayList<BL_Aro> listaAros) {
        super(parent, modal);
        initComponents();
        df = new SimpleDateFormat("dd/MM/yyyy");
        cal = Calendar.getInstance();
        setLocationRelativeTo(null);
        this.listaClientes = listaClientes;
        listaProductos = new ArrayList<>();
        listaProductos.addAll(listaAros);
        listaProductos.addAll(listaLlantas);
        formatoCBClientes();
        formatoCBProductos();
        formatoSPCantidad();
        clienteNuevo(false);
        fechaVencimiento(15);
        setModeloTbLineasProducto();
        tb_linea_factura.getColumnModel().getColumn(0).setMinWidth(0);
        tb_linea_factura.getColumnModel().getColumn(0).setMaxWidth(0);
        tb_linea_factura.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tb_linea_factura.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pum_Lineas = new javax.swing.JPopupMenu();
        jmi_eliminar = new javax.swing.JMenuItem();
        jmi_modificar = new javax.swing.JMenuItem();
        jp_facturacion = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rb_cliente_nuevo = new javax.swing.JRadioButton();
        cb_nombre_cliente = new javax.swing.JComboBox();
        tf_telefono = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_linea_factura = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        sp_cantidad = new javax.swing.JSpinner();
        bt_agregar_linea = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        rb_producto_nuevo = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        l_total = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cb_producto = new javax.swing.JComboBox();
        tf_precio = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        l_subTotal = new javax.swing.JLabel();
        l_impVentas = new javax.swing.JLabel();
        bt_imprimir = new javax.swing.JButton();
        rb_contado = new javax.swing.JRadioButton();
        rb_credito = new javax.swing.JRadioButton();
        cb_semanas = new javax.swing.JComboBox<>();
        l_fechaVencimeinto = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jmi_eliminar.setText("Eliminar");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        pum_Lineas.add(jmi_eliminar);

        jmi_modificar.setText("Modificar");
        jmi_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarActionPerformed(evt);
            }
        });
        pum_Lineas.add(jmi_modificar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_facturacion.setBackground(new java.awt.Color(51, 51, 51));
        jp_facturacion.setMaximumSize(new java.awt.Dimension(1080, 720));
        jp_facturacion.setMinimumSize(new java.awt.Dimension(1080, 720));
        jp_facturacion.setPreferredSize(new java.awt.Dimension(1080, 720));
        jp_facturacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Cedula");
        jLabel1.setPreferredSize(new java.awt.Dimension(75, 32));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nombre");
        jLabel2.setPreferredSize(new java.awt.Dimension(75, 32));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, -1, -1));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Telefono");
        jLabel3.setPreferredSize(new java.awt.Dimension(75, 32));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        tf_cedula.setPreferredSize(new java.awt.Dimension(220, 32));
        jPanel2.add(tf_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 290, -1));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Direccion");
        jLabel4.setPreferredSize(new java.awt.Dimension(75, 32));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        tf_direccion.setPreferredSize(new java.awt.Dimension(220, 32));
        jPanel2.add(tf_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 340, -1));

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Cliente");
        jLabel6.setPreferredSize(new java.awt.Dimension(142, 32));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 9, -1, -1));

        rb_cliente_nuevo.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        rb_cliente_nuevo.setForeground(new java.awt.Color(204, 204, 204));
        rb_cliente_nuevo.setText("Cliente Nuevo");
        rb_cliente_nuevo.setPreferredSize(new java.awt.Dimension(160, 32));
        rb_cliente_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_cliente_nuevoActionPerformed(evt);
            }
        });
        jPanel2.add(rb_cliente_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 170, -1));

        cb_nombre_cliente.setPreferredSize(new java.awt.Dimension(220, 32));
        cb_nombre_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_nombre_clienteActionPerformed(evt);
            }
        });
        jPanel2.add(cb_nombre_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 340, -1));

        try {
            tf_telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+###) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tf_telefono.setPreferredSize(new java.awt.Dimension(220, 32));
        jPanel2.add(tf_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 290, -1));

        jp_facturacion.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 1078, 130));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Producto");
        jLabel5.setPreferredSize(new java.awt.Dimension(75, 32));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, -1, -1));

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Agregar Linea");
        jLabel7.setPreferredSize(new java.awt.Dimension(142, 32));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 10, -1, -1));

        tb_linea_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Cantidad", "Detalle", "Precio Unitario", "Precio Linea"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_linea_factura.setComponentPopupMenu(pum_Lineas);
        jScrollPane4.setViewportView(tb_linea_factura);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1076, 300));

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Cantidad");
        jLabel8.setPreferredSize(new java.awt.Dimension(75, 32));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        sp_cantidad.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        sp_cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp_cantidad.setPreferredSize(new java.awt.Dimension(220, 32));
        jPanel3.add(sp_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 290, -1));

        bt_agregar_linea.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        bt_agregar_linea.setText("Agregar Linea");
        bt_agregar_linea.setPreferredSize(new java.awt.Dimension(160, 32));
        bt_agregar_linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregar_lineaActionPerformed(evt);
            }
        });
        jPanel3.add(bt_agregar_linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Precio");
        jLabel9.setPreferredSize(new java.awt.Dimension(75, 32));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        rb_producto_nuevo.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        rb_producto_nuevo.setForeground(new java.awt.Color(204, 204, 204));
        rb_producto_nuevo.setText("Producto Nuevo");
        rb_producto_nuevo.setPreferredSize(new java.awt.Dimension(160, 32));
        rb_producto_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_producto_nuevoActionPerformed(evt);
            }
        });
        jPanel3.add(rb_producto_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Total:");
        jLabel10.setPreferredSize(new java.awt.Dimension(220, 20));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 50, -1));

        l_total.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        l_total.setForeground(new java.awt.Color(204, 204, 204));
        l_total.setPreferredSize(new java.awt.Dimension(220, 20));
        jPanel3.add(l_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 90, -1));

        jLabel12.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Imp. Ventas:");
        jLabel12.setPreferredSize(new java.awt.Dimension(220, 20));
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 120, -1));

        cb_producto.setPreferredSize(new java.awt.Dimension(220, 32));
        cb_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_productoActionPerformed(evt);
            }
        });
        jPanel3.add(cb_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 45, 770, -1));

        tf_precio.setPreferredSize(new java.awt.Dimension(220, 32));
        tf_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_precioKeyTyped(evt);
            }
        });
        jPanel3.add(tf_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 340, -1));

        jLabel13.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Sub Total:");
        jLabel13.setPreferredSize(new java.awt.Dimension(220, 20));
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 90, -1));

        l_subTotal.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        l_subTotal.setForeground(new java.awt.Color(204, 204, 204));
        l_subTotal.setPreferredSize(new java.awt.Dimension(220, 20));
        jPanel3.add(l_subTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 90, -1));

        l_impVentas.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        l_impVentas.setForeground(new java.awt.Color(204, 204, 204));
        l_impVentas.setPreferredSize(new java.awt.Dimension(220, 20));
        jPanel3.add(l_impVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 90, -1));

        jp_facturacion.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 166, -1, 500));

        bt_imprimir.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        bt_imprimir.setText("Imprimir");
        bt_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_imprimirActionPerformed(evt);
            }
        });
        jp_facturacion.add(bt_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 680, -1, -1));

        rb_contado.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        rb_contado.setForeground(new java.awt.Color(204, 204, 204));
        rb_contado.setText("Contado");
        jp_facturacion.add(rb_contado, new org.netbeans.lib.awtextra.AbsoluteConstraints(974, 6, -1, -1));

        rb_credito.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        rb_credito.setForeground(new java.awt.Color(204, 204, 204));
        rb_credito.setText("Credito");
        jp_facturacion.add(rb_credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(854, 6, -1, -1));

        cb_semanas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15 dias", "30 dias", "45 dias", "60 dias", "75 dias", "90 dias" }));
        cb_semanas.setPreferredSize(new java.awt.Dimension(190, 28));
        cb_semanas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_semanasActionPerformed(evt);
            }
        });
        jp_facturacion.add(cb_semanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 6, -1, -1));

        l_fechaVencimeinto.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        l_fechaVencimeinto.setForeground(new java.awt.Color(204, 204, 204));
        l_fechaVencimeinto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_fechaVencimeinto.setText("00/00/0000");
        l_fechaVencimeinto.setPreferredSize(new java.awt.Dimension(175, 28));
        jp_facturacion.add(l_fechaVencimeinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 6, 110, -1));

        jLabel15.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Fecha de Vencimiento: ");
        jLabel15.setPreferredSize(new java.awt.Dimension(175, 28));
        jp_facturacion.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 190, -1));

        getContentPane().add(jp_facturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_nombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_nombre_clienteActionPerformed
        try {
            cliente_seleccionado = (BL_Cliente) cb_nombre_cliente.getSelectedItem();
            if (cliente_seleccionado != null) {
                cargarClienteSeleccionadoFactura(cliente_seleccionado);
            }
        } catch (ClassCastException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_cb_nombre_clienteActionPerformed

    private void bt_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_imprimirActionPerformed
        BL_Cliente clienteFactura = getClienteSeleccionado();
        if (cliente_seleccionado!=null) {
            double subTotal = Double.parseDouble(l_subTotal.getText());
            double impVentas = Double.parseDouble(l_impVentas.getText());
            double total = Double.parseDouble(l_total.getText());
            BL_Factura blfac = new BL_Factura(0, "", clienteFactura.getTelefonos(), clienteFactura.getDireccion_simple(), total,
                    fechaExpiracion, subTotal, impVentas, rb_contado.isSelected(), getListaProductos(), clienteFactura.getCedula());
            if (blfac.ingresarFactura(clienteFactura.getNombre(), clienteFactura.getTelefonos(), clienteFactura.getDireccion_simple(), total, getListaProductos(), subTotal,
                    impVentas, rb_contado.isSelected(), fechaExpiracion, clienteFactura.getCedula())) {
                Mensajes.mensajeInfomracion("Factura Impresa y agregada", "Factura Agregada");
                descontarCantidadProductosFactura();
            } else {
                Mensajes.mensajeInfomracion("Noo Sirviooo", "Factura NO Agregada");
            }
        }else{
            Mensajes.mensajeInfomracion("No ha seleccionado cliente", "Factura");
        }
    }//GEN-LAST:event_bt_imprimirActionPerformed

    private void rb_cliente_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_cliente_nuevoActionPerformed
        if (rb_cliente_nuevo.isSelected()) {
            clienteNuevo(true);
            limpiarCamposCliente();
        } else {
            clienteNuevo(false);
        }
    }//GEN-LAST:event_rb_cliente_nuevoActionPerformed

    private void rb_producto_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_producto_nuevoActionPerformed
        if (rb_producto_nuevo.isSelected()) {
            productoNuevo(true);
            limpiarCamposProducto();
        } else {
            productoNuevo(false);
        }
    }//GEN-LAST:event_rb_producto_nuevoActionPerformed

    private void cb_semanasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_semanasActionPerformed
        int n_dias = (cb_semanas.getSelectedIndex() + 1) * 15;
        fechaVencimiento(n_dias);
    }//GEN-LAST:event_cb_semanasActionPerformed

    private void bt_agregar_lineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregar_lineaActionPerformed
        if (!tf_precio.getText().isEmpty() && !cb_producto.getSelectedItem().toString().isEmpty()) {
            if (bt_agregar_linea.getText().equalsIgnoreCase("Agregar Linea")) {
                if (!rb_producto_nuevo.isSelected() && cb_producto.getSelectedItem() instanceof BL_Producto) {
                    agregarLineaFactura();
                } else if (!rb_producto_nuevo.isSelected() && !(cb_producto.getSelectedItem() instanceof BL_Producto)) {
                    Mensajes.mensajeInfomracion("El producto seleccionado no se encunetra registrado", "Ingresar producto");
                } else {
                    agregarLineaFactura();
                }
            } else {
                modificarLinea(lineaSeleccionada);
            }
        } else {
            Mensajes.mensajeInfomracion("Faltan datos para agregar la linea", "Agregar Linea");
        }
    }//GEN-LAST:event_bt_agregar_lineaActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        // TODO add your handling code here:
        eliminarLinea();
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void jmi_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarActionPerformed
        // TODO add your handling code here:
        llenarCamposLinea();
    }//GEN-LAST:event_jmi_modificarActionPerformed

    private void tf_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_precioKeyTyped
        // TODO add your handling code here:
        if (Validacion.soloNumeros(evt)) {
            Validacion.validarLongitud(tf_precio, evt, 13);
        }
    }//GEN-LAST:event_tf_precioKeyTyped
    private void cb_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_productoActionPerformed
        Object obj_producto = cb_producto.getSelectedItem();
        if (obj_producto instanceof BL_Producto) {
            productoNuevaLinea = (BL_Producto) obj_producto;
            sp_cantidad.setValue(((BL_Producto) obj_producto).getCantidad());
        } else {
            productoNuevaLinea = null;
        }
    }//GEN-LAST:event_cb_productoActionPerformed

    public BL_Cliente getClienteSeleccionado() {
        if (rb_cliente_nuevo.isSelected()) {
            return new BL_Cliente(cb_nombre_cliente.getSelectedItem().toString(), tf_direccion.getText(), "", tf_cedula.getText(), tf_telefono.getText());
        } else {
            return cliente_seleccionado;
        }
    }

    public void descontarCantidadProductosFactura() {
        for (int i = 0; i < tb_linea_factura.getRowCount(); i++) {
            if (!(Boolean) tb_linea_factura.getValueAt(i, 5)) {
                BL_Producto producto = (BL_Producto) tb_linea_factura.getValueAt(i, 2);
                int cantidadFacturada = Integer.parseInt(tb_linea_factura.getValueAt(i, 1).toString());
                Runnable descontarCantidad = () -> producto.actualizarCantidad(cantidadFacturada);
                ejecutarMetodoProducto(producto, descontarCantidad);
            }
        }
    }

    public ArrayList<BL_LineaFactura> getListaProductos() {
        ArrayList<BL_LineaFactura> listaLineasFactura = new ArrayList<BL_LineaFactura>();
        for (int i = 0; i < tb_linea_factura.getRowCount(); i++) {
            String detalleLinea = tb_linea_factura.getValueAt(i, 2).toString();
            int idProducto = Integer.parseInt(tb_linea_factura.getValueAt(i, 0).toString());
            int cantidad = Integer.parseInt(tb_linea_factura.getValueAt(i, 1).toString());
            double pUnitario = Double.parseDouble(tb_linea_factura.getValueAt(i, 3).toString());
            double pTotal = Double.parseDouble(tb_linea_factura.getValueAt(i, 4).toString());
            listaLineasFactura.add(new BL_LineaFactura(idProducto, cantidad, detalleLinea, pUnitario, pTotal));

        }
        return listaLineasFactura;
    }

    public void agregarLineaFactura() {
        double precio = Double.parseDouble(tf_precio.getText());
        int cantidad = Integer.parseInt(sp_cantidad.getValue().toString());
        double precioLinea = cantidad * precio;
        Object detalle = cb_producto.getSelectedItem();
        int id = 0;
        if (detalle instanceof BL_Producto) {
            id = ((BL_Producto) detalle).getIdProducto();
        }
        ((DefaultTableModel) tb_linea_factura.getModel()).addRow(new Object[]{id, cantidad, detalle, precio, precioLinea, rb_producto_nuevo.isSelected()});
        calcularTotales();
        listaProductos.remove(productoNuevaLinea);
    }

    public void ejecutarMetodoProducto(Object producto, Runnable run) {
        if (producto instanceof BL_Llanta) {
            producto = new BL_Llanta((BL_Llanta) producto);
        } else if (producto instanceof BL_Aro) {
            producto = new BL_Aro((BL_Aro) producto);
        }
        run.run();
    }

    public void eliminarLinea() {
        ((DefaultTableModel) tb_linea_factura.getModel()).removeRow(tb_linea_factura.getSelectedRow());
        calcularTotales();
    }

    public void modificarLinea(int fila) {

        String detalle = cb_producto.getSelectedItem().toString();
        double precio = Double.parseDouble(tf_precio.getText());
        int cantidad = Integer.parseInt(sp_cantidad.getValue().toString());
        double precioLinea = cantidad * precio;
        ((DefaultTableModel) tb_linea_factura.getModel()).setValueAt(cantidad, fila, 1);
        ((DefaultTableModel) tb_linea_factura.getModel()).setValueAt(detalle, fila, 2);
        ((DefaultTableModel) tb_linea_factura.getModel()).setValueAt(precio, fila, 3);
        ((DefaultTableModel) tb_linea_factura.getModel()).setValueAt(precioLinea, fila, 4);
        calcularTotales();
        limpiarCamposProducto();
        bt_agregar_linea.setText("Agregar Linea");
        tb_linea_factura.setCellSelectionEnabled(true);
    }

    public void llenarCamposLinea() {
        lineaSeleccionada = tb_linea_factura.getSelectedRow();
        sp_cantidad.setValue(tb_linea_factura.getValueAt(lineaSeleccionada, 1));
        filtrar_cb_producto(tb_linea_factura.getValueAt(lineaSeleccionada, 2) + "");
        tf_precio.setText(tb_linea_factura.getValueAt(lineaSeleccionada, 3) + "");
        bt_agregar_linea.setText("Modificar");
        tb_linea_factura.setCellSelectionEnabled(false);

    }

    public void calcularTotales() {
        double subTotal = getSubTotal();
        double impVentas = (subTotal - libreImpVentas) * 0.13;
        double total = subTotal + impVentas;
        l_subTotal.setText(subTotal + "");
        l_impVentas.setText(impVentas + "");
        l_total.setText(total + "");
        limpiarCamposProducto();
    }

    public Double getSubTotal() {
        double subtotal = 0;
        libreImpVentas = 0;
        for (int i = 0; i < tb_linea_factura.getRowCount(); i++) {
            subtotal += Double.parseDouble(tb_linea_factura.getValueAt(i, 4).toString());
            if (tb_linea_factura.getValueAt(i, 2).toString().toLowerCase().contains("agricola")) {
                libreImpVentas += Double.parseDouble(tb_linea_factura.getValueAt(i, 4).toString());
            }
        }
        return subtotal;
    }

    public void formatoCBClientes() {
        quitarFlechaCB(cb_nombre_cliente);
        cb_nombre_cliente.setEditable(true);
        cb_nombre_cliente.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int tecla = e.getKeyCode();
                if (!rb_cliente_nuevo.isSelected()) {
                    if ((tecla >= 65 && tecla <= 90) || (tecla >= 97 && tecla <= 122) || tecla == KeyEvent.VK_BACK_SPACE) {
                        filtrar_cb_clientes(cb_nombre_cliente.getEditor().getItem() + "");
                    } else if (tecla == KeyEvent.VK_ENTER && cliente_seleccionado != null) {
                        cargarClienteSeleccionadoFactura(cliente_seleccionado);
                    }
                }
            }

        });
    }

    public void clienteNuevo(boolean b) {
        tf_cedula.setEditable(b);
        tf_direccion.setEditable(b);
        tf_telefono.setEditable(b);
    }

    public void productoNuevo(boolean b) {

    }

    public void formatoCBProductos() {
        quitarFlechaCB(cb_producto);
        cb_producto.setEditable(true);
        cb_producto.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int tecla = e.getKeyCode();
                if (!rb_producto_nuevo.isSelected()) {
                    if ((tecla >= 65 && tecla <= 90) || (tecla >= 97 && tecla <= 122) || tecla == KeyEvent.VK_BACK_SPACE) {
                        filtrar_cb_producto(cb_producto.getEditor().getItem() + "");
                    } else if (tecla == KeyEvent.VK_ENTER && cb_producto.getSelectedItem() instanceof String) {
                        cb_producto.getEditor().setItem(cb_producto.getItemAt(0));
                    }
                }
            }
        });
    }

    public void filtrar_cb_clientes(String texto_digitado) {
        cb_nombre_cliente.removeAllItems();
        for (BL_Cliente cliente_temp : listaClientes) {
            if (cliente_temp.getNombre().toLowerCase().contains(texto_digitado.toLowerCase())) {
                cb_nombre_cliente.addItem(cliente_temp);
            }
        }
        if (!cb_nombre_cliente.isPopupVisible()) {
            cb_nombre_cliente.showPopup();
        }
        cb_nombre_cliente.getEditor().setItem(texto_digitado);
    }

    public void cargarClienteSeleccionadoFactura(BL_Cliente cliente) {
        cb_nombre_cliente.getEditor().setItem(cliente.getNombre());
        tf_cedula.setText(cliente.getCedula());
        tf_telefono.setText(cliente.getTelefonos());
        tf_direccion.setText(cliente.getDireccion_simple());
    }

    public void filtrar_cb_producto(String texto_digitado) {
        cb_producto.removeAllItems();
        for (BL_Producto temp_producto : listaProductos) {
            if (temp_producto.toString().toLowerCase().contains(texto_digitado.toLowerCase())) {
                cb_producto.addItem(temp_producto);
            }
        }
        if (!cb_producto.isPopupVisible()) {
            cb_producto.showPopup();
        }
        cb_producto.getEditor().setItem(texto_digitado);
    }

    public void limpiarCamposCliente() {
        cb_nombre_cliente.removeAllItems();
        tf_cedula.setText("");
        tf_direccion.setText("");
        tf_telefono.setText("");
    }

    public void limpiarCamposProducto() {
        cb_producto.removeAllItems();
        tf_precio.setText("");
        sp_cantidad.setValue(1);
    }

    public void quitarFlechaCB(JComboBox cb) {
        cb.setUI(new BasicComboBoxUI() {
            @Override
            protected JButton createArrowButton() {
                return new JButton() {
                    @Override
                    public int getWidth() {
                        return 0;
                    }
                };
            }
        });
        //cb.remove(cb.getComponent(0));
    }

    public void fechaVencimiento(int dias) {
        cal.add(Calendar.DAY_OF_YEAR, dias);
        fechaExpiracion = cal.getTime();
        l_fechaVencimeinto.setText(df.format(fechaExpiracion));
        cal.add(Calendar.DAY_OF_YEAR, -dias);
    }

    public void formatoSPCantidad() {
        ((JSpinner.DefaultEditor) sp_cantidad.getEditor()).getTextField().addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                Validacion.soloNumeros(e);
            }

        });
    }

    public void setModeloTbLineasProducto() {
        String[] nombreColumnas = {"Id", "Cantidad", "Detalle", "Precio Unitario", "Precio Linea", "Producto Nuevo"};
        dtmLineas = new DefaultTableModel(null, nombreColumnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tb_linea_factura.setModel(dtmLineas);
        tb_linea_factura.getColumnModel().getColumn(5).setMinWidth(0);
        tb_linea_factura.getColumnModel().getColumn(5).setMaxWidth(0);
        tb_linea_factura.getColumnModel().getColumn(0).setMinWidth(0);
        tb_linea_factura.getColumnModel().getColumn(0).setMaxWidth(0);
    }
    
    public void cargarFactura(BL_Factura facturaVer){
        //Nombre cliente
        BL_Cliente cl = new BL_Cliente(facturaVer.getNombreCliente(), facturaVer.getDireccionCliente(), 
                facturaVer.getCedulaCliente(), facturaVer.getTelefonoCliente());

        
        tf_direccion.setText(facturaVer.getDireccionCliente());
        tf_cedula.setText(facturaVer.getCedulaCliente());
        tf_telefono.setText(facturaVer.getTelefonoCliente());
        for (BL_LineaFactura tempLinea : facturaVer.Retornar()) {
            ((DefaultTableModel) tb_linea_factura.getModel()).addRow(new Object[]{tempLinea.getId(), tempLinea.getCantidad(), tempLinea.getDetalle(), tempLinea.getPrecioUnitario(), tempLinea.getPrecioTotalLinea()});
        }
        l_fechaVencimeinto.setText(facturaVer.getFechaExpiracion()+"");
        calcularTotales();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregar_linea;
    private javax.swing.JButton bt_imprimir;
    private javax.swing.JComboBox cb_nombre_cliente;
    private javax.swing.JComboBox cb_producto;
    private javax.swing.JComboBox<String> cb_semanas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_modificar;
    private javax.swing.JPanel jp_facturacion;
    private javax.swing.JLabel l_fechaVencimeinto;
    private javax.swing.JLabel l_impVentas;
    private javax.swing.JLabel l_subTotal;
    private javax.swing.JLabel l_total;
    private javax.swing.JPopupMenu pum_Lineas;
    private javax.swing.JRadioButton rb_cliente_nuevo;
    private javax.swing.JRadioButton rb_contado;
    private javax.swing.JRadioButton rb_credito;
    private javax.swing.JRadioButton rb_producto_nuevo;
    private javax.swing.JSpinner sp_cantidad;
    private javax.swing.JTable tb_linea_factura;
    private javax.swing.JTextField tf_cedula;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JFormattedTextField tf_precio;
    private javax.swing.JFormattedTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
}
