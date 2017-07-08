/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.BL_Aro;
import config.Validacion;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class UI_Aro extends javax.swing.JDialog {
    public BL_Aro aroAMostrar;
    public boolean actualizarLista;
    /**
     * Creates new form UI_Aro
     * @param parent
     * @param modal
     */
    public UI_Aro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        actualizarLista=false;
        this.setLocationRelativeTo(null);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_IngresarLlanta = new javax.swing.JPanel();
        lb_numeroAro = new javax.swing.JLabel();
        lb_marca = new javax.swing.JLabel();
        lb_codigo = new javax.swing.JLabel();
        lb_cantidad = new javax.swing.JLabel();
        tf_marca = new javax.swing.JTextField();
        tf_cantidad = new javax.swing.JTextField();
        tf_codigo = new javax.swing.JTextField();
        tf_numeroAro = new javax.swing.JTextField();
        bt_ingresarAro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar Aro");

        pn_IngresarLlanta.setBackground(new java.awt.Color(255, 255, 255));

        lb_numeroAro.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_numeroAro.setText("Número de Aro");

        lb_marca.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_marca.setText("Marca");

        lb_codigo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_codigo.setText("Código");

        lb_cantidad.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_cantidad.setText("Cantidad (Juegos)");

        tf_marca.setForeground(new java.awt.Color(51, 51, 51));
        tf_marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_marcaKeyTyped(evt);
            }
        });

        tf_cantidad.setForeground(new java.awt.Color(51, 51, 51));
        tf_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cantidadKeyTyped(evt);
            }
        });

        tf_codigo.setForeground(new java.awt.Color(51, 51, 51));
        tf_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_codigoKeyTyped(evt);
            }
        });

        tf_numeroAro.setForeground(new java.awt.Color(51, 51, 51));
        tf_numeroAro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_numeroAroKeyTyped(evt);
            }
        });

        bt_ingresarAro.setBackground(new java.awt.Color(0, 51, 204));
        bt_ingresarAro.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        bt_ingresarAro.setText("Ingresar Aro");
        bt_ingresarAro.setPreferredSize(new java.awt.Dimension(148, 32));
        bt_ingresarAro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ingresarAroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_IngresarLlantaLayout = new javax.swing.GroupLayout(pn_IngresarLlanta);
        pn_IngresarLlanta.setLayout(pn_IngresarLlantaLayout);
        pn_IngresarLlantaLayout.setHorizontalGroup(
            pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_IngresarLlantaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(lb_codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_marca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_numeroAro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_ingresarAro, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(tf_marca)
                    .addComponent(tf_codigo)
                    .addComponent(tf_cantidad)
                    .addComponent(tf_numeroAro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pn_IngresarLlantaLayout.setVerticalGroup(
            pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_IngresarLlantaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_numeroAro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_numeroAro, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_marca, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lb_marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_ingresarAro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_IngresarLlanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_IngresarLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ingresarAroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ingresarAroActionPerformed
        String numeroAro = tf_numeroAro.getText().trim();
        String marca = tf_marca.getText().trim();
        String cantidad = tf_cantidad.getText().trim();
        String codigo = tf_codigo.getText().trim();

        boolean consultaExitosa;

        if (numeroAro.isEmpty() || marca.isEmpty() || cantidad.isEmpty() || codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos", "Faltan Datos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (esNumero(cantidad,"Cantidad")) {
                int cantidad2 = Integer.parseInt(cantidad);
                BL_Aro aro = new BL_Aro();
                if (bt_ingresarAro.getText().equals("Ingresar Aro")) {// ingresar aro nuevo
                    consultaExitosa = aro.IngresarAro(numeroAro, marca, cantidad2, codigo);
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
                    aroAMostrar.setNumeroAro(numeroAro);
                    aroAMostrar.setMarca(marca);
                    aroAMostrar.setCantidad(cantidad2);
                    aroAMostrar.setCodigo(codigo);
                    consultaExitosa = aroAMostrar.modificarAro(aroAMostrar.getIdProducto(), aroAMostrar.getNumeroAro(),
                            aroAMostrar.getMarca(), aroAMostrar.getCantidad(), aroAMostrar.getCodigo());
                    if (consultaExitosa) {
                        actualizarLista=true;
                        JOptionPane.showMessageDialog(null, "Aro Actualizado con exito", "Aro Actualizado", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar Aro, si el error persiste, contacte al adminstrador del sistema", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                tf_cantidad.setText("");
            }
        }
    }//GEN-LAST:event_bt_ingresarAroActionPerformed

    private void tf_numeroAroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_numeroAroKeyTyped
        Validacion.validarLongitud(tf_numeroAro, evt, 25);
    }//GEN-LAST:event_tf_numeroAroKeyTyped

    private void tf_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cantidadKeyTyped
        if(Validacion.soloNumeros(evt)){
            Validacion.validarLongitud(tf_cantidad, evt, 9);
        }
    }//GEN-LAST:event_tf_cantidadKeyTyped

    private void tf_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codigoKeyTyped
        Validacion.validarLongitud(tf_codigo, evt, 10);
    }//GEN-LAST:event_tf_codigoKeyTyped

    private void tf_marcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_marcaKeyTyped
        Validacion.validarLongitud(tf_marca, evt, 25);
    }//GEN-LAST:event_tf_marcaKeyTyped

    public boolean esNumero(String numero, String campo) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe digitar numeros en el campo "+campo, "Aro", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
     public void cargarAro(BL_Aro aro) {
        aroAMostrar = aro;
        tf_numeroAro.setText(aroAMostrar.getNumeroAro());
        tf_marca.setText(aroAMostrar.getMarca());
        tf_cantidad.setText(String.valueOf(aroAMostrar.getCantidad()));
        tf_codigo.setText(aroAMostrar.getCodigo());
        
        bt_ingresarAro.setText("Modificar Aro");
  }
    public void limpiarCampos() {
        tf_numeroAro.setText("");
        tf_marca.setText("");
        tf_codigo.setText("");
        tf_cantidad.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ingresarAro;
    private javax.swing.JLabel lb_cantidad;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_marca;
    private javax.swing.JLabel lb_numeroAro;
    private javax.swing.JPanel pn_IngresarLlanta;
    private javax.swing.JTextField tf_cantidad;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_numeroAro;
    // End of variables declaration//GEN-END:variables
}
