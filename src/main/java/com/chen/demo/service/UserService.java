package com.chen.demo.service;

import org.springframework.stereotype.Service;

import com.chen.demo.pojo.User;

@Service
public class UserService {

	public void printUser(User user) {
		
		System.out.println("ID:"+user.getId());
		
		System.out.println("Name:"+user.getName());
		
		System.out.println("Note:"+user.getNote());
		
	}
}
