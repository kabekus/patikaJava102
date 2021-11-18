package com.company;
import java.util.Scanner;

public class PatikaStore {
    Scanner input = new Scanner(System.in);

    public void start(){
        ProductOperationPanel operationPanel = new ProductOperationPanel();
        Brands brands = new Brands();

        System.out.println("PatikaStore Ürün Yönetim Paneli !\n");
        boolean isExit = true;
        while (isExit){
            System.out.println("0- Çıkış Yap\n" +
                               "1- Marka Listele\n" +
                               "2-Notebook İşlemleri\n" +
                               "3-Cep Telefonu İşlemleri");
            System.out.print("Tercihinizi girin :");
            int select=input.nextInt();
            switch (select){
                case 0:
                    System.out.println("Çıkış Yaptınız!");
                    isExit=false;
                    break;
                case 1:
                    System.out.println("\nMarkalarımız:\n----------");

                    brands.getBrandsName();
                    break;
                case 2:
                    System.out.println("Notebook Operations!\n"
                            + "1 - Notebook Listele\n"
                            + "2 - Notebook Ekle\n"
                            + "3 - Id ile Notebook Listele\n"
                            + "4 - Marka ile Notebook Listele\n"
                            + "5 - Id ile Notebook Sil\n"
                            + "0 - Çıkış\n");
                    System.out.println("Tercihiniz: ");
                    int select1 = input.nextInt();
                    if(select1 == 1)
                    {
                        operationPanel.Notebook();
                    }
                    else if(select1 == 2)
                    {
                      
                        System.out.println("Ürün Id: ");
                        int addId = input.nextInt();

                        System.out.println("Ürün Adı: ");
                        String addProductName = input.next();
                        System.out.println("Ürün Fiyat: ");
                        int addPrice =input.nextInt();
                        System.out.println("Ürün Kategori: ");
                        String addCategory = input.next();
                        System.out.println("Ürün Ram: ");
                        int addRam = input.nextInt();
                        System.out.println("Marka: ");
                        String addBrand = input.next();
                        System.out.println("Ürün Stok: ");
                        int addStock= input.nextInt();
                        System.out.println("Ürün İndirim Oranı: ");
                        double addDiscountRate = input.nextDouble();
                        System.out.println("Ürün Depolama: ");
                        int addMemory = input.nextInt();
                        System.out.println("Ürün Ekran: ");
                        double addScreenSize = input.nextDouble();
                        operationPanel.add(new NotebookProcess(addId,addProductName,addCategory,addStock,addBrand,addPrice,addDiscountRate,addRam,addMemory,addScreenSize));
                    }
                    else if(select1 == 3)
                    {
                        System.out.println("Id Girin: ");
                        int id = input.nextInt();
                        operationPanel.listById(id);
                    }
                    else if(select1 == 4)
                    {
                        System.out.println("Marka Adı Girin: ");
                        String brand = input.next();
                        operationPanel.listByBrand(brand);
                    }
                    else if(select1 == 5)
                    {
                        System.out.println("Id Girin: ");
                        int id = input.nextInt();
                        operationPanel.delete(id);
                    }
                    else if(select1 == 0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Yanlış değer girdiniz!");
                    }
                    break;
                case 3:
                    System.out.println("\nCep Telefonu İşlemleri:\n1- Ürünleri Listele | 2- Ürün Ekle");
                    int select2=input.nextInt();
                    if (select2==1){

                    }else if (select2==2){

                    }
                    break;
                default:
                    System.out.println("Lütfen Geçerli Bir Değer Giriniz!");
            }
        }
    }

}
