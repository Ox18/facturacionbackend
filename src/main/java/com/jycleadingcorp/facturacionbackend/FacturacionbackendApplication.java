package com.jycleadingcorp.facturacionbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.jycleadingcorp.facturacionbackend.mapper")
@SpringBootApplication
public class FacturacionbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturacionbackendApplication.class, args);
	}

}
