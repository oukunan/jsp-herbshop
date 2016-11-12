/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author KN
 */
public class checkConnect {

    public checkConnect() {
    }
    

    public static boolean isDbConnected() {
        Connection conn = ConnectionBuilder.getConnection();
        final String CHECK_SQL_QUERY = "SELECT * from customer";
        boolean isConnected = false;
        try {
            final PreparedStatement statement = conn.prepareStatement(CHECK_SQL_QUERY);
            isConnected = true;
        } catch (SQLException | NullPointerException e) {
            // handle SQL error here!
        }
        return isConnected;
    }
}
