package org.example.javawebtushuguan.entity;

public class Book {
    private int bookId;
    private String bookName;
    private String bookPlace;
    private String bookState;

    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPlace() {
        return bookPlace;
    }

    public void setBookPlace(String bookPlace) {
        this.bookPlace = bookPlace;
    }

    public String getBookState() {
        return bookState;
    }

    public void setBookState(String bookState) {
        this.bookState = bookState;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPlace='" + bookPlace + '\'' +
                ", bookState='" + bookState + '\'' +
                '}';
    }
}
