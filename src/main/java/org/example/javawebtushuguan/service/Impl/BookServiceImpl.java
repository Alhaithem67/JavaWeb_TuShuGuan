package org.example.javawebtushuguan.service.Impl;

import org.example.javawebtushuguan.entity.Book;
import org.example.javawebtushuguan.mapper.BookMapper;
import org.example.javawebtushuguan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    public BookMapper bookMapper;

    //查询所有图书
    public List<Book> getbooklist() {
        List<Book> bookList=new ArrayList<>();
        bookList=bookMapper.selectAll();
        return bookList;
    }

    //查询指定图书
    public Book selectById(int id) {
        Book book=bookMapper.selectById(id);
        if(book==null){
            return null;
        }else {
            return book;
        }
    }

    //借阅图书
    public int borrowBook(int id) {
        Book book = bookMapper.selectById(id);
        String state = book.getBookState();
        System.out.println("当前图书状态：" + state); // 看控制台！！！
        if("未借出".equals(book.getBookState())){
            bookMapper.borrowBook(id);
            return 1;
        }else {
            return 0;
        }
    }

    //归还图书
    public int returnBook(int id) {
        Book book = bookMapper.selectById(id);
        // ========== 必须先判断书是否存在 ==========
        if(book == null){
            return 0; // 书不存在 → 不能借
        }
        if("已借出".equals(book.getBookState())){
            bookMapper.returnBook(id);
            return 1;
        }else {
            return 0;
        }
    }
}
