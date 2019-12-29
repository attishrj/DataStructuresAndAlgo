package com.java.collection.map.java8;

import java.util.Objects;

public class Person {
	private Integer id;
	private String name;

	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Person))
			return true;
		Person person = (Person) obj;
		return Objects.equals(person.id, person.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

}
