package org.robinkyou.stack.demo.domain.enums;

public enum ResultCodeEnum {
    SUCCESS("0000","成功"),
    FAIL("0001","失败"),
    EXCEPTION("9999","未知异常");

    ResultCodeEnum(String resultCode, String resultMessage) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }

    private String resultCode;
    private String resultMessage;

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
}
