/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.itrafa.dam_di_ud5_t1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author it-ra
 */
public class Model {

    /**
     *
     * @return
     */
    static public Connection getConection() {
        Connection conn = null;
        try {

            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/fabrica", "root", "12it-rafa#Root90");
            if (conn != null) {
                System.out.println("Connected to the database!");

            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("Fallo SQL: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            System.err.format("Fallo Desconocido: %s\n", e.getMessage());
        }
        return conn;
    }
}
