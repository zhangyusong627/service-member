package com.zys.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 会员服务启动类发布到注册中心
 * @author ASUS
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class AppMember {

	public static void main(String[] args) {
		SpringApplication.run(AppMember.class, args);

	}

}
