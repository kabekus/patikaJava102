package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class PatikaStore {
    private Scanner input = new Scanner(System.in);

    public void start(){

        // NoteBook
        NotebookProcess nbHuawei = new NotebookProcess(1,"Huawei Matebook 14  ","Bilgisayar", 5,"Huawei",7000,0.50,16,250,14);
        NotebookProcess nbLenovo = new NotebookProcess(2,"LENOVO V14 IGL      ","Bilgisayar", 5,"Lenovo",3699,0.50,8,250,14);
        NotebookProcess nbAsus  = new NotebookProcess(3,"ASUS Tuf Gaming     ","Bilgisayar", 5,"Asus  ",8199,0.50,32,250,15.6);

        ArrayList<NotebookProcess> noteBookList = new ArrayList<>();
        noteBookList.add(nbHuawei);
        noteBookList.add(nbLenovo);
        noteBookList.add(nbAsus);

        //MobilePhone
        PhoneProcess mpSamsung = new PhoneProcess(1,"Samsung Galaxy A51  ","Telefon",5,
                "Samsung",3199,0.5,12,128,4000,"Siyah",6.5);
        PhoneProcess mpApple =new PhoneProcess(2,"İphone 11 64GB      ","Telefon",5,
                "Apple  ",7379,0.5,12,128,3046,"Mavi",6.1);
        PhoneProcess mpXiaomi =new PhoneProcess(3,"Redmi Note10 Pro 8GB","Telefon",5,
                "Xiaomi ",4012,0.5,16,128,4000,"Beyaz",6.5);

        ArrayList<PhoneProcess> phoneList = new ArrayList<>();
        phoneList.add(mpSamsung);
        phoneList.add(mpApple);
        phoneList.add(mpXiaomi);

        System.out.println("PatikaStore Ürün Yönetim Paneli !\n");
        boolean isExit = true;
        while (isExit){
            System.out.println("\n0- Çıkış Yap\n" +
                               "1- Marka Listele\n" +
                               "2-Notebook İşlemleri\n" +
                               "3-Cep Telefonu İşlemleri ");
            System.out.print("Tercihinizi girin :");
            int select=input.nextInt();
            switch (select){
                case 0:
                    System.out.println("Çıkış Yaptınız!");
                    isExit=false;
                    break;
                case 1:
                    System.out.println("\nMarkalarımız:\n----------");
                    Brands brands = new Brands();
                    brands.getBrandsName();
                    break;
                case 2:
                    System.out.println("\nNotebook İşlemleri: \n -------------");
                    listNoteBook(noteBookList);
                    break;
                case 3:
                    System.out.println("\nCep Telefonu İşlemleri: \n -------------");
                    listMobilePhone(phoneList);
                    break;
                default:
                    System.out.println("Lütfen Geçerli Bir Değer Giriniz!");
            }
        }
    }
    private void listNoteBook(ArrayList<NotebookProcess> noteBookList) {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("| ID |Ürün Adı             |Fiyat    |Marka      |Depolama  |Ekran  |RAM ");
        System.out.println("----------------------------------------------------------------------------");
        for (NotebookProcess product : noteBookList) {
            System.out.println("| " + product.getId() +" |"+ product.getProductName()+"  |"+product.getPrice()+"     |"+product.getBrand()+"     |"+product.getMemory()+"       |"+product.getScreenSize()+"   |"+product.getRam());

        }
        System.out.println("---------------------------------------------------------------------------");
    }

    private void listMobilePhone(ArrayList<PhoneProcess> phoneList){
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("| ID| Ürün Adı             |Fiyat    |Marka       |Depolama  |Ekran     |Pil      |RAM  |Renk   ");
        System.out.println("---------------------------------------------------------------------------------------------");
        for (PhoneProcess product : phoneList){
            System.out.println("| " + product.getId() +" |"+ product.getProductName()+"  |"+product.getPrice()+"     |"+product.getBrand()+"     |"+product.getMemory()+"       |"+product.getScreenSize()+"       |"+product.getBatteryPower()+"   |"+product.getRam()+"   |"+product.getColor());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}
