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
	 
	 double maxFuel = 16;
	 double currentFuel = 8;
	 double mpg = 26.4;
	 
	 int numberOfPeopleInCar = 1;
	 
	 public Car(int customMinSpeed, double customWeight, boolean customIsTheCarOn)
	 {
		 minSpeed = customMinSpeed;
		 weight = customWeight;
		 isTheCarOn = customIsTheCarOn;
	 }
	 
	 public void printVariables()
	 {
		 System.out.println(maxSpeed);
		 System.out.println(minSpeed);
		 System.out.println(weight);
		 System.out.println(isTheCarOn);
		 System.out.println(condition);
	 }
	 
	 public void upgradeMinSpeed()
	 {
		 minSpeed = maxSpeed;
		 maxSpeed = maxSpeed + 50;
	 }
	 
	 public void wreckCar()
	 {
		 condition = 'C';
	 }
     
     public static void main(String[] args)
     {	
    	 	Car birthdayPresent = new Car(500, 2005.456, true);
    	 	birthdayPresent.printVariables();
     }
  }