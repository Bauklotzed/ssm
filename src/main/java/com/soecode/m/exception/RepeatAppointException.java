package com.soecode.m.exception;

/**
 * Created by Zed on 2017/12/12.
 */

//重复预约异常
public class RepeatAppointException extends RuntimeException {

    public RepeatAppointException(String message){
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause){
        super(message, cause);
    }

}
