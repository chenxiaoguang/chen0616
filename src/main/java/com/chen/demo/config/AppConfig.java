package com.chen.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.chen.demo.pojo.User;


@Configuration
//@ComponentScan(basePackageClasses = {User.class})
//@ComponentScan(basePackages="com.chen.demo.*")
@ComponentScan(basePackages="com.chen.demo",excludeFilters = {@Filter(classes= {Service.class})})
//@ComponentScan("com.chen.demo.pojo")
public class AppConfig {

	/*
	 * @Bean(name="user") public User initUser() { User user = new User();
	 * user.setId(1L); user.setName("chen"); user.setNote("note"); return user; }
	 */
}
