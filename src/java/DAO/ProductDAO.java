/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Vann
 */
public class ProductDAO implements DBInfo{
    public static ArrayList<Product> getP(){
        ArrayList<Product> ap = new ArrayList<>();
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select ProductId, ProductName, ProductPicture, ProductContent from Product");
            while (rs.next()) {                
                String id = rs.getString(1);
                String name = rs.getString(2);
                String pic = rs.getString(3);
                String cont = rs.getString(4);
                ap.add(new Product(id, name, pic, cont));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
        return ap;
    }
    
    public static void main(String[] args) {
        System.out.println(getP().toString());
    }
}
