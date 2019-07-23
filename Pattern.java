package com.ford.shakilAssessments;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a description");
		Scanner sc1= new Scanner(System.in);
		
		int input=sc1.nextInt();
		int n=1;
		int k=0;
		for(int i=1;i<input;i++) {
			k=n-1;
			if(input-k <= i) break;
			for(int j=1;j<=i;j++) {
				if(n > input) break;
				
				
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
		sc1.close();
	} 
}


 
