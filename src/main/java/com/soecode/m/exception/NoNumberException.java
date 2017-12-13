package com.soecode.m.exception;

/**
 * Created by Zed on 2017/12/12.
 */

//无库存异常
public class NoNumberException extends RuntimeException {

    public NoNumberException(String message){
        super(message);
    }

    public NoNumberException(String message, Throwable cause){
        super(message, cause);
    }

}
