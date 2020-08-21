package com.blog.base.userApi.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(Config.API_BASE_PACKAGE)
@Import({com.blog.base.userApi.config.Config.class})
public class Config {

    public static final String SERVER_NAME = "user-server";
    public static final String API_BASE_PACKAGE = "com.blog.base.userApi";

}
