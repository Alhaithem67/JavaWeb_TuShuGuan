package org.example.javawebtushuguan.service;

import org.example.javawebtushuguan.entity.Book;

import java.util.List;

public interface BookService {
    //查询所有图书信息
    public List<Book> getbooklist();
    //查询指定图书信息
    public Book selectById(int id);
    //借阅图书
    public int borrowBook(int id);
    //归还图书
    public int returnBook(int id);
}
