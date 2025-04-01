package com.nianheguodehaizhe.framework.common.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BizException extends RuntimeException{
    //异常码
    private String errorCode;
    //异常信息
    private String errorMessage;

    public BizException(BaseExceptionInterface baseException) {
        this.errorCode = baseException.getErrorCode();
        this.errorMessage = baseException.getErrorMessage();
    }
}
