package com.blog.base.emailApi.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(Config.API_BASE_PACKAGE)
public class Config {
    public static final String SERVER_NAME = "email-service";
    public static final String API_BASE_PACKAGE = "com.blog.base.emailApi";

}
