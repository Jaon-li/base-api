package com.blog.base.emailApi.api;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.blog.base.emailApi.config.Config;
import com.blog.base.emailApi.req.EmailContentEntity;
import com.blog.base.response.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = Config.SERVER_NAME, path = "/api/email")
public interface EmailApi {

    @PostMapping("/send")
    BaseResponse<Boolean> send(@RequestBody EmailContentEntity emailContentEntity);

    @PostMapping("/cancel")
    BaseResponse<Boolean> cancel(Integer id);

    @PostMapping("/query")
    BaseResponse<Boolean> query(Integer id);


}
