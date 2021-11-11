package com.company;

public class Book {
    private String bookName,writerName;
    private int pageNum,releaseYear;

    public Book(String bookName,String writerName,int pageNum,int releaseYear){
        this.bookName = bookName;
        this.writerName = writerName;
        this.pageNum = pageNum;
        this.releaseYear = releaseYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
