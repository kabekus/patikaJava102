package com.company;

public class PhoneProcess extends Product{
    private double batteryPower;
    private String color;
    public PhoneProcess(int id, String productName, String categoryName, int stockAmount, String brand, int price, double discountRate, int ram, int memory, double batteryPower, String color, double screenSize) {
        super(id, productName, categoryName, stockAmount, brand, price, discountRate, ram, memory, screenSize);
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public double getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(double batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
