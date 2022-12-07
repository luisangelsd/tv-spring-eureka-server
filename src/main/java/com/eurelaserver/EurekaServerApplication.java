package com.eurelaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer 
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}


/* Configuración:
 * - Es servidor Eureka
 * - Esta registrado como Cliente Eureka - Desde el properties
 * - Es cliente de Spring Cloud Config Server
 */