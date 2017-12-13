package com.soecode.m.exception;

/**
 * Created by Zed on 2017/12/12.
 */

//预约未知错误异常
public class AppointException extends RuntimeException {

    public AppointException(String message){
        super(message);
    }

    public AppointException(String message, Throwable cause){
        super(message, cause);
    }

}
