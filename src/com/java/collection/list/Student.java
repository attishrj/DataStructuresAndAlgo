package com.java.collection.list;

import java.util.Objects;

public class Student {

	int roll;

	public Student(int roll) {
		super();
		this.roll = roll;
	}

	public int getRoll() {
		return roll;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (roll != other.roll)
			return false;
		return true;
	}

}
