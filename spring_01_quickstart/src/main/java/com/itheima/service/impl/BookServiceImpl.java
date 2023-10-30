package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;

/**
 * ClassName: BookServiceImpl
 * Package: com.tge.service.impl
 * Description:
 *
 * @Author: tge
 * @Create: 2023/10/20 - 23:01
 * Version:
 */
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
    // 提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
