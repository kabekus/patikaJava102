package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Tutunamayanlar","Oğuz Atay",671));
        books.add(new Book("Şeker Portakalı","Jose Maura",200));
        books.add(new Book("Küçük Prens","Antoine",96));
        books.add(new Book("Araba Sevdası","Recaizade Mahmut Ekrem",224));
        books.add(new Book("Kürk Mantolu Madonna","Sabahattin Ali",160));

        Map<String,String> stringStringMap = new HashMap<>();
        books.stream().forEach(book -> stringStringMap.put(book.getBookName(),book.getWriter()));
        System.out.println(stringStringMap);

        System.out.println("******************");
        List<Book> shortBooksList = new ArrayList<>();
        books.stream().filter(book -> book.getPage() > 100).forEach(a -> shortBooksList.add(a));
        System.out.println(shortBooksList);
    }
}
