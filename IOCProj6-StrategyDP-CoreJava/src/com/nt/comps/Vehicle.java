//target class
package com.nt.comps;

public final class Vehicle {
	private IEngine engg;     //has a property  (composition)
	 
	 public void setEngg(IEngine engg) {
		this.engg = engg;
	}
	public void journey(String sourceplace, String destplace) {
		engg.start();
		System.out.println("journey started at::" +sourceplace);
		System.out.println("journey is going on....");
		engg.stop();
		System.out.println("journey stopped at::"+destplace);
	}

}
