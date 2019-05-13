package com.microservice.base.tm;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liuhongjao
 * @date 2019/3/28 16:21
 */
@EnableEurekaClient
@SpringBootApplication
@EnableTransactionManagerServer
public class TxManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TxManagerApplication.class, args);
	}
}
