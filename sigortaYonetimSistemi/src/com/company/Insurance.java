package com.company;

import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private int insurancePrice;
    private Date insuranceStartAndFinishDate;

    public Insurance(String insuranceName, int insurancePrice, Date insuranceStartAndFinishDate) {
        this.insuranceName = insuranceName;
        this.insurancePrice = insurancePrice;
        this.insuranceStartAndFinishDate = insuranceStartAndFinishDate;
    }
    public abstract double InsuranceCalculate(); // Kalıtım alınan sıbıflarda doldur!
}
