package com.pattern.core.factorymethod;


public class CarFactory {
	
	   //use getShape method to get object of type shape 
	   public CarInterface getCar(String carType){
	      if(carType == null){
	         return null;
	      }		
	      if(carType.equals("RCAR")){
	         return new RaceCar();
	         
	      } else if(carType.equals("TRUCK")){
	         return new Truck();
	         
	      } else if(carType.equals("ACAR")){
	         return new AmbulanceCar();
	      }else if(carType.equals("QUAD")){
	    	  return new Quad();
	      }
	      
	      return null;
	   
	   }
	}
