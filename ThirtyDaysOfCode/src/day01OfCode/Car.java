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
     
     public static void main(String[] args)
     {
    	 	//TODO code application logic here    	 	System.out.println("Hello Car!");
    	 	Car myCar = new Car();
    	 	myCar.printVariables();
     }
  }