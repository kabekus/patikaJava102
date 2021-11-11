package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<Book> book = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookName().compareTo(o2.getBookName());
            }
        });

        book.add(new Book("Tutunamayanlar","Oğuz Atay",671,1971));
        book.add(new Book("Şeker Portakalı","Jose Maura",200,1999));
        book.add(new Book("Küçük Prens","Antoine",96,1943));
        book.add(new Book("Araba Sevdası","Recaizade Mahmut Ekrem",224,1898));
        book.add(new Book("Kürk Mantolu Madonna","Sabahattin Ali",160,1943));

        System.out.println("Kitap Adına Göre : \n");
        for (Book bk : book) {
            System.out.println("# "+bk.getBookName());
        }
        System.out.println();


        TreeSet<Book> page = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum()- o2.getPageNum();
            }
        });

        page.addAll(book);

        System.out.println("Sayfa Sayısına Göre : \n");
        for (Book bk : page) {
            System.out.println("* "+bk.getBookName());
        }
    }
}
