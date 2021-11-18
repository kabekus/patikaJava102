package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Brands {
    private int brandId;
    private String brandsName;
    TreeSet<Brands> brands = new TreeSet<>();

    public Brands(){

    }

    public Brands(int brandId, String brandsName) {
        this.brandId = brandId;
        this.brandsName = brandsName;
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

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }


    public Brands getBrand(String brandName)
    {
        Iterator<Brands> itr = brands.iterator();
        Brands b;
        while(itr.hasNext())
        {
            b = itr.next();
            if(b.getBrandsName().equalsIgnoreCase(brandName))
            {
              return b;
            }
        }
        return null;
    }
}
