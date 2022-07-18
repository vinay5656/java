package com.automobile.FourWheeler;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ford ford = new Ford("Ford Figo", "Vinay Singh Chouhan",
        		"5J8TBH38FL002262", 50 , 6, "Jaipur");
        ford.getModelName();
        ford.getOwnerName();
        ford.getRegistrationNumber();
        System.out.println("Speed = "+ford.getSpeed());
        System.out.println("Current speed of the car :"+ford.getSpeed());
        System.out.print("Current location of the car ");
        System.out.println(ford.gps()+":00AM/PM");
        
        Logan logan = new Logan("Logan Petrol 1.4 GLX1390 cc, Manual, Petrol, 15.7 kmplEXPIRED", "Ravi Singh Chouhan",
        		"5J8TBH38FL0022", 70 , 32);
        logan.getModelName();
        logan.getOwnerName();
        logan.getRegistrationNumber();
        System.out.println("Speed = "+logan.getSpeed());
        System.out.println("Current Temperature of the car "+logan.tempControl());
		return;
	}

}
