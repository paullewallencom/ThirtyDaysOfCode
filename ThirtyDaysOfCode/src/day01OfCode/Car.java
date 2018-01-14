/**
 * Copyright 2018 Paul Lewallen
 *
 */
 package day01OfCode;
 
 /**
  * Author paullewallen
  *
  */
  public class Car
  {
    
    /**
     * @param args the command line arguments
     *
     */
	  
	 int maxSpeed = 100;
	 int minSpeed = 0;
	 double weight = 4079;
	 boolean isTheCarOn = false;
	 char condition = 'A';
	 
	 public void printVariables()
	 {
		 System.out.println(maxSpeed);
		 System.out.println(minSpeed);
		 System.out.println(weight);
		 System.out.println(isTheCarOn);
		 System.out.println(condition);
	 }
	 
	 public void wreckCar()
	 {
		 condition = 'C';
	 }
     
     public static void main(String[] args)
     {
    	 	System.out.println("------Family's Car");
    	 	Car familyCar = new Car();
    	 	familyCar.printVariables();
    	 	
    	 	System.out.println("------Paul's Car");
    	 	Car paulCar = familyCar;
    	 	
    	 	familyCar.wreckCar();
    	 	
    	 	paulCar.printVariables();
     }
  }