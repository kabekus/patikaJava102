package com.company;

import java.util.Date;

public class TravelInsurance extends  Insurance{

    public TravelInsurance(String insuranceName, int insurancePrice, Date insuranceStartAndFinishDate) {
        super(insuranceName, insurancePrice, insuranceStartAndFinishDate);
    }

    @Override
    public double InsuranceCalculate() {
        return 0;
    }
}
