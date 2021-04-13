package com.spzhu.entity;

public enum ResponseCode {
    /**
     * 状态码仿照 HTTP 应答码
     */
    SUCCESS("00000", "success"),
    BAD_REQUEST("40000", "request parameters illegal"),
    BAD_DATA("40001", "illegal data");
    /**
     * 状态码
     */
    private String code;
    /**
     * 返回信息
     */
    private String msg;

    ResponseCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
