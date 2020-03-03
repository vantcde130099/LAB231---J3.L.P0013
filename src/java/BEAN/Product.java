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
public class Product {
    private String ProductId;
    private String ProductName;
    private String ProductPicture;
    private String ProductContent;

    public Product() {
    }

    public Product(String ProductId, String ProductName, String ProductPicture, String ProductContent) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.ProductPicture = ProductPicture;
        this.ProductContent = ProductContent;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductPicture() {
        return ProductPicture;
    }

    public void setProductPicture(String ProductPicture) {
        this.ProductPicture = ProductPicture;
    }

    public String getProductContent() {
        return ProductContent;
    }

    public void setProductContent(String ProductContent) {
        this.ProductContent = ProductContent;
    }

    @Override
    public String toString() {
        return "Product{" + "ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductPicture=" + ProductPicture + ", ProductContent=" + ProductContent + '}';
    }
    
    
}
