package com.blog.base.userApi.api;

import com.blog.base.userApi.config.Config;
import com.blog.base.userApi.request.LoginEntity;
import com.blog.base.userApi.request.RegisterEntity;
import com.blog.base.userApi.request.RestPwdEntity;
import com.blog.base.userApi.request.UserInfoEntity;
import com.blog.base.userApi.response.BaseResponse;
import com.blog.base.userApi.response.UserInfo;
import feign.Param;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = Config.SERVER_NAME)
@Controller("/api/user/")
public interface UserApi {

    @PostMapping("/register")
    BaseResponse<UserInfo> register(@RequestBody RegisterEntity registerEntity);

    @PostMapping("/imgCode")
    BaseResponse<String> imgCode(@Param("code") String code);

    @PostMapping("/emailCode")
    BaseResponse<String> emailCode(@Param("email") String email);

    @PostMapping("/login")
    BaseResponse<UserInfo> login(@RequestBody LoginEntity loginEntity);

    @PostMapping("/getUserInfo")
    BaseResponse<UserInfo> getUserInfo(@Param("token") String token);

    @PostMapping("/updateUserInfo")
    BaseResponse<Boolean> updateUserInfo(@RequestBody UserInfoEntity userInfoEntity);

    @PostMapping("/resetPwd")
    BaseResponse<Boolean> resetPwd(@RequestBody RestPwdEntity pwdEntity);

    @PostMapping("/Logout")
    BaseResponse<Boolean> Logout(@Param("token") String token);

    @PostMapping("/DestroyUser")
    BaseResponse<Boolean> DestroyUser(@Param("token") String token);

}
