package com.chen.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class AppConfig {

	/*
	 * @Bean(name="user") public User initUser() { User user = new User();
	 * user.setId(1L); user.setName("chen"); user.setNote("note"); return user; }
	 */
}
