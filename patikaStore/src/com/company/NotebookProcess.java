package com.company;

import java.util.ArrayList;
import java.util.List;

public class NotebookProcess extends Product{
    public NotebookProcess(int id, String productName, String categoryName, int stockAmount, String brand,
                           int price, double discountRate, int ram, int memory, double screenSize) {
        super(id, productName, categoryName, stockAmount, brand, price, discountRate, ram, memory, screenSize);
    }

    List<String> notebookList = new ArrayList<>();

    public List<String> getNotebookList() {
        System.out.format(getCategoryName());
        return notebookList;
    }

}
