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
 * @author KN
 */
public class Customer {

    private int custId;
    private String custUsername;
    private String custPassword;
    private String custName;
    private String custSurname;
    private String custAddress;
    private String custState;
    private String custCity;
    private int custPostal;
    private int custTel;

    private Customer(ResultSet rs) throws SQLException {
        this.custId = rs.getInt("custId");
        this.custUsername = rs.getString("custUsername");
        this.custPassword = rs.getString("custPassword");
        this.custName = rs.getString("custName");
        this.custSurname = rs.getString("custSurname");
        this.custAddress = rs.getString("custAddress");
        this.custState = rs.getString("custState");
        this.custCity = rs.getString("custCity");
        this.custPostal = rs.getInt("custPostal");
        this.custTel = rs.getInt("custTel");
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustUsername() {
        return custUsername;
    }

    public void setCustUsername(String custUsername) {
        this.custUsername = custUsername;
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSurname() {
        return custSurname;
    }

    public void setCustSurname(String custSurname) {
        this.custSurname = custSurname;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        this.custState = custState;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public int getCustPostal() {
        return custPostal;
    }

    public void setCustPostal(int custPostal) {
        this.custPostal = custPostal;
    }

    public int getCustTel() {
        return custTel;
    }

    public void setCustTel(int custTel) {
        this.custTel = custTel;
    }
    
    public static List<Customer> findByUserName(String name) {
        List<Customer> customer = null;
        Customer c = null;
        Connection con = ConnectionBuilder.getConnection();
        try {
            PreparedStatement pstm = con.prepareStatement("select * from customer where custUsername like ?");
            pstm.setString(1, name + "%");
            ResultSet rs = pstm.executeQuery();
            while(rs.next()) {
                c = new Customer(rs);
                if(customer == null) {
                    customer = new ArrayList();
                }
                customer.add(c);
            }
            rs.close();
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customer;
    }
    
    
}
