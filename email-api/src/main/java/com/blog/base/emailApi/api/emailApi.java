package com.blog.base.emailApi.api;

import com.blog.base.userApi.config.Config;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = Config.SERVER_NAME)
@Controller("/api/user/")
public interface emailApi {

    @PostMapping("/register")
    public boolean register();

    @PostMapping("/imgCode")
    public boolean imgCode();

    @PostMapping("/emailCode")
    public boolean emailCode();

    @PostMapping("/login")
    public boolean login();

    @PostMapping("/getUserInfo")
    public boolean getUserInfo();

    @PostMapping("/updateUserInfo")
    public boolean updateUserInfo();

    @PostMapping("/resetPwd")
    public boolean resetPwd();

    @PostMapping("/Logout")
    public boolean Logout();

    @PostMapping("/DestroyUser")
    public boolean DestroyUser();

}
