package com.eurelaserver;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(EurekaServerApplication.class);
	}
	
	

}

/* Notas de desarrollo:
 * - Es servidor Eureka
 * - Su configuración se encuentra en Spring Cloud Config Server
 */