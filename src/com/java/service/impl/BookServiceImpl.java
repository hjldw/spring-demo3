package com.java.service.impl;

import com.java.dao.BookDao;
import com.java.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    //@Resource(name="s")
    private BookDao bookDao;
    /*
     * 查询所有书名
     * */

    @Override
    public List<String> findBookName2List(){

        return bookDao.getBookName2List();
    }










}
