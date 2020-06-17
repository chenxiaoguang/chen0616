package com.chen.demo.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chen.demo.pojo.definition.Animal;
import com.chen.demo.pojo.definition.Persion;

@Component
public class Worker implements Persion, Serializable {

	private static final long serialVersionUID = 8624834756433879990L;
	
	@Autowired
	private Animal animal;
	
	
	@Override
	public void service() {
		animal.use();

	}

	@Override
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
