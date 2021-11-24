package com.nt.factory;

import com.nt.comp.BudgetCar;
import com.nt.comp.LuxuryCar;
import com.nt.comp.SportsCar;
import com.nt.comp.ICar;

public class CarFactory {
	
	//factory method having factory pattern logic
	public static ICar getInstance(String type) {
		ICar car= null;
		if(type.equalsIgnoreCase("Luxury"))
		         car = new LuxuryCar();
		
		 else if (type.equals("Budget"))
			     car = new BudgetCar();
		
		 else if(type.equalsIgnoreCase("Sports"))
			     car = new SportsCar();
		 else
			 throw new IllegalArgumentException("invalid car Type");
		
		return car;
		
	}

}
