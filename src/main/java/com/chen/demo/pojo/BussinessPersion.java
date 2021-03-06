package com.chen.demo.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.chen.demo.pojo.definition.Animal;
import com.chen.demo.pojo.definition.Persion;


@Component
public class BussinessPersion implements Persion, Serializable {

	private static final long serialVersionUID = 42981893816715783L;
	
	
	private Animal animal;
	
	@Override
	public void service() {
		this.animal.use();
	}

	@Override
	@Autowired
	@Qualifier("dog")
	public void setAnimal(Animal animal) {
		System.out.println("延迟依赖注入");
		this.animal = animal;
	}
	
	
	/*
	 * @Autowired private Animal dog;
	 * 
	 * 
	 * @Override public void service() { this.dog.use(); }
	 * 
	 * @Override public void setAnimal(Animal animal) { this.dog = animal; }
	 */

}
