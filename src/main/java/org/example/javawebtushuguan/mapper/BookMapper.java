package org.example.javawebtushuguan.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.javawebtushuguan.entity.Book;

import java.util.List;

@Mapper
public interface BookMapper {
    //查询所有
    public List<Book> selectAll();
    //查询指定图书信息
    public Book selectById(int id);
    //借阅图书
    public void borrowBook(int id);
    //归还图书
    public void returnBook(int id);
}
