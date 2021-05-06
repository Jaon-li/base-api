package com.blog.base.emailApi.api;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.blog.base.emailApi.config.Config;
import com.blog.base.emailApi.req.EmailContentEntity;
import com.blog.base.response.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(value = Config.SERVER_NAME)
@RestController("/api/email/")
public interface EmailApi {

    @PostMapping("/send")
    @SentinelResource("send")
    BaseResponse<Boolean> send(@RequestBody EmailContentEntity emailContentEntity);

    @PostMapping("/cancel")
    @SentinelResource("cancel")
    BaseResponse<Boolean> cancel(Integer id);

    @PostMapping("/query")
    @SentinelResource("query")
    BaseResponse<Boolean> query(Integer id);


}
