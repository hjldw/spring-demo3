package com.java.dao.impl;

import com.java.dao.BookDao;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ShuDaoImpl implements BookDao {

    @Override
    public List<String> getBookName2List(){
        List<String> bookNameList = Arrays.asList("yiyiyi","ijijij");
        return bookNameList;
    }










}
