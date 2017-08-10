package com.pattern.core.builder;

import java.util.List;

public class Car {
	private int speed;
	private String color;
	private int gear;
	private List<String> persons;
	
	private Car(CarBuilder builder){
		speed=builder.speed;
		color=builder.color;
		gear=builder.gear;
		persons=builder.persons;
	}
	
	
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + ", gear=" + gear + ", persons=" + persons + "]";
	}
	
	public String getData() {
		if (speed==0){
			return 	"Car [speed= No data, color=" + color + ", gear=" + gear + ", persons=" + persons + "]";
		}else{
			return "Car [speed=" + speed + ", color=" + color + ", gear=" + gear + ", persons=" + persons + "]";
		}
		
	}


	public static class CarBuilder{
		
		private int speed;
		private String color;
		private int gear;
		private List<String> persons;
		
		public CarBuilder speed(int speed){
			this.speed=speed;
			return this;
			
		}
		public CarBuilder color(String color){
			this.color=color;
			return this;
			
		}
		
		public CarBuilder gear(int gear){
			this.gear=gear;
			return this;
			
		}
		public CarBuilder persons(List<String> persons){
			this.persons=persons;
			return this;
			
		}
		
		public Car build(){
			return new Car(this);
		}

	}
	
}
