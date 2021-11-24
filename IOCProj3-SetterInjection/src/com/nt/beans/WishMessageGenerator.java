//target class

package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
         private Date date;   //after injection it holds sys datye and time
         
         static { 
        	 System.out.println("WishGenerator:: static block");
         }
         
         public WishMessageGenerator() {
			// TODO Auto-generated constructor stub
		}
         //setter method for setter injection
         public void setDate(Date date) {
        	 System.out.println("WishMessageGenerator.setDate(-)");
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
