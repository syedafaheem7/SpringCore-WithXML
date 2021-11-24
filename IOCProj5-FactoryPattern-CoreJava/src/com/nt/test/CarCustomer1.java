package com.nt.test;

import com.nt.comp.ICar;
import com.nt.factory.CarFactory;

public class CarCustomer1 {
	public static void main(String[] args) {
		ICar car = CarFactory.getInstance("budget");
		System.out.println(car.getClass());
		car.drive();
		car.Accessories();
	}

}
