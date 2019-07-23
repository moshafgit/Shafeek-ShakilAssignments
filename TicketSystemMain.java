package com.ford.shakilAssessments;

import java.util.Scanner;

public class TicketSystemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a value from the below list");
		System.out.println("1. Create a new Ticket \n 2. Exit the application");
		
		TicketFunction tf = new TicketFunction();
		Scanner sc = new Scanner(System.in);
		
		int userValue = sc.nextInt();
		
		switch (userValue){
		
		case 1: 
			tf.ticketFunction();
			break;
		
		case 2: 
			System.out.println("Thank you!");
			break;
			
		default: System.out.println("Not a valid entry. Bye!");
			break;
		}
		
		sc.close();
	}

}
