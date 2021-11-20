package com.company;

import java.util.Date;

public class HealthInsurance extends Insurance{

    public HealthInsurance(String insuranceName, int insurancePrice, Date insuranceStartAndFinishDate) {
        super(insuranceName, insurancePrice, insuranceStartAndFinishDate);
    }

    @Override
    public double InsuranceCalculate() {
        return 0;
    }
}
