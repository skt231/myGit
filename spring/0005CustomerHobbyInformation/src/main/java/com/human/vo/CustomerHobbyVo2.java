package com.human.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CustomerHobbyVo2 {
	private int id;
	private String name;
	private double height;
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private Date birthday;
	
	String hobby;

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public CustomerHobbyVo2() {
		
	}

	@Override
	public String toString() {
		return "CustomerVo [id=" + id + ", name=" + name + ", height=" + height + ", birthday=" + birthday + ", hobbys="
				+ hobby + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
