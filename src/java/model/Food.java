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
    private String foodIngredient;
    private final static String SQL_SEARCH_FOOD_BY_NAME = "SELECT * FROM FOOD WHERE LOWER(foodName) LIKE ?";
    private final static String SQL_FIND_FOOD_BY_ID = "SELECT * FROM FOOD WHERE foodId = ?";
    private final static String SQL_FIND_FOOD_BY_HERB_ID = "SELECT * FROM FOOD f JOIN HERBFORFOOD h ON h.Food_foodId = f.foodId "
            + "AND h.Herb_herbId = ?";

    public Food() {
    }

    public Food(int foodId, String foodName, String foodRecipe, String foodIngredient) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodRecipe = foodRecipe;
        this.foodIngredient = foodIngredient;
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

    public String getFoodIngredient() {
        return foodIngredient;
    }

    public void setFoodIngredient(String foodIngredient) {
        this.foodIngredient = foodIngredient;
    }

    public static List<Food> searchFoodByName(String name) {
        List<Food> foods = null;
        ResultSet rs = null;
        Food food = null;
        Connection con = ConnectionBuilder.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(SQL_SEARCH_FOOD_BY_NAME);
            ps.setString(1, name.toLowerCase() + "%");
            rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    if (foods == null) {
                        foods = new ArrayList<Food>();
                    }
                    food = new Food();
                    food.ORM(rs, food);
                    foods.add(food);
                }
            }
            rs.close();
            con.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Herb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return foods;
    }
    
    public static Food findFoodById(int id){
        Food f = null;
        ResultSet rs = null;
        Connection con = ConnectionBuilder.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(SQL_FIND_FOOD_BY_ID);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs != null) {
                f = new Food();
                while (rs.next()) {
                    f.ORM(rs, f);
                }
            }
            rs.close();
            con.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Herb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
    
    public static List<Food> findFoodByHerbId(int id){
        List<Food> foods = null;
        ResultSet rs = null;
        Food food = null;
        Connection con = ConnectionBuilder.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(SQL_FIND_FOOD_BY_HERB_ID);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    System.out.println("PASSSSSSS");
                    if (foods == null) {
                        foods = new ArrayList<Food>();
                    }
                    food = new Food();
                    food.setFoodId(rs.getInt("foodId"));
                    food.setFoodName(rs.getString("foodName"));
                    foods.add(food);
                }
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
        f.setFoodIngredient(rs.getString("foodIngredient"));
    }

}
