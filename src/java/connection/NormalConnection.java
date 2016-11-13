/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.CartDetail;

/**
 *
 * @author KN
 */
public class NormalConnection {

    public static void main(String[] args) {
        try {
            System.out.println(CartDetail.getLastCartId());
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
