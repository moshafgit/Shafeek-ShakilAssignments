package sampleTests;

public class CalcClass {
	
	//signature of method :   method name +parameter type+number of parameter+order
	//return type is not consider in overloading
	
	public void add(int n1,int n2) {
		int sum=n1+n2;
		System.out.println("Sum of two numbers: "+sum);
	}
	
	public void add(int n1,int n2,int n3) {
		int sum=n1+n2+n3;
		System.out.println("Sum of three numbers: "+sum);
	}
	public void add(float n1,float n2) {
		float sum=n1+n2;
		System.out.println("Sum of three numbers: "+sum);
	}
	
	public void sub(int n1,int n2) {
		int sum=n1-n2;
		System.out.println("Results of subtraction of two numbers: "+sum);
	}
	
	public void sub(int n1,int n2,int n3) {
		int sum=(n1-n2)-n3;
		System.out.println("Results of subtraction of three numbers: "+sum);
	}
	
	public void mul(int n1,int n2) {
		int sum=n1*n2;
		System.out.println("Results of multiplication of two numbers: "+sum);
	}
	
	public void mul(int n1,int n2,int n3) {
		int sum=(n1*n2)*n3;
		System.out.println("Results of multiplication of three numbers: "+sum);
	}
	
	public void div(int n1,int n2) {
		int sum=n1/n2;
		System.out.println("Results of division of two numbers: "+sum);
	}
	
	public void sqrt(int n1) {
		double result = Math.sqrt(n1);
		System.out.println("Squere root of the given number is: "+result);
	}
}
