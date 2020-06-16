package com.chen.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chen.demo.config.AppConfig;
import com.chen.demo.pojo.User;


public class IocTest {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = ctx.getBean(User.class);
		
		
		System.out.println(user.getId());
		System.out.println(user.getNote());

	}

}
