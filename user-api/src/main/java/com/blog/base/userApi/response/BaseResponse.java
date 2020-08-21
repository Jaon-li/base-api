package com.blog.base.userApi.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> {
    private static Integer code;
    private String msg;
    private T data;
    private Date date;

    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.date = new Date();
    }

    public BaseResponse(Integer code, T data) {
        this.code = code;
        this.data = data;
        this.msg = ResponseCode.SUCCESS.name();
        this.date = new Date();
    }

    public static <D> BaseResponse ok(D data) {
        return new BaseResponse(ResponseCode.SUCCESS.code, data);
    }

    public static BaseResponse fail(Integer code, String msg) {
        return new BaseResponse(code, msg);
    }

    public static Boolean fail() {
        return code.equals(ResponseCode.SUCCESS) ? true : false;
    }


    @AllArgsConstructor
    public enum ResponseCode {
        SUCCESS(200, "success"),
        FAIL(100, "error");
        private Integer code;
        private String msg;


    }
}
