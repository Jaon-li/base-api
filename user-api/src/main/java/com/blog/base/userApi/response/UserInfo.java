package com.blog.base.userApi.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private String token;
    private String email;
    private String name;
    private String age;
    private String sex;
    private String addr;
    private String pic;
}
