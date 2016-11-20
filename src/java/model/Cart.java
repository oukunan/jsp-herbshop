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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    private double totalMoney = 0;
    private double vatAmount = 0;
    private double money = 0;
    private String date;
    private static String SQL_INSERT = "INSERT INTO CART(money,vatAmount,totalMoney,Customer_custId)"
            + "VALUES (?,?,?,?)";
    private static String SQL_GET_CART = "SELECT * FROM CART WHERE Customer_custId = ?";
    private static String SQL_GET_CART_BY_CART_ID = "SELECT * FROM CART WHERE cartId = ?";

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

    public double getMoney() {
        return money;
    }
    
    public double getCalculateMoney(){
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public Cart(ResultSet rs) throws SQLException {
        this.cartId = rs.getInt("cartId");
        this.money = rs.getDouble("money");
        this.totalMoney = rs.getDouble("totalMoney");
        this.vatAmount = rs.getDouble("vatAmount");
        this.date = rs.getString("orderDate");
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
        getCalculateMoney();
        getVatAmount();
        getTotalMoney();
    }

    public static void storeCartHistory(Cart c, Customer cust) {
        Connection con = ConnectionBuilder.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(SQL_INSERT);
            ps.setDouble(1, c.getCalculateMoney());
            ps.setDouble(2, c.vatAmount);
            ps.setDouble(3, c.totalMoney);
            ps.setInt(4, cust.getCustId());
            ps.executeUpdate();
            CartDetail.storeCartDetailHistory(c);
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<Cart> getCartByCustomerId(int custId) {
        List<Cart> lists = new ArrayList<Cart>();
        Connection con = ConnectionBuilder.getConnection();
        Cart c;
        try {
            PreparedStatement ps = con.prepareStatement(SQL_GET_CART);
            ps.setInt(1, custId);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    c = new Cart(rs);
                    lists.add(c);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lists;
    }
    
    public static Cart getCartByCartId(int cartId) {
        Cart cart = null;
        Connection con = ConnectionBuilder.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(SQL_GET_CART_BY_CART_ID);
            ps.setInt(1, cartId);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    cart = new Cart(rs);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cart;
    }


    public static void main(String[] args) {
        List<Cart> lists = getCartByCustomerId(2);
        for (Cart list : lists) {
            System.out.println(list.getCartId());
            System.out.println(list.getTotalMoney());
            System.out.println(list.getDate());
        }
    }
}
