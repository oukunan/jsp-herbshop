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
public class Diseases {
    private int diseId;
    private String diseName;
    private String diseType;
    private String positionInBody;
    private String diseDetail;
    private final static String SQL_SEARCH_DISEASES_BY_NAME = "SELECT * FROM DISEASES WHERE LOWER(diseName) LIKE ?"; 

    public Diseases() {
    }

    public Diseases(int diseId, String diseName, String diseType, String positionInBody, String diseDetail) {
        this.diseId = diseId;
        this.diseName = diseName;
        this.diseType = diseType;
        this.positionInBody = positionInBody;
        this.diseDetail = diseDetail;
    }

    public int getDiseId() {
        return diseId;
    }

    public void setDiseId(int diseId) {
        this.diseId = diseId;
    }

    public String getDiseName() {
        return diseName;
    }

    public void setDiseName(String diseName) {
        this.diseName = diseName;
    }

    public String getDiseType() {
        return diseType;
    }

    public void setDiseType(String diseType) {
        this.diseType = diseType;
    }

    public String getPositionInBody() {
        return positionInBody;
    }

    public void setPositionInBody(String positionInBody) {
        this.positionInBody = positionInBody;
    }

    public String getDiseDetail() {
        return diseDetail;
    }

    public void setDiseDetail(String diseDetail) {
        this.diseDetail = diseDetail;
    }
    
    public static List<Diseases> searchDiseasesByName(String name){
        List<Diseases> dises = null;
        ResultSet rs = null;
        Diseases dise = null;
        Connection con = ConnectionBuilder.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(SQL_SEARCH_DISEASES_BY_NAME);
            ps.setString(1, "%" + name.toLowerCase() + "%");
            rs = ps.executeQuery();
            if (rs != null) {
                if (dises == null) {
                    dises = new ArrayList<Diseases>();
                }
                dise = new Diseases();
                dise.ORM(rs, dise);
                dises.add(dise);
            }
            rs.close();
            con.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Herb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dises;
    }
    
    public static void ORM(ResultSet rs, Diseases d) throws SQLException {
        d.setDiseId(rs.getInt("diseId"));
        d.setDiseName(rs.getString("diseName"));
        d.setDiseType(rs.getString("diseType"));
        d.setPositionInBody(rs.getString("positionInBody"));
        d.setDiseDetail(rs.getString("diseDetail"));
    }
    
}
