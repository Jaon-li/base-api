package com.blog.base.userApi.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterEntity {
    private String email;
    private String pwd;
    private String confirmPwd;
    private String code;
    private String name;

}
