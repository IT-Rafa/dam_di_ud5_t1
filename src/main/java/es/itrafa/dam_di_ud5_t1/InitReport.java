/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.itrafa.dam_di_ud5_t1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
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
        Listados_jTabbedPane = new javax.swing.JTabbedPane();
        noSub_jPanel = new javax.swing.JPanel();
        factNoSub_jPanel = new javax.swing.JPanel();
        show_allFact_noSub_jButton = new javax.swing.JButton();
        selectClient_jComboBox = new javax.swing.JComboBox<>();
        show_FactCli_NoSub_jButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        artNoSubjPanel = new javax.swing.JPanel();
        show_ventas_totales_jButton = new javax.swing.JButton();
        withSub_jPanel = new javax.swing.JPanel();
        noSub_jPanel1 = new javax.swing.JPanel();
        show_AllFact_WithSub_jButton = new javax.swing.JButton();
        exit_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("dam di ud5 t1");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainTitle_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        mainTitle_jLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mainTitle_jLabel.setForeground(new java.awt.Color(204, 204, 204));
        mainTitle_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitle_jLabel.setText("Listados");
        mainTitle_jLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainTitle_jLabel.setOpaque(true);

        border_jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Listados_jTabbedPane.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        factNoSub_jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Facturas"));

        show_allFact_noSub_jButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show_allFact_noSub_jButton.setText("Todas Facturas");
        show_allFact_noSub_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allReports_jButtonActionPerformed(evt);
            }
        });

        selectClient_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectClient_jComboBoxActionPerformed(evt);
            }
        });

        show_FactCli_NoSub_jButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show_FactCli_NoSub_jButton.setText("Facturas por Cliente");
        show_FactCli_NoSub_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allReports_jButtonActionPerformed(evt);
            }
        });

        jSeparator1.setOpaque(true);

        javax.swing.GroupLayout factNoSub_jPanelLayout = new javax.swing.GroupLayout(factNoSub_jPanel);
        factNoSub_jPanel.setLayout(factNoSub_jPanelLayout);
        factNoSub_jPanelLayout.setHorizontalGroup(
            factNoSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(factNoSub_jPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(factNoSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(show_FactCli_NoSub_jButton)
                    .addComponent(selectClient_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_allFact_noSub_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(factNoSub_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        factNoSub_jPanelLayout.setVerticalGroup(
            factNoSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(factNoSub_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(show_allFact_noSub_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectClient_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show_FactCli_NoSub_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        artNoSubjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Artículos"));

        show_ventas_totales_jButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show_ventas_totales_jButton.setText("Ventas Totales");
        show_ventas_totales_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allReports_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout artNoSubjPanelLayout = new javax.swing.GroupLayout(artNoSubjPanel);
        artNoSubjPanel.setLayout(artNoSubjPanelLayout);
        artNoSubjPanelLayout.setHorizontalGroup(
            artNoSubjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(artNoSubjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(show_ventas_totales_jButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        artNoSubjPanelLayout.setVerticalGroup(
            artNoSubjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(artNoSubjPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(show_ventas_totales_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout noSub_jPanelLayout = new javax.swing.GroupLayout(noSub_jPanel);
        noSub_jPanel.setLayout(noSub_jPanelLayout);
        noSub_jPanelLayout.setHorizontalGroup(
            noSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noSub_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(factNoSub_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(artNoSubjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        noSub_jPanelLayout.setVerticalGroup(
            noSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noSub_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(noSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(artNoSubjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(factNoSub_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Listados_jTabbedPane.addTab("Sin sub-informes", noSub_jPanel);

        noSub_jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Facturas"));

        show_AllFact_WithSub_jButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show_AllFact_WithSub_jButton.setText("Todas Facturas");
        show_AllFact_WithSub_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allReports_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout noSub_jPanel1Layout = new javax.swing.GroupLayout(noSub_jPanel1);
        noSub_jPanel1.setLayout(noSub_jPanel1Layout);
        noSub_jPanel1Layout.setHorizontalGroup(
            noSub_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
            .addGroup(noSub_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(noSub_jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(show_AllFact_WithSub_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        noSub_jPanel1Layout.setVerticalGroup(
            noSub_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(noSub_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(noSub_jPanel1Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(show_AllFact_WithSub_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout withSub_jPanelLayout = new javax.swing.GroupLayout(withSub_jPanel);
        withSub_jPanel.setLayout(withSub_jPanelLayout);
        withSub_jPanelLayout.setHorizontalGroup(
            withSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withSub_jPanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(noSub_jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        withSub_jPanelLayout.setVerticalGroup(
            withSub_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withSub_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noSub_jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Listados_jTabbedPane.addTab("Con sub-informes", withSub_jPanel);

        javax.swing.GroupLayout border_jPanelLayout = new javax.swing.GroupLayout(border_jPanel);
        border_jPanel.setLayout(border_jPanelLayout);
        border_jPanelLayout.setHorizontalGroup(
            border_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Listados_jTabbedPane)
                .addContainerGap())
        );
        border_jPanelLayout.setVerticalGroup(
            border_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Listados_jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Listados_jTabbedPane.getAccessibleContext().setAccessibleName("Sin Subinformes");
        Listados_jTabbedPane.getAccessibleContext().setAccessibleDescription("");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mainTitle_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(border_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit_jButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTitle_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(border_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit_jButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Show a JasperViewer with the report of all bills/orders of the selected
     * get the id of cliente from text in selectClient_NoSub_jComboBox
     *
     * @param evt Click on show_FactCli_NoSub_jButton
     */
    private void allReports_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allReports_jButtonActionPerformed
        Connection conn = null;
        String pathPdfOutput = "src\\main\\java\\es\\itrafa\\dam_di_ud5_t1\\output_reports\\";
        String pathJReport = "src\\main\\java\\es\\itrafa\\dam_di_ud5_t1\\reports\\";
        String fullPathJReport = null;
        String fullPathPdfOutput = null;
        Map param = null;

        try {
            conn = Model.getConection();

            if (evt.getSource()
                    == show_allFact_noSub_jButton) {
                // *** EJ 1 todas facturas todos clientes ***
                fullPathJReport = pathJReport + "facturas.jasper";
                fullPathPdfOutput = pathPdfOutput + "Facturas.pdf";

            } else if (evt.getSource()
                    == show_FactCli_NoSub_jButton) {
                // *** EJ 2 todas facturas un cliente ***

                fullPathJReport = pathJReport + "facturas_Cli.jasper";

                param = new HashMap();
                String clienteInCombo = selectClient_jComboBox.getSelectedItem().toString();
                int i = clienteInCombo.indexOf(" | ");
                Integer id = Integer.parseInt(clienteInCombo.substring(0, i));
                fullPathPdfOutput = pathPdfOutput + "Facturas_cli_" + id + ".pdf";
                param.put("idToFind", id);

            } else if (evt.getSource()
                    == show_ventas_totales_jButton) {
                // *** EJ 3 todas ventas artículos ***
                fullPathJReport = pathJReport + "ventas_totales.jasper";
                fullPathPdfOutput = pathPdfOutput + "Ventas_totales.pdf";

            } else if (evt.getSource()
                    == show_AllFact_WithSub_jButton) {
                // *** EJ 4 todas facturas todos clientes con subinformes ***
                fullPathJReport = pathJReport + "facturas_sub.jasper";
                fullPathPdfOutput = pathPdfOutput + "facturas_sub.pdf";
            }

            String[] options = new String[]{"Ver con JasperView", "Ver con Visor PDF por defecto", "Solo Guardar", "Cancelar"};

            int op = JOptionPane.showOptionDialog(null, "Elige una opción", "Opciones de informe",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, options[0]);

            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile(fullPathJReport);
            JasperPrint jprint = JasperFillManager.fillReport(fullPathJReport, param, conn);

            switch (op) {
                case 0:
                    JasperViewer jaspView = new JasperViewer(jprint, false);
                    jaspView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    jaspView.setVisible(true);
                    break;
                case 1:
                    JasperExportManager.exportReportToPdfFile(jprint, fullPathPdfOutput);
//Abre el archivo PDF generado
                    File path = new File(fullPathPdfOutput);
                    Desktop.getDesktop().open(path);
                    break;
                case 2:
                    JasperExportManager.exportReportToPdfFile(jprint, fullPathPdfOutput);
                    break;
                default:
                    break;
            }

        } catch (JRException | IOException ex) {
            Logger.getLogger(InitReport.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_allReports_jButtonActionPerformed

    /**
     * get all clients fom db and add them to the selectClient_NoSub_jComboBox.
     * Build text to show id + client name in ComboBox
     *
     * @param evt
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        selectClient_jComboBox.removeAllItems();
        try {
            Connection conn = Model.getConection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_Cliente, Nombre FROM clientes");

            while (rs.next()) {
                int cliID = rs.getInt("ID_Cliente");
                String cliName = rs.getString("Nombre");
                selectClient_jComboBox.addItem(cliID + " | " + cliName);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InitReport.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened
    /**
     * Close program
     *
     * @param evt Click on exit_jButton
     */
    private void exit_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_jButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exit_jButtonActionPerformed
    /**
     * Only to check. Show the modified text of client selected
     *
     * @param evt Select a item from selectClient_NoSub_jComboBox, including on
     * init selection
     * @see formWindowOpened
     */
    private void selectClient_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectClient_jComboBoxActionPerformed
        String nameInCombo = selectClient_jComboBox.getSelectedItem().toString();
        int i = nameInCombo.indexOf(" | ");

        String realName = (String) nameInCombo.subSequence(i + 3, nameInCombo.length());
        String clienteInCombo = selectClient_jComboBox.getSelectedItem().toString();

        int id = Integer.parseInt(clienteInCombo.substring(0, i));

        System.out.println(realName);
        System.out.println(id);
    }//GEN-LAST:event_selectClient_jComboBoxActionPerformed

    /**
     * Init graphic interface
     *
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
            java.util.logging.Logger.getLogger(InitReport.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InitReport.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InitReport.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InitReport.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTabbedPane Listados_jTabbedPane;
    private javax.swing.JPanel artNoSubjPanel;
    private javax.swing.JPanel border_jPanel;
    private javax.swing.JButton exit_jButton;
    private javax.swing.JPanel factNoSub_jPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mainTitle_jLabel;
    private javax.swing.JPanel noSub_jPanel;
    private javax.swing.JPanel noSub_jPanel1;
    private javax.swing.JComboBox<String> selectClient_jComboBox;
    private javax.swing.JButton show_AllFact_WithSub_jButton;
    private javax.swing.JButton show_FactCli_NoSub_jButton;
    private javax.swing.JButton show_allFact_noSub_jButton;
    private javax.swing.JButton show_ventas_totales_jButton;
    private javax.swing.JPanel withSub_jPanel;
    // End of variables declaration//GEN-END:variables

}
