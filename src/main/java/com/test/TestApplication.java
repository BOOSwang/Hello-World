package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		System.out.println("开始上传");
		SpringApplication.run(TestApplication.class, args);
	}

	public static void msg(){
		System.out.println("上传git");
	}
}
