package com.soecode.m.service.impl;

import com.soecode.m.BaseTest;
import com.soecode.m.dto.AppointExecution;
import com.soecode.m.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Zed on 2017/12/12.
 */
public class BookServiceImplTest extends BaseTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() throws Exception {
        long bookId = 1001L;
        long studentId = 12345678910L;
        AppointExecution execution = bookService.appoint(bookId, studentId);
        System.out.println(execution);
    }

}
