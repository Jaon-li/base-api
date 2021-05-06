package com.blog.base.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> {
    private Integer code;
    private String msg;
    private T data;
    private Long timestamp;

    public BaseResponse(Integer code, String msg, Long timestamp) {
        this.code = code;
        this.msg = msg;
        this.timestamp = timestamp;
    }


    public BaseResponse(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public static <D> BaseResponse<D> ok(D object) {
        return new BaseResponse<D>(BaseResponseCode.SUCCESS.code, BaseResponseCode.SUCCESS.msg, object, System.currentTimeMillis());
    }

    public static BaseResponse err(String msg) {
        return new BaseResponse(BaseResponseCode.ERROR.getCode(), BaseResponseCode.ERROR.msg, System.currentTimeMillis());
    }

    @AllArgsConstructor
    @Getter
    public enum BaseResponseCode {
        SUCCESS(200, "SUCCESS"),
        FAIL(2001, "FAIL"),
        ERROR(2002, "ERROR"),
        PARAM_MISS(2003, "PARAM MISS"),
        SIGN_ERROR(2004, "SIGN_ERROR"),
        SYSTEM_ERROR(9999, "SYSTEM ERROE");
        private Integer code;
        private String msg;

    }


}
