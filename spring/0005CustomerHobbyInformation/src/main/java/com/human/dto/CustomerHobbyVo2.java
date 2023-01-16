package com.human.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CustomerHobbyVo2 {
	private int id;
	private String name;
	public CustomerHobbyVo2(int id, String name, double height, Date birthday, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.birthday = birthday;
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "CustomerHobbyVo2 [id=" + id + ", name=" + name + ", height=" + height + ", birthday=" + birthday
				+ ", hobby=" + hobby + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hobby == null) ? 0 : hobby.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerHobbyVo2 other = (CustomerHobbyVo2) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (hobby == null) {
			if (other.hobby != null)
				return false;
		} else if (!hobby.equals(other.hobby))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	private double height;
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private Date birthday;
	
	String hobby;
}
