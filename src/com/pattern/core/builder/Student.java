package com.pattern.core.builder;

import java.util.List;

public class Student {
	private String name;
	private int age;
	private List<String> language;

	private Student(StudentBuilder builder) {
		name = builder.name;
		age = builder.age;
		language = builder.language;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", language=" + language + "]";
	}

	public static class StudentBuilder { //inner class

		private String name;
		private int age;
		private List<String> language;

		public StudentBuilder name(String name) {
			this.name = name;
			return this;
		}

		public StudentBuilder age(int age) {
			this.age = age;
			return this;
		}

		public StudentBuilder language(List<String> language) {
			this.language = language;
			return this;
		}

		public Student build() {
			return new Student(this);
		}

	}

}
