package com.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 *
 * </p>
 *
 * @author wangzhaozhou
 * @date 2019/12/30
 */

@SpringBootApplication
//当前使用eureka的server
@EnableDiscoveryClient
public class CloudConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumeApplication.class, args);
    }

}
