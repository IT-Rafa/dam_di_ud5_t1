/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.itrafa.dam_di_ud5_t1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author it-ra
 */
public class Model {

    /**
     *
     * @return
     */
    static public Connection getConection() throws SQLException {
        Connection conn = null;

        conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/fabrica", "root", "12it-rafa#Root90");
        if (conn != null) {
            Logger.getLogger(InitReport.class
                    .getName()).log(Level.INFO, "Connected to the database!");

        } else {
            Logger.getLogger(InitReport.class
                    .getName()).log(Level.INFO, "Failed to make connection!");
        }

        return conn;
    }
}
