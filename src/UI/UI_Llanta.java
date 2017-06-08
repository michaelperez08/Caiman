/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.BL_Llanta;
import config.Validacion;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class UI_Llanta extends javax.swing.JDialog {
    public BL_Llanta llantaAMostrar;
    public boolean actualizarLista;
    /**
     * Creates new form UI_Llanta
     */
    public UI_Llanta(java.awt.Frame parent, boolean modal) {
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
        lb_numeroLlanta = new javax.swing.JLabel();
        lb_marca = new javax.swing.JLabel();
        lb_diseno = new javax.swing.JLabel();
        lb_numeroCapas = new javax.swing.JLabel();
        lb_cantidad = new javax.swing.JLabel();
        lb_tipoLlanta = new javax.swing.JLabel();
        tf_marca = new javax.swing.JTextField();
        tf_cantidad = new javax.swing.JTextField();
        tf_numeroCapas = new javax.swing.JTextField();
        tf_diseno = new javax.swing.JTextField();
        tf_numeroLlanta = new javax.swing.JTextField();
        bt_ingresarLlanta = new javax.swing.JButton();
        cb_tipoLlanta = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar Llanta");

        pn_IngresarLlanta.setBackground(new java.awt.Color(51, 51, 51));

        lb_numeroLlanta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_numeroLlanta.setForeground(new java.awt.Color(255, 255, 255));
        lb_numeroLlanta.setText("Número de Llanta");

        lb_marca.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_marca.setForeground(new java.awt.Color(255, 255, 255));
        lb_marca.setText("Marca");

        lb_diseno.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_diseno.setForeground(new java.awt.Color(255, 255, 255));
        lb_diseno.setText("Diseño");

        lb_numeroCapas.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_numeroCapas.setForeground(new java.awt.Color(255, 255, 255));
        lb_numeroCapas.setText("Capas");

        lb_cantidad.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_cantidad.setForeground(new java.awt.Color(255, 255, 255));
        lb_cantidad.setText("Cantidad de Llantas");

        lb_tipoLlanta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lb_tipoLlanta.setForeground(new java.awt.Color(255, 255, 255));
        lb_tipoLlanta.setText("Tipo de Llanta:");

        tf_marca.setForeground(new java.awt.Color(51, 51, 51));
        tf_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_marcaActionPerformed(evt);
            }
        });
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

        tf_numeroCapas.setForeground(new java.awt.Color(51, 51, 51));
        tf_numeroCapas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_numeroCapasKeyTyped(evt);
            }
        });

        tf_diseno.setForeground(new java.awt.Color(51, 51, 51));
        tf_diseno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_disenoKeyTyped(evt);
            }
        });

        tf_numeroLlanta.setForeground(new java.awt.Color(51, 51, 51));
        tf_numeroLlanta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_numeroLlantaKeyTyped(evt);
            }
        });

        bt_ingresarLlanta.setBackground(new java.awt.Color(51, 51, 51));
        bt_ingresarLlanta.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        bt_ingresarLlanta.setForeground(new java.awt.Color(204, 204, 204));
        bt_ingresarLlanta.setText("Ingresar Llanta");
        bt_ingresarLlanta.setPreferredSize(new java.awt.Dimension(148, 32));
        bt_ingresarLlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ingresarLlantaActionPerformed(evt);
            }
        });

        cb_tipoLlanta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        cb_tipoLlanta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Industrial", "Agricola" }));
        cb_tipoLlanta.setToolTipText("");

        javax.swing.GroupLayout pn_IngresarLlantaLayout = new javax.swing.GroupLayout(pn_IngresarLlanta);
        pn_IngresarLlanta.setLayout(pn_IngresarLlantaLayout);
        pn_IngresarLlantaLayout.setHorizontalGroup(
            pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_IngresarLlantaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_tipoLlanta, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(lb_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(lb_numeroCapas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_diseno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_marca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_numeroLlanta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_IngresarLlantaLayout.createSequentialGroup()
                        .addComponent(bt_ingresarLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tf_marca)
                    .addComponent(tf_diseno)
                    .addComponent(tf_numeroCapas)
                    .addComponent(tf_cantidad)
                    .addComponent(cb_tipoLlanta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_numeroLlanta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pn_IngresarLlantaLayout.setVerticalGroup(
            pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_IngresarLlantaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_numeroLlanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_numeroLlanta, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_marca, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lb_marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_diseno, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lb_diseno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_numeroCapas, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lb_numeroCapas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lb_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_IngresarLlantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_tipoLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_IngresarLlantaLayout.createSequentialGroup()
                        .addComponent(lb_tipoLlanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(bt_ingresarLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_IngresarLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_IngresarLlanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ingresarLlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ingresarLlantaActionPerformed
        String numeroLlanta = tf_numeroLlanta.getText().trim();
        String marca = tf_marca.getText().trim();
        String diseno = tf_diseno.getText().trim();
        String numeroCapas = tf_numeroCapas.getText().trim();
        String cantidad = tf_cantidad.getText().trim();
        String tipoLlanta = (String)cb_tipoLlanta.getSelectedItem();
        boolean consultaExitosa;

        if (numeroLlanta.isEmpty() || marca.isEmpty() || diseno.isEmpty()|| numeroCapas.isEmpty() || cantidad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos", "Faltan Datos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (esNumero(numeroCapas) && esNumero(cantidad)) {
                int numeroCapas2 = Integer.parseInt(numeroCapas);
                int cantidad2 = Integer.parseInt(cantidad);
                BL_Llanta llanta = new BL_Llanta();
                if (bt_ingresarLlanta.getText().equals("Ingresar Llanta")) {// ingresar Llanta nuevo
                    consultaExitosa = llanta.IngresarLlanta(numeroLlanta, marca, diseno, numeroCapas2, cantidad2, tipoLlanta);
                    if (consultaExitosa) {
                        actualizarLista = true;
                        JOptionPane.showMessageDialog(null, "Llanta Añadida", "Llanta Ingresada", JOptionPane.INFORMATION_MESSAGE);
                        Object[] opciones = {"Si", "No"};
                        int n = JOptionPane.showOptionDialog(null, "Desea ingresar otra llanta?", "Llanta Nueva",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                        if (n == 1) {
                            this.dispose();
                        } else {
                            limpiarCampos();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar Llanta, si el error persiste, contacte al adminstrador del sistema", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {//modificar Llanta
                    llantaAMostrar.setNumeroLlantas(numeroLlanta);
                    llantaAMostrar.setMarca(marca);
                    llantaAMostrar.setDiseno(diseno);
                    llantaAMostrar.setNumeroCapas(numeroCapas2);
                    llantaAMostrar.setCantidad(cantidad2);
                    llantaAMostrar.setTipoLlanta(tipoLlanta);
                    consultaExitosa = llantaAMostrar.modificarLlanta(llantaAMostrar.getIdProducto(), llantaAMostrar.getNumeroLlanta(),
                            llantaAMostrar.getMarca(), llantaAMostrar.getDiseno(), llantaAMostrar.getNumeroCapas(),llantaAMostrar.getCantidad(), llantaAMostrar.getTipoLlanta());
                    if (consultaExitosa) {
                        actualizarLista=true;
                        JOptionPane.showMessageDialog(null, "Llanta Actualizada con exito", "Llanta Actualizada", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar Llanta, si el error persiste, contacte al adminstrador del sistema", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                tf_numeroCapas.setText("");
                tf_cantidad.setText("");
            }
        }
    }//GEN-LAST:event_bt_ingresarLlantaActionPerformed

    public boolean esNumero(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe digitar numeros", "Llanta", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
     public void cargarLlanta(BL_Llanta llanta) {
        llantaAMostrar = llanta;
        tf_numeroLlanta.setText(llantaAMostrar.getNumeroLlanta());
        tf_marca.setText(llantaAMostrar.getMarca());
        tf_diseno.setText(llantaAMostrar.getDiseno());
        tf_numeroCapas.setText(String.valueOf( llantaAMostrar.getNumeroCapas()));
        tf_cantidad.setText(String.valueOf(llantaAMostrar.getCantidad()));
        if(llantaAMostrar.getTipoLlanta().equals("Normal")){
        cb_tipoLlanta.setSelectedIndex(0);
                }else{
            if(llantaAMostrar.getTipoLlanta().equals("Industrial")){
            cb_tipoLlanta.setSelectedIndex(1);    
            }else{
             cb_tipoLlanta.setSelectedIndex(2);   
        }
        
    }
        bt_ingresarLlanta.setText("Modificar Llanta");
  }
    public void limpiarCampos() {
        tf_numeroLlanta.setText("");
        tf_marca.setText("");
        tf_diseno.setText("");
        tf_numeroCapas.setText("");
        tf_cantidad.setText("");
    }
    
    private void tf_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_marcaActionPerformed

    private void tf_numeroLlantaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_numeroLlantaKeyTyped
        Validacion.validarLongitud(tf_numeroLlanta, evt, 25);
    }//GEN-LAST:event_tf_numeroLlantaKeyTyped

    private void tf_marcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_marcaKeyTyped
        Validacion.validarLongitud(tf_marca, evt, 25);
    }//GEN-LAST:event_tf_marcaKeyTyped

    private void tf_disenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_disenoKeyTyped
        Validacion.validarLongitud(tf_diseno, evt, 25);
    }//GEN-LAST:event_tf_disenoKeyTyped

    private void tf_numeroCapasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_numeroCapasKeyTyped
        if(Validacion.soloNumeros(evt)){
            Validacion.validarLongitud(tf_numeroCapas, evt, 9);
        }
    }//GEN-LAST:event_tf_numeroCapasKeyTyped

    private void tf_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cantidadKeyTyped
        if(Validacion.soloNumeros(evt)){
            Validacion.validarLongitud(tf_cantidad, evt, 9);
        }
    }//GEN-LAST:event_tf_cantidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ingresarLlanta;
    private javax.swing.JComboBox<String> cb_tipoLlanta;
    private javax.swing.JLabel lb_cantidad;
    private javax.swing.JLabel lb_diseno;
    private javax.swing.JLabel lb_marca;
    private javax.swing.JLabel lb_numeroCapas;
    private javax.swing.JLabel lb_numeroLlanta;
    private javax.swing.JLabel lb_tipoLlanta;
    private javax.swing.JPanel pn_IngresarLlanta;
    private javax.swing.JTextField tf_cantidad;
    private javax.swing.JTextField tf_diseno;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_numeroCapas;
    private javax.swing.JTextField tf_numeroLlanta;
    // End of variables declaration//GEN-END:variables
}
