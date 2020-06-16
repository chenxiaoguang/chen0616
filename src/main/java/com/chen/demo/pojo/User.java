package com.chen.demo.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User implements Serializable{

	private static final long serialVersionUID = 2468276040472238111L;
	@Value("1")
	private Long id;
	@Value("user_name_1")
	private String name;
	@Value("note_1")
	private String note;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
