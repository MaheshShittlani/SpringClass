package com.cdacls2023.ConfigLearning;

public class Person {
	private String name;
	private int age;
	private Address address;
	
	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	
	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
