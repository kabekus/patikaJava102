package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Brands {
    private String brandsName;

    public Brands() {
    }

    public String getBrandsName() {
        ArrayList<String> brandsList = new ArrayList<>();
        brandsList.add("Samsung");
        brandsList.add("Lenovo");
        brandsList.add("Apple");
        brandsList.add("Huawei");
        brandsList.add("Casper");
        brandsList.add("Asus");
        brandsList.add("HP");
        brandsList.add("Xiaomi");
        brandsList.add("Monster");

        Collections.sort(brandsList);
        for(String brand : brandsList){
            System.out.println("-"+brand);
        }
        return brandsName;
    }

    public void setBrandsName(String brandsName) {
        this.brandsName = brandsName;
    }
}
