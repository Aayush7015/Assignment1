package Assignment1;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter calculation you want to perform");
		String calculation = sc.next();
		if(calculation.equals("add")) {
			System.out.println("Enter  two number ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(add(a,b));
		}
		if(calculation.equals("subtract")) {
			System.out.println("Enter  two number ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>b)
			System.out.println(subtract(a,b));
			else
			{
				System.out.println(subtract(b,a));
			}
		}
		if(calculation.equals("Multiply")) {
			System.out.println("Enter  two number ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(Multiply(a,b));
		}
		if(calculation.equals("divide") ) {
			System.out.println("Enter  two number ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>b)
			System.out.println(divide(a,b));
			else
			{
				System.out.println(divide(b,a));
			}
		}
		if(calculation.equals("square")) {
			System.out.println("Enter  your number ");
			int a = sc.nextInt();
			System.out.println(square(a));
		}
		if(calculation.equals("cube")) {
			System.out.println("Enter  your number ");
			int a = sc.nextInt();
			System.out.println(cube(a));
		}
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static int subtract(int a,int b) {
		return a-b;
		
	}
	public static int Multiply(int a,int b) {
		return a*b;
	}
	public static int divide(int a,int b) {
		return a/b;
	}
	public static int square(int a) {
		return a*a;
	}
	public static int cube(int a) {
		return a*a*a;
	}
}
