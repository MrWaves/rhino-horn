package com.chinaredstar.jedi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chinaredstar.jedi.mapper")
public class RhinoHornApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhinoHornApplication.class, args);
	}
}
