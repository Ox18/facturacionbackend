package com.jycleadingcorp.facturacionbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@MapperScan("com.jycleadingcorp.facturacionbackend.mappers")
@SpringBootApplication
@CrossOrigin
public class FacturacionbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturacionbackendApplication.class, args);
	}

}
