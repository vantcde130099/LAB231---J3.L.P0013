/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.Menu;
import BEAN.Product;
import static DAO.DBInfo.dbURL;
import static DAO.DBInfo.driverName;
import static DAO.DBInfo.passDB;
import static DAO.DBInfo.userDB;
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
public class MenuDAO {
    public static ArrayList<Menu> getMenu(){
        ArrayList<Menu> am = new ArrayList<>();
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select MenuId, MenuName, MenuDetail, Price from Menu");
            while (rs.next()) {                
                String id = rs.getString(1);
                String name = rs.getString(2);
                String detail = rs.getString(3);
                String price = rs.getString(4);
                am.add(new Menu(id, name, detail, price));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
        return am;
    }
    
    public static void main(String[] args) {
        System.out.println(getMenu().toString());
    }
}
