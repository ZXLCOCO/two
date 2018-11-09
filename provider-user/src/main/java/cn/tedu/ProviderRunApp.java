package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderRunApp {
	//provider one
	public static void main(String[] args) {
		SpringApplication.run(ProviderRunApp.class, args);
	}
}
