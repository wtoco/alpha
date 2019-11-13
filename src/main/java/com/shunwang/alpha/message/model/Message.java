package com.shunwang.alpha.message.model;

import com.shunwang.alpha.message.Handler;

public class Message {

    private int code;
    private String msg;
    Handler target;

    public Message() {

    }

    public Message(int code, String msg, Handler handler) {
        this.code = code;
        this.msg = msg;
        this.target = handler;
    }

    public  int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
