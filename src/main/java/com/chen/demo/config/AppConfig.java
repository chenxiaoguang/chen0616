package com.chen.demo.config;


import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
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
	
	@Bean(name="dataSource")
	public DataSource getDataSource()
	{
		Properties props = new Properties();
		props.setProperty("driver", "com.mysql.jdbc.Driver");
		props.setProperty("url", "jdbc:mysql://localhost:3306/chen");
		props.setProperty("username", "chen");
		props.setProperty("password", "chen");
		
		DataSource dataSource = null;
		
		try {
			dataSource = BasicDataSourceFactory.createDataSource(props);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dataSource;
	}
}
