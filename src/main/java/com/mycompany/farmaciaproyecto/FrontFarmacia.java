/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.farmaciaproyecto;

import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import com.mycompany.farmaciaproyecto.modelo.Pedido;
import com.mycompany.farmaciaproyecto.ResumenPedido;
import com.mycompany.farmaciaproyecto.controlador.ControladorPedido;
import java.awt.Color;
import javax.swing.ImageIcon;


/**
 *
 * @author Johan Slam
 */
public class FrontFarmacia extends javax.swing.JFrame {
    private static final Logger logger = Logger.getLogger(FrontFarmacia.class.getName());
    String TipoMedicamento[]={"Seleccionar","Analgésico", "Analéptico", "Anestésico", "Antiácido", "Antidepresivo", "Antibióticos"};
    
    public FrontFarmacia() {
        initComponents();
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(TipoMedicamento);
        TipoDeMedicamento.setModel(comboModel);
        setTitle("Datos del Pedido");  
        getContentPane().setBackground(new Color(205, 229, 236));
        Confirmar.setBackground(new Color(104, 141, 187));  
        Borrar.setBackground(new Color(104, 141, 187)); 
        setIconImage(new ImageIcon(getClass().getResource("/cora-nati.png")).getImage());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        NombreDelMedicamento = new javax.swing.JTextField();
        TipoDeMedicamento = new javax.swing.JComboBox<>();
        Cantidad = new javax.swing.JTextField();
        Cofarm = new javax.swing.JRadioButton();
        Empsephar = new javax.swing.JRadioButton();
        Cemefar = new javax.swing.JRadioButton();
        Confirmar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        NomMedi = new javax.swing.JLabel();
        TipMedi = new javax.swing.JLabel();
        NomCant = new javax.swing.JLabel();
        Distri = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FarmaciaPrincipal = new javax.swing.JCheckBox();
        FarmaciaSecundaria = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        NombreDelMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreDelMedicamentoActionPerformed(evt);
            }
        });

        TipoDeMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoDeMedicamentoActionPerformed(evt);
            }
        });

        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });

        buttonGroup1.add(Cofarm);
        Cofarm.setText("Cofarm");

        buttonGroup1.add(Empsephar);
        Empsephar.setText("Empsephar");
        Empsephar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpsepharActionPerformed(evt);
            }
        });

        buttonGroup1.add(Cemefar);
        Cemefar.setText("Cemefar");

        Confirmar.setText("Confirmar pedido");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        NomMedi.setText("Nombre del mediacamaento:");

        TipMedi.setText("Tipo De Medicamento:");

        NomCant.setText("Cantidad:");

        Distri.setText("Seleccione El Nombre Del Distribuidor:");

        jLabel1.setText("Sucursal a la cual debe llegar el pedido:");

        FarmaciaPrincipal.setText("Farmacial principal");
        FarmaciaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FarmaciaPrincipalActionPerformed(evt);
            }
        });

        FarmaciaSecundaria.setText("Farmacia secundaria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NomMedi)
                                .addGap(0, 38, Short.MAX_VALUE))
                            .addComponent(NombreDelMedicamento))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TipoDeMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipMedi))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomCant)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Distri)
                                    .addComponent(Cofarm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Empsephar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FarmaciaPrincipal)
                                    .addComponent(jLabel1)
                                    .addComponent(FarmaciaSecundaria)))
                            .addComponent(Cemefar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomMedi)
                    .addComponent(TipMedi)
                    .addComponent(NomCant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreDelMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoDeMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Distri)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cofarm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FarmaciaPrincipal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Empsephar)
                    .addComponent(FarmaciaSecundaria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cemefar)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreDelMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreDelMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreDelMedicamentoActionPerformed

    private void TipoDeMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoDeMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoDeMedicamentoActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadActionPerformed

    private void EmpsepharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpsepharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpsepharActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        String nombre = NombreDelMedicamento.getText();
        String tipo = (String) TipoDeMedicamento.getSelectedItem();
        String cantidadStr = Cantidad.getText();
        String distribuidor = "";
        if (Cofarm.isSelected()) distribuidor = "Cofarm";
        else if (Empsephar.isSelected()) distribuidor = "Empsephar";
        else if (Cemefar.isSelected()) distribuidor = "Cemefar";
        boolean principal = FarmaciaPrincipal.isSelected();
        boolean secundaria = FarmaciaSecundaria.isSelected();
        
        
        ControladorPedido controladorPedido = new ControladorPedido();
        String resultadoValidacion = controladorPedido.validarDatosPedido(nombre, tipo, cantidadStr, distribuidor, principal, secundaria);
        
        if(!resultadoValidacion.equals("Pedido verificado")){
            System.out.println(resultadoValidacion);
            return;
        }
        
        int cantidad = Integer.parseInt(cantidadStr);
        Pedido pedido = new Pedido(nombre, tipo, cantidad, distribuidor, principal, secundaria);
        System.out.println(pedido.getResumenPedido());
        
        ResumenPedido ventana = new ResumenPedido(pedido, distribuidor);
        ventana.setVisible(true);
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void FarmaciaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FarmaciaPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FarmaciaPrincipalActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        NombreDelMedicamento.setText("");
        Cantidad.setText("");
        TipoDeMedicamento.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        FarmaciaPrincipal.setSelected(false);
        FarmaciaSecundaria.setSelected(false);
    }//GEN-LAST:event_BorrarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrontFarmacia().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JRadioButton Cemefar;
    private javax.swing.JRadioButton Cofarm;
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel Distri;
    private javax.swing.JRadioButton Empsephar;
    private javax.swing.JCheckBox FarmaciaPrincipal;
    private javax.swing.JCheckBox FarmaciaSecundaria;
    private javax.swing.JLabel NomCant;
    private javax.swing.JLabel NomMedi;
    private javax.swing.JTextField NombreDelMedicamento;
    private javax.swing.JLabel TipMedi;
    private javax.swing.JComboBox<String> TipoDeMedicamento;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
