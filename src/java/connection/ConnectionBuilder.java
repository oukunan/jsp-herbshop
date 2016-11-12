/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KN
 */
public class ConnectionBuilder {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/herbshop", "root", "");
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return conn;
    }

    public static Connection getConnectionDBServer() {
        Connection conn = null;
        try {    
            Class.forName("com.mysql.jdbc.Driver");
            String username = "b97ca0009798e6";
            String password = "b5695d75";
            conn = DriverManager.getConnection("jdbc:mysql://ap-cdbr-azure-southeast-b.cloudapp.net/acsm_6a0f73f9a6308a0", username, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
