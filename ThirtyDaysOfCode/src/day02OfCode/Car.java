/**
 * Copyright 2018 Paul Lewallen
 *
 */
 package day02OfCode;

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
	 
	 String nameOfCar = "Pablo Picante";
	 
	 double maxFuel = 16;
	 double currentFuel = 8;
	 double mpg = 26.4;
	 
	 int numberOfPeopleInCar = 1;
	 
	 // f(x) = x + 1;
	 // Say x = 5;
	 // f(5) = 5 + 1 = 6;
	 
	 public Car(int customMinSpeed, double customWeight, boolean customIsTheCarOn) 
	 {
		 minSpeed = customMinSpeed;
		 weight = customWeight;
		 isTheCarOn = customIsTheCarOn;
	 }
	 
	 public void printVariables()
	 {
		 System.out.println("This is the maxSpeed " + maxSpeed);
		 System.out.println(minSpeed);
		 System.out.println(weight);
		 System.out.println(isTheCarOn);
		 System.out.println(condition);
		 System.out.println(nameOfCar);
	 }
	 
	 public void upgradeMinSpeed()
	 {
		 minSpeed = maxSpeed;
		 maxSpeed = maxSpeed + 50;
	 }
	 
	 public static void main(String[] args)
     {	
    	 	// TODO code application logic here
		 Car birthdayPresent = new Car(500, 2504.436, true);
		 birthdayPresent.printVariables();
		 
		 Car christmasPresent = new Car(500, 5055.328, false);
		 christmasPresent.printVariables();
     }
  }