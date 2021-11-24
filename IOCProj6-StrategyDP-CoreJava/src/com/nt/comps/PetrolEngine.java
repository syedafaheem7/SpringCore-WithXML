package com.nt.comps;

public final class PetrolEngine implements IEngine{

	@Override
	public void start() {
		System.out.println("PetrolEEngine.start::--> Petrol Engine started");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEEngine.stop::--> Petrol Engine stopped");
		
	}
	

}
