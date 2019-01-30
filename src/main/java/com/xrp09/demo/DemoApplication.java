package com.xrp09.demo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.xrp09.demo.mapper")
//扫描自定义工具包
//@ComponentScan(basePackages = {"com.xrp09.demo","org.apcome.com"})
//扫描执行异步任务的开关,调用异步方法
@EnableAsync
//开启定时任务
@EnableScheduling
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

