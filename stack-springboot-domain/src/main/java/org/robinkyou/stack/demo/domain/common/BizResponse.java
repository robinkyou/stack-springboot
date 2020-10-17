package org.robinkyou.stack.demo.domain.common;

import org.robinkyou.stack.demo.domain.enums.ResultCodeEnum;

public class BizResponse<T> {
    private String resultCode;
    private String resultMessage;
    private T data;

    public BizResponse() {
    }

    public static <T> BizResponse<T> buildSuccessResult(T data) {
        BizResponse<T> bizResponse = new BizResponse<>();
        bizResponse.setData(data);
        bizResponse.setResultCode(ResultCodeEnum.SUCCESS.getResultCode());
        bizResponse.setResultMessage(ResultCodeEnum.SUCCESS.getResultMessage());
        return bizResponse;
    }

    public static <T> BizResponse<T> buildFailResult(T data) {
        BizResponse<T> bizResponse = new BizResponse<>();
        bizResponse.setData(data);
        bizResponse.setResultCode(ResultCodeEnum.FAIL.getResultCode());
        bizResponse.setResultMessage(ResultCodeEnum.FAIL.getResultMessage());
        return bizResponse;
    }

    public static <T> BizResponse<T> buildResult(T data, ResultCodeEnum resultCodeEnum) {
        BizResponse<T> bizResponse = new BizResponse<>();
        bizResponse.setData(data);
        bizResponse.setResultCode(resultCodeEnum.getResultCode());
        bizResponse.setResultMessage(resultCodeEnum.getResultMessage());
        return bizResponse;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
