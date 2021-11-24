//target class

package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
         private Date date;
         
         static { 
        	 System.out.println("WishGenerator:: static block");
         }
         
       
         //constructor injection
         public WishMessageGenerator(Date date) {
			super();
			this.date = date;
		}
		//b.logic
         public String generateWishMessage (String user) {
        	 
        	 System.out.println("WishMessageGenerator.generateWishMessage()-->"+date);
        	 //get hour of the day
        	 int hour= date.getHours();
        	 //generate wish message
        	 if (hour<12) 
        		 return"Good Morning::"+user;
        	 else if(hour<16)
        		 return "Good Afternoon::"+ user;
        	 else if(hour<20)
        		 return "Good evening::"+user;
        	 else 
        		 return "Good night::"+user;
        	 

         }
}
