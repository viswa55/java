package com.create.iq.BasicProgarams.abstraction;

import java.util.Random;

public abstract class Car {
	private byte numberofSets=5;
	private byte numberofDoors=3;
	
	private byte numberofVehicleOwners=1;
	private byte emissionSticker=4;
	
	
	private short power=362;
	private short horsePower=492;
	private short co2Emission=333;
	private short cubicCapacity=6417;
	
	private int price=29999;
	private int mileage=14999;
	
	
	private long regisrationNumber=1345135122521522L;
	
	private float fuelConsumptionCombined=15.5f;
	private float fuelConsumptionUrban=21.4f;
	private float fuelConsumptionAverage=(float) 153.245456264614E-1;
	private boolean isDamaged=true;
	private char energyEfficiencyCategoy='G';
	
	private String colour;
	private String carName;
	
	
	
	public Car(String carName, String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamaged) {
		this.carName=carName;
		this.colour=colour;
		this.numberofVehicleOwners=numberofVehicleOwners;
		this.power=power;
		this.horsePower=horsePower;
		this.cubicCapacity=cubicCapacity;
		this.price=price;
		this.mileage=mileage;
		this.isDamaged=isDamaged;
		Random random =new Random();
		//long randomNumberGenerator;
		this.regisrationNumber=random.nextLong();
	}
	public abstract void startTheEngine();
	public void getDescription() {
		System.out.println("A"+colour+" "+carName+" "+"is created.");
		System.out.println("price:"+" "+price);
		System.out.println("Mileage:"+mileage+"Km");
		System.out.println("This car is damaged:"+isDamaged);
		System.out.println("Registrationnumber:"+regisrationNumber);
		System.out.println("cubic Capacity:"+cubicCapacity);
		System.out.println("power:"+power+"Km");
		System.out.println("HorsePower"+horsePower+"Km");
		System.out.println("Co2 emission:"+co2Emission+"g/Km");
		System.out.println("Emission sticker:"+emissionSticker);
		System.out.println("Energy efficiency:"+energyEfficiencyCategoy);
		
	}
	
	
	
	
	
	
	
	

}
