package com.automobile.twoWheeler;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("HF Deluxe", "Vinay Singh", "mh22dv2366", 60);
        hero.getModelName();
        hero.getOwnerName();
        hero.getRegistrationNumber();
        System.out.println("Speed :"+hero.getSpeed());
        hero.radio();
        
        Honda honda = new Honda("Honda SP 125","Ravi","mh22dv2326",70);
        honda.getModelName();
        honda.getOwnerName();
        honda.getRegistrationNumber();
        honda.getSpeed();
        honda.cdPlayer();
        return;
	}

}
