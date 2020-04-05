package com.ust.ConstructorInjection;

public class Tyre {
	private String brand;

	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
	

}
