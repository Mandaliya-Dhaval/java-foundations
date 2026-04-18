import java.util.Scanner;

public class Day01Basics {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		//1) Print my Name + YOE
		System.out.println("Enter Your Name");
		String myName = sc.nextLine();
		System.out.println("1) Name: "+myName + "| 3.6 YOE Functional Tester");
		
		//2)Add Two Numbers:- one from User input and one Hardcoded
		System.out.println("Enter the number for addition with Number 30: ");
		int a = sc.nextInt();
		int b = 30;
		int sum = a+b;
		System.out.println("2) Sum of " + a + " + " + b + " = " + sum);
		
		//3) Simple Interest (P=10000, R=7.5, T=2)
		double p = 10000;
		double r = 7.5;
		double t = 2;
		double SI = (p*r*t)/100.0;
		System.out.println("3) Simple Interest = " + SI);
		
		//4) Celsius -> Fahrenheit (C=30)
		double c = 30;
		double f = (c*1.8)+32;
		System.out.println("4) " + c + " °C = " + f + "°F");
		
		//5)Swap 2 Numbers using temp variable
		int h = 10;
		int i = 50;
		int temp = h;
		System.out.println("5) Before Swap: h = " + h + " and i = " +i);
		h=i;
		i=temp;
		System.out.println("	After Swap: h = " + h + " and i = " +i);
		
		//6) Scanner input: name +age -> print sentence)
		System.out.println("Enter the age");
		int age = sc.nextInt();
		System.out.println(" 6) Output: My Name is " + myName + " and I am " + age + " Years old");
		sc.close();
	}
}
