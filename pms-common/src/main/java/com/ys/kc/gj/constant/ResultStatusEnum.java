package com.ys.kc.gj.constant;

public enum ResultStatusEnum {
    UNKNOWN(10001, "服务异常，请稍后重试"),
    NOT_FOUND(10002, "未找到相应资源"),
    UNAUTHORIZED(10003, "登录信息过期"),
    FORBIDDEN(10004, "无权限访问"),
    BUSINESS(10005, "业务异常"),

    // 请求异常
    REQUEST_ERROR(11000, "请求无效"),
    REQUEST_INVALID_CONTENT(11001, "请求内容无效"),
    TOKEN_MISS(11002, "token 缺失"),
    TOKEN_INVALID(11003, "token 无效"),
    TOKEN_EXPIRE(11004, "token 过期"),

    MAX_UPLOAD_SIZE(11005, "上传文件大小超过限制"),

    INSERT_FAIL(12001, "数据保存失败，请稍后重试"),
    UPDATE_FAIL(12002, "数据更新失败，请稍后重试"),

    SUCCESS(200, "success");

    /**
     * 状态码
     */
    private final int code;
    /**
     * 消息
     */
    private final String message;

    ResultStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
