package com.nt.test;

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDPTest1 {
     public static void main(String[] args) {
    	 try {
    		 //get a vehicle object
    		 Vehicle vehicle = VehicleFactory.getInstance("petrol");
    		 //invoke method
    		 vehicle.journey("Chicago", "New York");
    		 
    	 }
    	 catch(IllegalArgumentException iae){
    		 iae.printStackTrace();
    	 }
	
}
}
