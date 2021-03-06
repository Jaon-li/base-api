package com.blog.base.userApi.api;

import com.blog.base.response.BaseResponse;
import com.blog.base.userApi.config.Config;
import com.blog.base.userApi.request.LoginEntity;
import com.blog.base.userApi.request.RegisterEntity;
import com.blog.base.userApi.request.RestPwdEntity;
import com.blog.base.userApi.request.UserInfoEntity;
import com.blog.base.userApi.response.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = Config.SERVER_NAME ,path = "/api/user")
public interface UserApi {

    @PostMapping("/register")
    BaseResponse<UserInfo> register(@RequestBody RegisterEntity registerEntity);

    @PostMapping("/imgCode")
    BaseResponse<String> imgCode(@RequestParam("code") String code);

    @PostMapping("/emailCode")
    BaseResponse<String> emailCode(@RequestParam("email") String email);

    @PostMapping("/login")
    BaseResponse<UserInfo> login(@RequestBody LoginEntity loginEntity);

    @PostMapping("/getUserInfo")
    BaseResponse<UserInfo> getUserInfo(@RequestHeader("token") String token);

    @PostMapping("/updateUserInfo")
    BaseResponse<Boolean> updateUserInfo(@RequestBody UserInfoEntity userInfoEntity);

    @PostMapping("/resetPwd")
    BaseResponse<Boolean> resetPwd(@RequestBody RestPwdEntity pwdEntity);

    @PostMapping("/Logout")
    BaseResponse<Boolean> Logout(@RequestHeader("token") String token);

    @PostMapping("/DestroyUser")
    BaseResponse<Boolean> DestroyUser(@RequestHeader("token") String token);

}
