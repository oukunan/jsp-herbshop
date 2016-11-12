/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author theca
 */
public class CartDetail {

    Herb herb;
    int cartDetailId;
    int quantityOfHerb;
    double price;

    public CartDetail() {
    }

    public CartDetail(Herb herb,int quantityOfHerb) {
        this.herb = herb;
        this.quantityOfHerb = quantityOfHerb;
        calculatePrice();
    }

    public Herb getHerb() {
        return herb;
    }

    public int getCartDetailId() {
        return cartDetailId;
    }

    public int getQuantityOfHerb() {
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

    public void setQuantityOfHerb(int quantityOfHerb) {
        this.quantityOfHerb = quantityOfHerb;
        calculatePrice();
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void calculatePrice(){
        price = herb.getHerbPrice() * quantityOfHerb;
    }
}
