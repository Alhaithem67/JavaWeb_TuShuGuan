package org.example.javawebtushuguan.controller;

import org.example.javawebtushuguan.entity.Book;
import org.example.javawebtushuguan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
// 3. 解决跨域问题（前端和后端端口相同可省略，不同必须加）
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/book/allbooks")
    public List<Book> getbooklist() throws IOException {

//        // ✅ 手动序列化，打印到控制台
//        List bookList=bookService.getbooklist();
//        ObjectMapper objectMapper = new ObjectMapper();
//        String json = objectMapper.writeValueAsString(bookList);
//        System.out.println("序列化后的JSON：" + json); // 看控制台输出
        List bookList=bookService.getbooklist();

        return bookList;
    }

    @GetMapping("/book/selectById")
    public Book selectById(int id) throws IOException {
        System.out.println(bookService.selectById(id));
        return bookService.selectById(id);
    }

    @GetMapping("/book/borrowBook")
    public int borrowBook(int id) throws IOException {
        return bookService.borrowBook(id);
    }

    @GetMapping("/book/returnBook")
    public int returnBook(int id) throws IOException {
        return bookService.returnBook(id);
    }
}
