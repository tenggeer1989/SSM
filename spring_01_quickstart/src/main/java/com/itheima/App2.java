package com.itheima;

import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: App2
 * Package: com.tge
 * Description:
 *
 * @Author: tge
 * @Create: 2023/10/20 - 23:27
 * Version:
 */
public class App2 {
    public static void main(String[] args) {
        //获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        // BookDao bookDao = (BookDao)ctx.getBean("bookDao");
        // bookDao.save();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save(); 
    }
}
