package com.pigschool.xyzshow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(basePackages = "com.pigschool.xyzshow.mapper")
@EnableAutoConfiguration
@SpringBootApplication
public class XyzShowApplication {

	public static void main(String[] args) {
		SpringApplication.run(XyzShowApplication.class, args);
	}

}
