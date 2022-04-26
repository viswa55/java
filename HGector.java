package com.create.iq.BasicProgarams.abstraction;

public class HGector  extends Car{

	public HGector(String carName, String color, byte numberOfVehicleOwners, short power, short horsePower,
			short cubicCapacity, int price, int mileage, boolean isDamaged) {
		super(carName, color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
		// TODO Auto-generated constructor stub
		//super.getDescription();
	}

	@Override
	public void startTheEngine() {
		System.out.println(" This Engine");
		super.getDescription();
		
	}

}
