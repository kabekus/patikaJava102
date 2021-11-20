package com.company;

import java.util.Date;

public class ResidenceInsurance extends Insurance{

    public ResidenceInsurance(String insuranceName, int insurancePrice, Date insuranceStartAndFinishDate) {
        super(insuranceName, insurancePrice, insuranceStartAndFinishDate);
    }

    @Override
    public double InsuranceCalculate() {
        return 0;
    }
}
