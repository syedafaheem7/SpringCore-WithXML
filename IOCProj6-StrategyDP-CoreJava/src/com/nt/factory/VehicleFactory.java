
package com.nt.factory;

import com.nt.comps.CNGEngine;
import com.nt.comps.DieselEngine;
import com.nt.comps.IEngine;
import com.nt.comps.PetrolEngine;
import com.nt.comps.Vehicle;

public class VehicleFactory {
	public static Vehicle getInstance(String engineType) {
		IEngine engg= null;
		//create dependent class object
		if (engineType.equalsIgnoreCase("diesel"))
			engg = new DieselEngine();
		else if (engineType.equalsIgnoreCase("petrol"))
			engg = new PetrolEngine();
		else if (engineType.equalsIgnoreCase("CNG"))
			engg = new CNGEngine();
		else 
			throw new IllegalArgumentException("invalid engine type");
		//create a target class
		Vehicle vehicle = new Vehicle();
		//assign dependent obj to target obj
		
		vehicle.setEngg(engg);
		
		return vehicle;
		
	}

}
