package com.blog.base.userApi.response;

import lombok.Data;

import java.util.Date;

@Data
public class BaseResponse<T> {
    private Integer code;
    private String msg;
    private T data;
    private Date date;

}
