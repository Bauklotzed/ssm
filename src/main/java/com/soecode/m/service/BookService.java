package com.soecode.m.service;

import com.soecode.m.dto.AppointExecution;
import com.soecode.m.entity.Book;

import java.util.List;

/**
 * Created by Zed on 2017/12/12.
 */
public interface BookService {

    Book getById(long bookId);

    List<Book> getList();

    /**
     * 预约图书
     * @param bookId
     * @param studentId
     * @return
     */
    AppointExecution appoint(long bookId, long studentId);

}
