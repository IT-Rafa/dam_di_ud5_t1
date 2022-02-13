/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.itrafa.dam_di_ud5_t1;

import java.awt.Desktop;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.*;

/**
 *
 * @author it-ra
 */
public class CreaReporte {

    public static Connection conexion = null;
    String baseDatos = "jdbc:mysql://localhost/fabrica";
    String usuario = "root";
    String clave = "";

    public CreaReporte() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(baseDatos, usuario, clave);
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Fallo al cargar JDBC");
            System.exit(1);
        } catch (SQLException sqle) {
            System.err.println("No se pudo conectar a BD");
            System.exit(1);
        } catch (Exception ex) {
            System.err.println("Imposible Conectar");
            System.exit(1);
        }
    }
//El método ejecutar recibe el parametro del informe

    public void ejecutar(int año) {
//Ruta del informe respecto del proyecto NetBeans
        String archivojasper = "PedidosCiudadParametro.jasper";
        try {
//Cargamos los parametros del informe en una tabla Hash
            Map parametros = new HashMap();
            Object put = parametros.put("año", año);
//Generamos el informe en memoria
            JasperPrint print = JasperFillManager.fillReport(archivojasper, parametros, conexion);
            // Exporta el informe a PDF
JasperExportManager.exportReportToPdfFile(print, "informe.pdf");
//Abre el archivo PDF generado
            File path = new File("informe.pdf");
            Desktop.getDesktop().open(path);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
