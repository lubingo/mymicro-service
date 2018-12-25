package com.lovnx;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MySpringCloudApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(MySpringCloudApplication.class).web(true).run(args);
	}

}
