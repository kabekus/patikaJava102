package com.company;

import java.util.HashMap;

public class Brands {
    private int id;
    private String brandsName;

    public Brands(int id, String brandsName) {
        this.id = id;
        this.brandsName = brandsName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandsName() {
        HashMap<Integer,String> brandsList = new HashMap<Integer,String>();
        brandsList.put(1,"Samsung");
        brandsList.put(2,"Lenovo");
        brandsList.put(3,"Apple");
        brandsList.put(4,"Huawei");
        brandsList.put(5,"Casper");
        brandsList.put(6,"Asus");
        brandsList.put(7,"HP");
        brandsList.put(8,"Xiaomi");
        brandsList.put(9,"Monster");

        for(Integer brand : brandsList.keySet()){
            System.out.println("id :" + brand + " Marka :" + brandsList.get(brand));
        }
        return brandsName;
    }

    public void setBrandsName(String brandsName) {
        this.brandsName = brandsName;
    }
}
