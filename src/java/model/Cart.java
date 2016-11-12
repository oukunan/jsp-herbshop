/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author theca
 */
public class Cart {

    Map<Integer, CartDetail> items = null;
    private double totalMoney = 0;
    private double vatAmount = 0;
    private double subTotalMoney = 0;

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(double vatAmount) {
        this.vatAmount = vatAmount;
    }

    public double getSubTotalMoney() {
        return subTotalMoney;
    }

    public void setSubTotalMoney(double subTotalMoney) {
        this.subTotalMoney = subTotalMoney;
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

    public void addItem(int productId, int quantity) {
        CartDetail ct = items.get(productId);
        if (ct == null) {
            CartDetail tmp = new CartDetail(productId, quantity);
            items.put(productId, tmp);
        } else {
            ct.setQuantityOfHerb(ct.getQuantityOfHerb() + 1);
        }
    }

    public void updateItem(int productId, int qty) {
        CartDetail cd = items.get(productId);
        if (cd == null) {
            items.put(productId, new CartDetail(productId, qty));
        } else {
            cd.setQuantityOfHerb(qty);
        }
    }

    public void remove(int productId) {
        items.remove(productId);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (CartDetail cd : items.values()) {
            totalPrice += cd.getPrice();
        }
        return totalPrice;
    }

    public Map<Integer, CartDetail> getItems() {
        return items;
    }

    public void setItems(Map<Integer, CartDetail> items) {
        this.items = items;
    }

}
