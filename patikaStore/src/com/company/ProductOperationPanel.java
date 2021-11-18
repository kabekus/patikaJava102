package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductOperationPanel {
    ArrayList<NotebookProcess> noteBookList = new ArrayList<>();
    ArrayList<PhoneProcess> phoneList = new ArrayList<>();
    Brands brands = new Brands();


    public void Notebook(){
        NotebookProcess nbHuawei = new NotebookProcess(1,"Huawei Matebook 14  ","Bilgisayar",
                5,"Huawei",7000,0.50,16,250,14);
        NotebookProcess nbLenovo = new NotebookProcess(2,"LENOVO V14 IGL      ","Bilgisayar",
                5,"Lenovo",3699,0.50,8,250,14);
        NotebookProcess nbAsus  = new NotebookProcess(3,"ASUS Tuf Gaming     ","Bilgisayar",
                5,"Asus  ",8199,0.50,32,250,15.6);


        noteBookList.add(nbHuawei);
        noteBookList.add(nbLenovo);
        noteBookList.add(nbAsus);
        listNoteBook(noteBookList);
    }
    private void listNoteBook(ArrayList<NotebookProcess> noteBookList) {
        String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s |%n";
        String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s |%n";
        System.out.println("--------------------------------------------------------------------------------------------\n");
        System.out.format(headers, "ID", "Ürün Adı", "Fiyat", "Marka ", "Depolama", "Ekran", "RAM");
        System.out.println("--------------------------------------------------------------------------------------------\n");

        for (NotebookProcess product : noteBookList) {
                System.out.format(leftAlignFormat, product.getId(), product.getProductName(), product.getPrice(), product.getBrand(),
                        product.getMemory(), product.getScreenSize(),  product.getRam());

        }
        System.out.println("--------------------------------------------------------------------------------------------\n");
       
    }
    public void listByNotebookId(int id) {
        String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s |%n";
        String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s |%n";

        System.out.println("--------------------------------------------------------------------------------------------\n");
        System.out.format(headers, "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "RAM");
        System.out.println("--------------------------------------------------------------------------------------------\n");

        for (NotebookProcess product : noteBookList) {
            if (product.getId() == id)
            {
            System.out.format(leftAlignFormat, product.getId(), product.getProductName(), product.getPrice(), product.getBrand(),
                    product.getMemory(), product.getScreenSize(),  product.getRam());
                break;
            }

        }
    }

    public void listByNotebookBrand(String brandN)
    {
        String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s |%n";
        String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s |%n";

        System.out.println("--------------------------------------------------------------------------------------------\n");
        System.out.format(headers, "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "RAM");
        System.out.println("--------------------------------------------------------------------------------------------\n");


        Iterator<NotebookProcess> iterator = noteBookList.iterator();
        while(iterator.hasNext())
        {
            NotebookProcess n = iterator.next();
            String b = n.getBrand();
            if (b.equalsIgnoreCase(brandN))
            {
                System.out.format(leftAlignFormat, n.getId(), n.getProductName(), n.getPrice(), n.getBrand(),
                        n.getMemory(), n.getScreenSize(),  n.getRam());
            }
        }

    }

    public void addNotebook(NotebookProcess n)
    {
        this.noteBookList.add(n);
    }

    public void deleteNotebook(int id)
    {
        Iterator<NotebookProcess> iterator = noteBookList.iterator();
        while(iterator.hasNext())
        {
            NotebookProcess value = iterator.next();
            if (value.getId() == id)
            {
                iterator.remove();
                break;
            }
        }
    }

    //Phone

    public void Phone(){
        PhoneProcess mpSamsung = new PhoneProcess(1,"Samsung Galaxy A51  ","Telefon",5,
                "Samsung",3199,0.5,12,128,4000,"Siyah",6.5);
        PhoneProcess mpApple =new PhoneProcess(2,"İphone 11 64GB      ","Telefon",5,
                "Apple  ",7379,0.5,12,128,3046,"Mavi",6.1);
        PhoneProcess mpXiaomi =new PhoneProcess(3,"Redmi Note10 Pro 8GB","Telefon",5,
                "Xiaomi ",4012,0.5,16,128,4000,"Beyaz",6.5);


        phoneList.add(mpSamsung);
        phoneList.add(mpApple);
        phoneList.add(mpXiaomi);
        listPhone(phoneList);
    }
    private void listPhone(ArrayList<PhoneProcess> phoneList){
        String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s | %-5d |%n";
        String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s | %-9s | %-5s |%n";
        System.out.println("------------------------------------------------------------------------------------------------------\n");
        System.out.format(headers, "ID","Ürün Adı", "Fiyat",  "Marka", "Depolama", "Ekran","Renk", "Pil","RAM" );
        System.out.println("------------------------------------------------------------------------------------------------------\n");
        for (PhoneProcess product : phoneList){
            System.out.format(leftAlignFormat, product.getId(), product.getProductName(), product.getPrice(), product.getBrand(), product.getMemory(), product.getScreenSize(),
                     product.getColor(),product.getBatteryPower(),product.getRam());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
    public void listByPhoneId(int id) {
        String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s |%n";
        String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s |%n";

        System.out.println("--------------------------------------------------------------------------------------------\n");
        System.out.format(headers, "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "RAM");
        System.out.println("--------------------------------------------------------------------------------------------\n");

        for (PhoneProcess product : phoneList) {
            if (product.getId() == id)
            {
                System.out.format(leftAlignFormat, product.getId(), product.getProductName(), product.getPrice(), product.getBrand(),
                        product.getMemory(), product.getScreenSize(),  product.getRam());
                break;
            }

        }
    }

    public void listByPhoneBrand(String brandP)
    {
        String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s |%n";
        String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s |%n";

        System.out.println("--------------------------------------------------------------------------------------------\n");
        System.out.format(headers, "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "RAM");
        System.out.println("--------------------------------------------------------------------------------------------\n");


        Iterator<PhoneProcess> iterator = phoneList.iterator();
        while(iterator.hasNext())
        {
            PhoneProcess n = iterator.next();
            String b = n.getBrand();
            if (b.equalsIgnoreCase(brandP))
            {
                System.out.format(leftAlignFormat, n.getId(), n.getProductName(), n.getPrice(), n.getBrand(),
                        n.getMemory(), n.getScreenSize(),  n.getRam());
            }
        }

    }

    public void addPhone(PhoneProcess n)
    {
        this.phoneList.add(n);
    }

    public void deletePhone(int id)
    {
        Iterator<PhoneProcess> iterator = phoneList.iterator();
        while(iterator.hasNext())
        {
            PhoneProcess value = iterator.next();
            if (value.getId() == id)
            {
                iterator.remove();
                break;
            }
        }
    }
}
