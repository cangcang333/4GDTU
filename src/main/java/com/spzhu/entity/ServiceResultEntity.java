package com.spzhu.entity;

import java.io.Serializable;

public class ServiceResultEntity<T> implements Serializable {
    private boolean success;

    private ResponseCode responseCode;

    private T result;

    private String resultMsg;

    private ServiceResultEntity(boolean success, ResponseCode responseCode, T result) {
        this.success = success;
        this.responseCode = responseCode;
        this.result = result;
    }

    private ServiceResultEntity(boolean success, ResponseCode responseCode, T result, String resultMsg) {
        this.success = success;
        this.responseCode = responseCode;
        this.result = result;
        this.resultMsg = resultMsg;
    }

    public static ServiceResultEntity ofSuccess(Object result) {
        return new ServiceResultEntity(true, ResponseCode.SUCCESS, result);
    }

    public static ServiceResultEntity ofFail(ResponseCode responseCode, String resultMsg) {
        return new ServiceResultEntity(false, responseCode, null, resultMsg);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
