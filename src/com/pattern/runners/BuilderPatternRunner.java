package com.pattern.runners;

import java.util.Arrays;

import com.pattern.core.builder.Car;
import com.pattern.core.builder.Student;

public class BuilderPatternRunner {

	public static void main(String[] args) {
		Student pumpedStudent = new Student.StudentBuilder().name("mkyong").age(18)
				.language(Arrays.asList("chinese", "english")).build();

		System.out.println(pumpedStudent);

		Car pumpedCar = new Car.CarBuilder().speed(150).color("blue").gear(5).persons(Arrays.asList("Gabó", "Ági"))
				.build();
		System.out.println(pumpedCar);

		Car stumpfCar = new Car.CarBuilder().persons(Arrays.asList("Kriszti", "Szofi", "Tas", "Stumpf"))
				.build();
		System.out.println(stumpfCar.getData());
	}

}
