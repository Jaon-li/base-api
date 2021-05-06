package com.blog.base.exception;


import com.blog.base.response.BaseResponse;
import lombok.Data;

@Data
public class BlogException extends Exception {

    private Integer code;
    private String msg;

    public BlogException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BlogException(BaseResponse.BaseResponseCode baseResponseCode) {
        this.code = baseResponseCode.getCode();
        this.msg = baseResponseCode.getMsg();
    }


}
