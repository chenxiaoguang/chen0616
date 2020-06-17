package com.chen.demo.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.chen.demo.pojo.definition.Animal;


@Component
@Primary
public class Cat implements Animal {

	@Override
	public void use() {
		System.out.println("Cat"+ Cat.class.getSimpleName());
	}

}
