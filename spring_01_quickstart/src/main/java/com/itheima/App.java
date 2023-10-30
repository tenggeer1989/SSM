package com.itheima;

import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceImpl;

/**
 * ClassName: App
 * Package: com.tge
 * Description:
 *
 * @Author: tge
 * @Create: 2023/10/20 - 23:13
 * Version:
 */
public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
