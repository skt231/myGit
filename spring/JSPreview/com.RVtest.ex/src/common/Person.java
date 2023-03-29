package common;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public Person() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;

}
