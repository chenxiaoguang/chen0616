package com.chen.demo.config;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chen.demo.pojo.User;


public class IocTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = ctx.getBean(User.class);
		
		System.out.println(user.getId());
		System.out.println(user.getNote());

	}

}
