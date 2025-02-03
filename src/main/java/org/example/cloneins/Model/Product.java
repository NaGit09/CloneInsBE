package org.example.cloneins.Model;

public class Product {
    private long id;
    private String ProductName;
    private int year;
    private double price;
    private String url;

    public Product(long id, String productName, int year, double price, String url) {
        this.id = id;
        ProductName = productName;
        this.year = year;
        this.price = price;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
