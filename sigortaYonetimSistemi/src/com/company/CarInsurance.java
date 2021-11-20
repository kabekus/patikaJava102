package com.company;

import java.util.Date;

public class CarInsurance extends Insurance{

    public CarInsurance(String insuranceName, int insurancePrice, Date insuranceStartAndFinishDate) {
        super(insuranceName, insurancePrice, insuranceStartAndFinishDate);
    }

    @Override
    public double InsuranceCalculate() {
        return 0;
    }
}
