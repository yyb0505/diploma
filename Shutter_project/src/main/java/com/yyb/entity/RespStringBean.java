package com.yyb.entity;

import java.util.List;

//数据表格返回对象
public class RespStringBean {

    public static final int SUCCESS = 0;
    public static final int ERROR = -1;

    private int code;
    private String msg;
    private String data;

    public RespStringBean(int code, String msg,  String data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public RespStringBean() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
