package com.company;

public class Product {
    private String categoryName,productName,brand;
    private  int ram,memory,id,price,stockAmount;
    private double discountRate,screenSize;

    public  Product(int id, String productName,String categoryName,int stockAmount,String brand,int price,double discountRate,
                    int ram, int memory, double  screenSize ){

        this.categoryName=categoryName;
        this.productName=productName;
        this.brand=brand;
        this.ram=ram;
        this.memory=memory;
        this.id=id;
        this.price=price;
        this.stockAmount=stockAmount;
        this.screenSize=screenSize;
        this.discountRate=discountRate;

    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public double  getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

}
