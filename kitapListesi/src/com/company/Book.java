package com.company;

public class Book {
    private String bookName,writer;
    private int page;

    public Book(String bookName, String writer, int page) {
        this.bookName = bookName;
        this.writer = writer;
        this.page = page;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Kitap Adı: "+bookName +" - Sayfa Sayısı: "+page+" - Yazar: "+writer);
        return sb.toString();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
