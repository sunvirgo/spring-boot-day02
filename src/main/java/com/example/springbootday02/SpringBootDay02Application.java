package com.example.springbootday02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
/**
 * 方法说明:
 *  Spring boot 2.2.0 新增一个 @ConfigurationPropertiesScan 的注解，默认是开启的扫描 main 启动类所在的包路径的所有
 *  ConfigurationProperties, 所以可以不用再加 @Component 或者 @Configuration ;
 *  Spring boot 2.2.1 默认关闭此功能，需要显式指定此注解，实际在使用过程中 你会发现 @Profile
 *  和这个注解的兼容问题, @ConfigurationPropertiesScan not compatible with @Profile @ConfigurationProperties，
 *  所以 Spring Boot 2.2.1 默认关闭了这个功能,如果需要开启，在启动类上加@ConfigurationPropertiesScan即可；
 * @Author: 黄刚
 * @Date: 2020/4/18 19:47
 * @Param:
 * @Return:
 */
@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringBootDay02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDay02Application.class, args);
    }

}
