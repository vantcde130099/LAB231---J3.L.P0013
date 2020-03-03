/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

/**
 *
 * @author Vann
 */
public class Menu {
    private String MenuId;
    private String MenuName;
    private String MenuDetail;
    private String Price;

    public Menu() {
    }

    public Menu(String MenuId, String MenuName, String MenuDetail, String Price) {
        this.MenuId = MenuId;
        this.MenuName = MenuName;
        this.MenuDetail = MenuDetail;
        this.Price = Price;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String MenuId) {
        this.MenuId = MenuId;
    }

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String MenuName) {
        this.MenuName = MenuName;
    }

    public String getMenuDetail() {
        return MenuDetail;
    }

    public void setMenuDetail(String MenuDetail) {
        this.MenuDetail = MenuDetail;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Menu{" + "MenuId=" + MenuId + ", MenuName=" + MenuName + ", MenuDetail=" + MenuDetail + ", Price=" + Price + '}';
    }
    
    
}
