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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author theca
 */
public class Food {

    private int foodId;
    private String foodName;
    private String foodRecipe;
    private String foodDetail;
    private final static String SQL_SEARCH_FOOD_BY_NAME = "SELECT * FROM FOOD WHERE LOWER(foodName) LIKE ?";

    public Food() {
    }

    public Food(int foodId, String foodName, String foodRecipe, String foodDetail) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodRecipe = foodRecipe;
        this.foodDetail = foodDetail;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodRecipe() {
        return foodRecipe;
    }

    public void setFoodRecipe(String foodRecipe) {
        this.foodRecipe = foodRecipe;
    }

    public String getFoodDetail() {
        return foodDetail;
    }

    public void setFoodDetail(String foodDetail) {
        this.foodDetail = foodDetail;
    }
    
    public static List<Food> searchFoodByName(String name){
        List<Food> foods = null;
        ResultSet rs = null;
        Food food = null;
        Connection con = ConnectionBuilder.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(SQL_SEARCH_FOOD_BY_NAME);
            ps.setString(1, "%" + name.toLowerCase() + "%");
            rs = ps.executeQuery();
            if (rs != null) {
                if (foods == null) {
                    foods = new ArrayList<Food>();
                }
                food = new Food();
                food.ORM(rs, food);
                foods.add(food);
            }
            rs.close();
            con.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Herb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return foods;
    }

    public static void ORM(ResultSet rs, Food f) throws SQLException {
        f.setFoodId(rs.getInt("foodId"));
        f.setFoodName(rs.getString("foodName"));
        f.setFoodRecipe(rs.getString("foodRecipe"));
        f.setFoodDetail(rs.getString("foodDetail"));
    }
   
}
