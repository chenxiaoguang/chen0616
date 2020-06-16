package com.chen.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.chen.demo.pojo.User;


@Configuration
//@ComponentScan(basePackageClasses = {User.class})
//@ComponentScan("com.chen.demo.*")
@ComponentScan("com.chen.demo.pojo")
public class AppConfig {

	/*
	 * @Bean(name="user") public User initUser() { User user = new User();
	 * user.setId(1L); user.setName("chen"); user.setNote("note"); return user; }
	 */
}
