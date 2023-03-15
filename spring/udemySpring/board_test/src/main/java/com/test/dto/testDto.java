package com.test.dto;

public class testDto {
	private String name;
	private String sex;
	private int phone;
	private String registeration;
	private String statement;
	
	public testDto(){}; 
	@Override
	public String toString() {
		return "ITestDto [name=" + name + ", sex=" + sex + ", phone=" + phone + ", registeration=" + registeration
				+ ", statement=" + statement + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + phone;
		result = prime * result + ((registeration == null) ? 0 : registeration.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((statement == null) ? 0 : statement.hashCode());
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
		testDto other = (testDto) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone != other.phone)
			return false;
		if (registeration == null) {
			if (other.registeration != null)
				return false;
		} else if (!registeration.equals(other.registeration))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (statement == null) {
			if (other.statement != null)
				return false;
		} else if (!statement.equals(other.statement))
			return false;
		return true;
	}

	public testDto(String name, String sex, int phone, String registeration, String statement) {
		super();
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.registeration = registeration;
		this.statement = statement;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getRegisteration() {
		return registeration;
	}

	public void setRegisteration(String registeration) {
		this.registeration = registeration;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

}
