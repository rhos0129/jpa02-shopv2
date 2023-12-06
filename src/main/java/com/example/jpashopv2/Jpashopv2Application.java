package com.example.jpashopv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jpashopv2Application {

	public static void main(String[] args) {

		// lombok 적용 확인
		Hello hello = new Hello();
		hello.setData("hello");
		String data = hello.getData();
		System.out.println("data = " + data);

		SpringApplication.run(Jpashopv2Application.class, args);
	}

}
