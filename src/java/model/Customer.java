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
    private long custPostal;
    private long custTel;
    private final static String SQL_ADD_MEMBER = "INSERT INTO CUSTOMER(custUsername,custPassword,custName,custSurname,custAddress,custState,custCity,custPostal,custTel)"
            + " VALUES(?,?,?,?,?,?,?,?,?)";

    public Customer(ResultSet rs) throws SQLException {
        this.custId = rs.getInt("custId");
        this.custUsername = rs.getString("custUsername");
        this.custPassword = rs.getString("custPassword");
        this.custName = rs.getString("custName");
        this.custSurname = rs.getString("custSurname");
        this.custAddress = rs.getString("custAddress");
        this.custState = rs.getString("custState");
        this.custCity = rs.getString("custCity");
        this.custPostal = rs.getLong("custPostal");
        this.custTel = rs.getLong("custTel");
    }

    public Customer() {

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

    public long getCustPostal() {
        return custPostal;
    }

    public void setCustPostal(long custPostal) {
        this.custPostal = custPostal;
    }

    public long getCustTel() {
        return custTel;
    }

    public void setCustTel(long custTel) {
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
            while (rs.next()) {
                c = new Customer(rs);
                if (customer == null) {
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

    public static int addMember(Customer c) {
        Connection con = ConnectionBuilder.getConnection();
        int affect = 0;
        try {
            PreparedStatement ps = con.prepareStatement(SQL_ADD_MEMBER);
            ps.setString(1, c.getCustUsername());
            ps.setString(2, c.getCustPassword());
            ps.setString(3, c.getCustName());
            ps.setString(4, c.getCustSurname());
            ps.setString(5, c.getCustAddress());
            ps.setString(6, c.getCustState());
            ps.setString(7, c.getCustCity());
            ps.setLong(8, c.getCustPostal());
            ps.setLong(9, c.getCustTel());
            ResultSet rs = getAllUsername();
            if(rs!=null){
                while(rs.next()){
                    if(rs.getString("custUsername").equalsIgnoreCase(c.getCustUsername())!=true){
                        affect = ps.executeUpdate();
                    }
                }
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return affect;
    }

    public static ResultSet getAllUsername() {
        ResultSet rs = null;
        Connection con = ConnectionBuilder.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT custUsername FROM CUSTOMER");
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
