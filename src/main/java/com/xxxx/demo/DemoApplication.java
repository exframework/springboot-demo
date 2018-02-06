package com.xxxx.demo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		/* 修改默认配置文件
		Properties defaultProperties = new Properties();
		InputStream in = DemoApplication.class.getClassLoader().getResourceAsStream("application.properties");
		defaultProperties.load(in);
		SpringApplication demo = new SpringApplication(DemoApplication.class);
		demo.setDefaultProperties(defaultProperties);
		demo.run(args);
		*/
		SpringApplication.run(DemoApplication.class, args);
	}
}
