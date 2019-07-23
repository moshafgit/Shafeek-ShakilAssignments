package sampleTests;

import java.util.Scanner;

public class CalcClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcClass calc=new CalcClass();
		
		System.out.println("Please enter a value from the below list");
		System.out.println("1. Add \n2. Subtract \n3. Multiply \n4.Divide \n5.Find the Sqrt");
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int userValue = sc.nextInt();
		
		switch (userValue){
		
		case 1: 
			System.out.println("Do you want to add two or three digits");
			System.out.println("1. Two Digits \n2. Three Digits");
			userValue = sc.nextInt();
			if (userValue==1) {
				System.out.println("Do you want to add int or float point values");
				System.out.println("1. Integer \n2. Float");
				userValue = sc.nextInt();
				if (userValue==1) {
					System.out.println("Enter the first value");
					int num1 = sc1.nextInt();
					System.out.println("Enter the second value");
					int num2 = sc1.nextInt();
					calc.add(num1, num2);
				}else if(userValue==2){
					System.out.println("Enter the first value");
					float num1 = sc2.nextFloat();
					System.out.println("Enter the second value");
					float num2 = sc2.nextFloat();
					calc.add(num1, num2);
				}else{
					System.out.println("Not a valid entry. Please try again");
				}
			}else if (userValue==2){
				System.out.println("Not in function");
			}else{
				System.out.println("Not a valid entry. Please try again");
			}
			break;
		
		case 2: 
			System.out.println("Do you want to Subtract two or three digits");
			System.out.println("1. Two Digits \n2. Three Digits");
			userValue = sc.nextInt();
			if (userValue==1) {
				System.out.println("Enter the first value");
				int num1 = sc1.nextInt();
				System.out.println("Enter the second value");
				int num2 = sc1.nextInt();
				calc.sub(num1, num2);	
			}else if (userValue==2){
				System.out.println("Enter the first value");
				int num1 = sc1.nextInt();
				System.out.println("Enter the second value");
				int num2 = sc1.nextInt();
				System.out.println("Enter the third value");
				int num3 = sc1.nextInt();
				
				calc.sub(num1, num2, num3);
			}else{
				System.out.println("Not a valid entry. Please try again");
			}
			break;
			
		case 3: 
			System.out.println("Do you want to Multiple two or three digits");
			System.out.println("1. Two Digits \n2. Three Digits");
			userValue = sc.nextInt();
			if (userValue==1) {
				System.out.println("Enter the first value");
				int num1 = sc1.nextInt();
				System.out.println("Enter the second value");
				int num2 = sc1.nextInt();
				calc.mul(num1, num2);	
			}else if (userValue==2){
				System.out.println("Enter the first value");
				int num1 = sc1.nextInt();
				System.out.println("Enter the second value");
				int num2 = sc1.nextInt();
				System.out.println("Enter the third value");
				int num3 = sc1.nextInt();
				
				calc.mul(num1, num2, num3);
			}else{
				System.out.println("Not a valid entry. Please try again");
			}
			break;
			
		case 4: 
			System.out.println("Enter the first value");
			int num1 = sc1.nextInt();
			System.out.println("Enter the second value");
			int num2 = sc1.nextInt();
			calc.div(num1, num2);	
			
			break;
			
		case 5: 
			System.out.println("Enter the first value");
			int num = sc1.nextInt();
			calc.sqrt(num);	
			
			break;
			
		default: System.out.println("Not a valid entry. Bye!");
			break;
		}
		
		sc.close();
		sc1.close();
		sc2.close();
	}

}
