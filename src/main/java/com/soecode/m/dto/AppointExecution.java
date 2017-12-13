package com.soecode.m.dto;


import com.soecode.m.entity.Appointment;
import com.soecode.m.enums.AppointStateEnum;

/**
 * Created by Zed on 2017/12/12.
 */
public class AppointExecution {

    private long bookId;

    // 秒杀预约结果状态
    private int state;

    // 状态标识
    private String stateInfo;

    //预约成功对象
    private Appointment appointment;

    public AppointExecution(){}

    //预约失败的构造器
    public AppointExecution(long bookId, AppointStateEnum stateEnum){
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    //预约成功的构造器
    public AppointExecution(long bookId, AppointStateEnum stateEnum, Appointment appointment){
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.appointment = appointment;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    @Override
    public String toString() {
        return "AppointExecution{" +
                "appointment=" + appointment +
                ", bookId=" + bookId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                '}';
    }
}
