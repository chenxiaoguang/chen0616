package com.chen.demo.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.chen.demo.pojo.definition.Animal;
import com.chen.demo.pojo.definition.Persion;

@Component
public class Famer implements Persion, Serializable {

	
	private static final long serialVersionUID = 4886633673496142056L;
	
	private Animal animal;
	
	
	public Famer(@Autowired @Qualifier("dog") Animal animal)
	{
		this.animal = animal;
	}
	

	@Override
	public void service() {
		animal.use();

	}

	@Override
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
