package com.soecode.m.entity;

import java.util.Date;

/**
 * Created by Zed on 2017/12/12.
 */
public class Appointment {

    private long bookId;
    private long studentId;
    private Date appointTime;

    //多对一的复合属性
    private Book book;

    public Appointment() {
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointTime=" + appointTime +
                ", bookId=" + bookId +
                ", studentId=" + studentId +
                ", book=" + book +
                '}';
    }

}
