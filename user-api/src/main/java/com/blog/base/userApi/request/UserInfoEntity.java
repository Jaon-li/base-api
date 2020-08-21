package com.blog.base.userApi.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoEntity {
    private String token;
    private String email;
    private String name;
    private String age;
    private String sex;
    private String addr;
    private String pic;
}
