/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author theca
 */
public class CartDetail {

    private Herb herb;
    private int cartDetailId;
    private double quantityOfHerb;
    private double price;
    private final static String SQL_STORE_HISTORY = "INSERT INTO CARTDETAIL(quantityOfHerb,price,Cart_cartId,Herb_herbId)"
            + " VALUES(?,?,?,?);";

    public CartDetail() {
    }

    public CartDetail(int herbId) {
        this(herbId, 1);
    }

    public CartDetail(int herbId, double quantity) {
        quantityOfHerb = quantity;
        herb = Herb.findHerbById(herbId);
        calculatePrice();
    }

    public Herb getHerb() {
        return herb;
    }

    public int getCartDetailId() {
        return cartDetailId;
    }

    public double getQuantityOfHerb() {
        return quantityOfHerb;
    }

    public double getPrice() {
        return price;
    }

    public void setHerb(Herb herb) {
        this.herb = herb;
    }

    public void setCartDetailId(int cartDetailId) {
        this.cartDetailId = cartDetailId;
    }

    public void setQuantityOfHerb(double quantityOfHerb) {
        this.quantityOfHerb = quantityOfHerb;
        calculatePrice();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void calculatePrice() {
        price = herb.getHerbPrice() * quantityOfHerb;
    }

    public static void storeCartDetailHistory(Cart c) {
        Connection con = ConnectionBuilder.getConnection();
        Map<Integer, CartDetail> tmp;
        try {
            PreparedStatement ps = con.prepareStatement(SQL_STORE_HISTORY);
            tmp = c.getItems();
            for (CartDetail cd : tmp.values()) {
                ps.setDouble(1, cd.getQuantityOfHerb());
                ps.setDouble(2, cd.getPrice());
                ps.setInt(3, getLastCartId());
                ps.setInt(4, cd.getHerb().getHerbId());
                ps.executeUpdate();
            }
            con.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CartDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int getLastCartId() {
        int id = 0;
        Connection con = ConnectionBuilder.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT cartId FROM CART ORDER BY cartId DESC LIMIT 1");
            if(rs!=null){
                while(rs.next()){
                    id = rs.getInt("cartId");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CartDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
