package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle{
	private String modelName;
	private String ownerName;
	private String registration;
	private int speed;
	private int temperature;
	
	Logan(String modelName, String ownerName, String registration, int speed, int temperature){
		this.modelName = modelName;
		this.ownerName = ownerName;
		this.registration = registration;
		this.speed = speed;
		this.temperature = temperature;
	}

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		System.out.println("Model Name :"+modelName);
		return null;
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		System.out.println("Owner of the bike :"+ownerName);
		return null;
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		System.out.println("Registration number of the bike :"+registration);
		return null;
	}
	
	public int getSpeed() {
		return speed;
	}
    
	public int tempControl() {
		
		return temperature;
	}
	

}
