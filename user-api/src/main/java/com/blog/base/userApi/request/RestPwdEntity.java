package com.blog.base.userApi.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestPwdEntity {
    private String token;
    private String pwd;
    private String confirmPwd;

}
