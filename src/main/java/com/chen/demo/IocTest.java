package com.chen.demo;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chen.demo.config.AppConfig;
import com.chen.demo.pojo.BussinessPersion;
import com.chen.demo.pojo.Famer;
import com.chen.demo.pojo.User;
import com.chen.demo.pojo.Worker;
import com.chen.demo.pojo.definition.Persion;


public class IocTest {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Persion bussinessPersion = ctx.getBean(BussinessPersion.class);
		bussinessPersion.service();
		
		Persion farmer = ctx.getBean(Famer.class);
		farmer.service();
		
		Persion worker = ctx.getBean(Worker.class);
		worker.service();
		
		
		
		
		User user = ctx.getBean(User.class);
		System.out.println(user.getId());
		System.out.println(user.getNote());
		
		
//		CREATE TABLE `user` (
//		  `id` bigint(20) NOT NULL AUTO_INCREMENT,
//		  `name` varchar(20) DEFAULT NULL,
//		  `note` varchar(100) DEFAULT NULL,
//		  PRIMARY KEY (`id`)
//		) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8
		
		
		DataSource ds = ctx.getBean(DataSource.class);
		Connection conn = null;
		try {
			conn = ds.getConnection();
			
			Statement st = conn.createStatement();
			
			String sql = "select * from user";
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				Long id = rs.getLong(1);
				String name = rs.getString(2);
				String note = rs.getString(3);
				
				System.out.println(id+name+note);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null)
				{
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
	}

}
