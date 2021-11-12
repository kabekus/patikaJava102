package com.company;

import java.util.Scanner;

public class PatikaStore {
    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("PatikaStore Ürün Yönetim Paneli !\n");

        while (true){
            System.out.println("0- Çıkış Yap\n" +
                               "1- Marka Listele\n" +
                               "2-Notebook İşlemleri\n" +
                               "3-Cep Telefonu İşlemleri ");
            System.out.println("Tercihinizi girin :");
            int select=input.nextInt();
            switch (select){
                case 0:
                    System.out.println("Çıkış Yaptınız!");
                    break;
                case 1:
                    System.out.println("Markalar Listelendi");
                    break;
                case 2:
                    System.out.println("Notebook İşlemleri");
                    break;
                case 3:
                    System.out.println("Cep Telefonu İşlemleri");
                    break;
                default:
                    System.out.println("Lütfen Geçerli Bir Değer Giriniz!");
            }
        }
    }
}
