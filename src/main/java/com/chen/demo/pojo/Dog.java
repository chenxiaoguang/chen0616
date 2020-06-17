package com.chen.demo.pojo;

import org.springframework.stereotype.Component;

import com.chen.demo.pojo.definition.Animal;


@Component
public class Dog implements Animal {

	@Override
	public void use() {
		System.out.println("Dog"+ Dog.class.getSimpleName());

	}

}
