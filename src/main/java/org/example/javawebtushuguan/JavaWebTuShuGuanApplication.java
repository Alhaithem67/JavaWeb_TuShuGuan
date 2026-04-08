package org.example.javawebtushuguan;

import org.apache.ibatis.annotations.Mapper;
import org.example.javawebtushuguan.controller.BookController;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

//@SpringBootApplication
//@MapperScan({"org.example.javawebtushuguan.mapper.BookMapper"})
//public class JavaWebTuShuGuanApplication {

//    public static void main(String[] args) throws IOException {
////        SpringApplication.run(JavaWebTuShuGuanApplication.class, args);
//        // 1. 启动Spring容器，并获取容器上下文对象
//        ConfigurableApplicationContext context = SpringApplication.run(JavaWebTuShuGuanApplication.class, args);
//
//        // 2. 从Spring容器中获取BookController实例（替代@Autowired）
//        BookController bookController = context.getBean(BookController.class);
//
//        // 3. 调用方法（此时容器已初始化完成，可正常调用）
//        System.out.println(bookController.getbooklist());
//    }
//
//}
@SpringBootApplication
@MapperScan("org.example.javawebtushuguan.mapper") // 只需要加这一行
public class JavaWebTuShuGuanApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaWebTuShuGuanApplication.class, args);
    }

}
