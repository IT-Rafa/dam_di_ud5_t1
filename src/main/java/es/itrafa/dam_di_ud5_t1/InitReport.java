/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.itrafa.dam_di_ud5_t1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author it-ra
 */
public class InitReport extends javax.swing.JFrame {

    /**
     * Creates new form InitReport
     */
    public InitReport() {
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

        mainTitle_jLabel = new javax.swing.JLabel();
        border_jPanel = new javax.swing.JPanel();
        noSub_jPanel = new javax.swing.JPanel();
        show_AllFact_NoSub_jButton = new javax.swing.JButton();
        show_OneFact_NoSub_jButton = new javax.swing.JButton();
        selectClient_NoSub_jComboBox = new javax.swing.JComboBox<>();
        withSub_jPanel = new javax.swing.JPanel();
        show_AllFact_WithSub_jButton = new javax.swing.JButton();
        show_OneFact_WithSub_jButton = new javax.swing.JButton();
        selectClient_WithSub_jComboBox = new javax.swing.JComboBox<>();
        exit_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainTitle_jLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mainTitle_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitle_jLabel.setText("Listados Facturas");

        border_jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        noSub_jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Sin subinformes"));

        show_AllFact_NoSub_jButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show_AllFact_NoSub_jButton.setText("Todos Clientes");
        show_AllFact_NoSub_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_AllFact_NoSub_jButtonActionPerformed(evt);
            }
        });

        show_OneFact_NoSub_jButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show_OneFact_NoSub_jButton.setText("Cliente Seleccionado");
        show_OneFact_NoSub_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_OneFact_NoSub_jButtonActionPerformed(evt);
            }
        });

        selectClient_NoSub_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectClient_NoSub_jComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout noSub_jPanelLayout = new javax.swing.GroupLayout(noSub_jPanel);
        noSub_jPanel.setLayout(noSub_jPanelLayout);
        noSub_jPanelLayout.setHorizontalGroup(
            noSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noSub_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(show_AllFact_NoSub_jButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(noSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(show_OneFact_NoSub_jButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectClient_NoSub_jComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        noSub_jPanelLayout.setVerticalGroup(
            noSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noSub_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(noSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(show_AllFact_NoSub_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(noSub_jPanelLayout.createSequentialGroup()
                        .addComponent(selectClient_NoSub_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(show_OneFact_NoSub_jButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        withSub_jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Con subinformes"));

        show_AllFact_WithSub_jButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show_AllFact_WithSub_jButton.setText("Todos Clientes");
        show_AllFact_WithSub_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_AllFact_WithSub_jButtonActionPerformed(evt);
            }
        });

        show_OneFact_WithSub_jButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show_OneFact_WithSub_jButton.setText("Cliente Seleccionado");
        show_OneFact_WithSub_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_OneFact_WithSub_jButtonActionPerformed(evt);
            }
        });

        selectClient_WithSub_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout withSub_jPanelLayout = new javax.swing.GroupLayout(withSub_jPanel);
        withSub_jPanel.setLayout(withSub_jPanelLayout);
        withSub_jPanelLayout.setHorizontalGroup(
            withSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withSub_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(show_AllFact_WithSub_jButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(withSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(show_OneFact_WithSub_jButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectClient_WithSub_jComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        withSub_jPanelLayout.setVerticalGroup(
            withSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withSub_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(withSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(show_AllFact_WithSub_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(withSub_jPanelLayout.createSequentialGroup()
                        .addComponent(selectClient_WithSub_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(show_OneFact_WithSub_jButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout border_jPanelLayout = new javax.swing.GroupLayout(border_jPanel);
        border_jPanel.setLayout(border_jPanelLayout);
        border_jPanelLayout.setHorizontalGroup(
            border_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(border_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noSub_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withSub_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        border_jPanelLayout.setVerticalGroup(
            border_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noSub_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(withSub_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exit_jButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit_jButton.setText("SALIR");
        exit_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit_jButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mainTitle_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(border_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTitle_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 31, Short.MAX_VALUE)
                .addComponent(border_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit_jButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show_AllFact_WithSub_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_AllFact_WithSub_jButtonActionPerformed

    }//GEN-LAST:event_show_AllFact_WithSub_jButtonActionPerformed

    private void show_OneFact_WithSub_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_OneFact_WithSub_jButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_show_OneFact_WithSub_jButtonActionPerformed

    private void show_AllFact_NoSub_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_AllFact_NoSub_jButtonActionPerformed
        try {
            Connection conn = Model.getConection();

            String pathReport = "src\\Reports\\facturas.jasper";
            JasperReport allFacturasReport = (JasperReport) JRLoader.loadObjectFromFile(pathReport);

            JasperPrint jprint = JasperFillManager.fillReport(pathReport, null, conn);
            JasperViewer jaspView = new JasperViewer(jprint, false);

            jaspView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            jaspView.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(InitReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_show_AllFact_NoSub_jButtonActionPerformed

    private void show_OneFact_NoSub_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_OneFact_NoSub_jButtonActionPerformed
        try {
            Connection conn = Model.getConection();

            String pathReport = "src\\Reports\\facturas_One.jasper";
            Map param = new HashMap();
            param.put("cliente", selectClient_NoSub_jComboBox.getSelectedItem().toString());
            JasperReport oneFacturasReport = (JasperReport) JRLoader.loadObjectFromFile(pathReport);

            JasperPrint jprint = JasperFillManager.fillReport(pathReport, null, conn);
            JasperViewer jaspView = new JasperViewer(jprint, false);

            jaspView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            jaspView.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(InitReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_show_OneFact_NoSub_jButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        selectClient_NoSub_jComboBox.removeAllItems();
        selectClient_WithSub_jComboBox.removeAllItems();
        try {
            Connection conn = Model.getConection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT Nombre FROM clientes");
            
            while(rs.next()){
                String cliName = rs.getString("Nombre");
                selectClient_NoSub_jComboBox.addItem(cliName);
                selectClient_WithSub_jComboBox.addItem(cliName);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InitReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void exit_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_jButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exit_jButtonActionPerformed

    private void selectClient_NoSub_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectClient_NoSub_jComboBoxActionPerformed
       System.out.println(selectClient_NoSub_jComboBox.getSelectedItem().toString());             
        // TODO add your handling code here:
    }//GEN-LAST:event_selectClient_NoSub_jComboBoxActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InitReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InitReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InitReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InitReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InitReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel border_jPanel;
    private javax.swing.JButton exit_jButton;
    private javax.swing.JLabel mainTitle_jLabel;
    private javax.swing.JPanel noSub_jPanel;
    private javax.swing.JComboBox<String> selectClient_NoSub_jComboBox;
    private javax.swing.JComboBox<String> selectClient_WithSub_jComboBox;
    private javax.swing.JButton show_AllFact_NoSub_jButton;
    private javax.swing.JButton show_AllFact_WithSub_jButton;
    private javax.swing.JButton show_OneFact_NoSub_jButton;
    private javax.swing.JButton show_OneFact_WithSub_jButton;
    private javax.swing.JPanel withSub_jPanel;
    // End of variables declaration//GEN-END:variables
}