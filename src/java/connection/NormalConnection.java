/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author KN
 */
public class NormalConnection {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionBuilder.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM herb";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                System.out.print(rs.getString(1) + ", ");
                System.out.print(rs.getString(2) +", ");
                System.out.println(rs.getString(3) +", ");
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
