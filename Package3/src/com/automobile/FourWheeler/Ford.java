package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle{

	private String modelName;
	private String ownerName;
	private String registration;
	private int speed;
	private int time;
	private String position;
	
	Ford(String modelName, String ownerName, String registration, int speed, int time,String position){
		this.modelName = modelName;
		this.ownerName = ownerName;
		this.registration = registration;
		this.speed = speed;
		this.time = time;
		this.position = position;
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
    
	public int gps() {
		System.out.print("is "+position+" at time ");
		return time;
	}
}
