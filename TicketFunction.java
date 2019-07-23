package com.ford.shakilAssessments;

import java.util.Scanner;

public class TicketFunction {
	public double ticketNumber;
	public String tDesc = null;
	public String tStatus = null;
	public String tType = null;
	public String tResln = null;
	
	public void ticketFunction(){
		
		System.out.println("Enter a description");
		Scanner sc1= new Scanner(System.in);
	//	sc1.next();
		this.tDesc = sc1.next();
		
		System.out.println("Enter a Ticket Type");
	//	sc1.next();
		this.tType = sc1.next();
		
		this.ticketNumber = Math.random();
		this.tStatus = "New";
		
		System.out.println("************************************\n");
		System.out.println("A new ticket is created successfully.");
		System.out.println("Ticket_number: "+ticketNumber + "\nDesc: "+ tDesc + "\nStatus: "+ tStatus +"\nTicket_type: " +tType);
		
		System.out.println("************************************\n");
		
		System.out.println("Do you want to approve/Cancel the ticket?");
		System.out.println("Enter \n 1. Approve the ticket \n 2. Cancel the ticket");
		
		
		
		Scanner sc2 = new Scanner(System.in);
		int userVal = sc2.nextInt();
		
		switch(userVal){
		case 1: 
			System.out.println("Please enter the resolution details: ");
			this.tResln = sc1.next();
			System.out.println("************************************\n");
			System.out.println("A ticket is approved. And the details are");
			this.tStatus = "Approve";
			System.out.println("Ticket_number: "+ticketNumber + "\nDesc: "+ tDesc + "\nStatus: "+ tStatus +"\nTicket_type: " +tType +"\n Resolution details: "+tResln);
			
			System.out.println("************************************\n");
			System.out.println("Do you want to close the ticket?");
			System.out.println("Enter \n 1. Close the ticket \n 2. Exit");
			
			userVal = sc2.nextInt();
			
			if (userVal == 1) {
				System.out.println("************************************\n");
				this.tStatus = "Closed";
				System.out.println("Ticket_number: "+ticketNumber + "\nDesc: "+ tDesc + "\nStatus: "+ tStatus +"\nTicket_type: " +tType +"\n Resolution details: "+tResln);
			}else{
				System.out.println("Thank you!");
			}
			
			break;
		case 2:
			this.tStatus = "Cancel";
			System.out.println("************************************\n");
			System.out.println("Ticket_number: "+ticketNumber + "\nDesc: "+ tDesc + "\nStatus: "+ tStatus +"\nTicket_type: " +tType);
			break;
		default:
			System.out.println("Not a valid entry. Bye!");
			break;
		}
		sc1.close();
		sc2.close();
	}
}
