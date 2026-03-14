package org.javaturk.oopj.ch14.domain;

public class Person implements Eater {
	protected String firstName;
	protected String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFullname() {
		return firstName + " " + lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public String eat() {
		return "I am eating a lot :)";
	}
}
