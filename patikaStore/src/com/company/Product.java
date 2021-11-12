package com.company;

public class Product {
    private String categoryName,productName,brand,color;
    private  int ram,memory,id,price,stockAmount,screenSize,batteryPower;
    private double discountRate;

    public  Product(int id, String productName,String categoryName,int stockAmount,String brand,int price,double discountRate,
                    int ram, int memory,int batteryPower,String color, int screenSize ){

        this.categoryName=categoryName;
        this.productName=productName;
        this.brand=brand;
        this.color=color;

        this.ram=ram;
        this.memory=memory;
        this.id=id;
        this.price=price;
        this.stockAmount=stockAmount;
        this.screenSize=screenSize;
        this.batteryPower=batteryPower;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

}
