package com.ys.kc.gj.exception;

import com.sun.istack.internal.NotNull;
import com.ys.kc.gj.constant.ResultStatusEnum;

public class BaseException extends RuntimeException {
    private int code;
    private String message;

    public BaseException(String message, int code) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public BaseException(String message) {
        this(ResultStatusEnum.BUSINESS, message);
    }

    public BaseException(@NotNull ResultStatusEnum error) {
        this(error.getMessage(), error.getCode());
    }

    public BaseException(@NotNull ResultStatusEnum error, String message) {
        this(message, error.getCode());
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
