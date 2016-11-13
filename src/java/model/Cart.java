/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.ConnectionBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author theca
 */
public class Cart {

    Map<Integer, CartDetail> items = null;
    private int cartId;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public static String getSQL_INSERT() {
        return SQL_INSERT;
    }

    public static void setSQL_INSERT(String SQL_INSERT) {
        Cart.SQL_INSERT = SQL_INSERT;
    }
    private double totalMoney = 0;
    private double vatAmount = 0;
    private double money = 0;
    private static String SQL_INSERT = "INSERT INTO CART(money,vatAmount,totalMoney,Customer_custId)"
            + "VALUES (?,?,?,?)";

    public double getMoney() {
        money = 0;
        for (CartDetail cd : items.values()) {
            money += cd.getPrice();
        }
        return money;
    }

    public void setMoney(double Money) {
        this.money = Money;
    }

    public double getVatAmount() {
        vatAmount = money * 7 / 100;
        return vatAmount;
    }

    public void setVatAmount(double vatAmount) {
        this.vatAmount = vatAmount;
    }

    public double getTotalMoney() {
        totalMoney = money + vatAmount;
        return totalMoney;
    }

    public void setTotalMoney(double TotalMoney) {
        this.totalMoney = totalMoney;
    }

    public Cart() {
        items = new HashMap<>();
    }

    public int getSize() {
        return items.size();
    }

    public CartDetail getItem(int productId) {
        return items.get(productId);
    }

    public void addItem(int productId) {
        CartDetail ct = items.get(productId);
        if (ct == null) {
            CartDetail tmp = new CartDetail(productId);
            items.put(productId, tmp);
        } else {
            ct.setQuantityOfHerb(ct.getQuantityOfHerb() + 1);
        }
        calculate();
    }

    public void updateItem(int productId, double qty) {
        CartDetail cd = items.get(productId);
        if (cd == null) {
            items.put(productId, new CartDetail(productId, qty));
        } else {
            cd.setQuantityOfHerb(qty);
        }
        calculate();
    }

    public void remove(int productId) {
        items.remove(productId);
    }

    public Map<Integer, CartDetail> getItems() {
        return items;
    }

    public void setItems(Map<Integer, CartDetail> items) {
        this.items = items;
    }

    public void calculate() {
        getMoney();
        getVatAmount();
        getTotalMoney();
    }

    public static void storeCartHistory(Cart c, Customer cust) {
        Connection con = ConnectionBuilder.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(SQL_INSERT);
            ps.setDouble(1, c.getMoney());
            ps.setDouble(2, c.vatAmount);
            ps.setDouble(3, c.totalMoney);
            ps.setInt(4, cust.getCustId());
            ps.executeUpdate();
            CartDetail.storeCartDetailHistory(c);
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
