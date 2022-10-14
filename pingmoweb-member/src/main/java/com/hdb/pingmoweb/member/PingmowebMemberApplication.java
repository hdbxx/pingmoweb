package com.hdb.pingmoweb.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages="com.hdb.pingmoweb.member.feign")//扫描接口方法注解
@SpringBootApplication
public class PingmowebMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(PingmowebMemberApplication.class, args);
    }

}
