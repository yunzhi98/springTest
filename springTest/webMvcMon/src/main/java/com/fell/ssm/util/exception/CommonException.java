package com.fell.ssm.util.exception;

/**
 * Created by wb-xuzhenbin on 2016/9/9.
 */
public class CommonException extends RuntimeException {

    /** 错误代码 */
    private String            errorCode;

    /**  */
    private static final long serialVersionUID = 1L;

    public CommonException(String msg) {
        super(msg);
    }

    public CommonException(String msg, String errorCode) {
        super(msg);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

}