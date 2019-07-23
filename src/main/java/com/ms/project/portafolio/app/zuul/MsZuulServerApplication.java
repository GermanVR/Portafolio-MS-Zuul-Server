package com.ms.project.portafolio.app.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author German Vazquez Renteria
 * Date:  19 jul. 2019
 * Package Name: com.ms.project.portafolio.app.zuul
 * Project Name: ms-zuul-server
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class MsZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsZuulServerApplication.class, args);
	}

}
