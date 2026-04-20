import java.util.Scanner;
public class Day04Methods{
	
	public static int add(int a, int b){
		return a+b;
	}
	
	public static boolean isEven(int n){
		return n % 2 ==0;
	}
	
	public static int maxOf3(int a, int b, int c){
		int max;
		if (a>=b && a>=c){
			max=a;
		}
		else if (b>=a && b>=c){
			max=b;
		}
		else{
			max=c;
		}
		return max;
	}
	
	public static boolean isLeapYear(int year){
		if ((year %400 ==0) || ((year % 4 ==0) && (year %100 !=0))){
			return true;
		}
		else{
			return false;
		}
	} 
	
	public boolean isPrime(int n){
		if (n<=1){
			return false;
		}
		if (n ==2){
			return true;
		}
		if (n % 2 ==0){
			return false;
		}
		for (int i =3 ; i*i<=n;i+=2){
			if (n%i==0)  return false;
		}
		return true;
	}
	 
	
	public int factorial(int n){
		int fact = 1;
		if (n<0){
			return -1;
		}
		for (int i=n; i>=1;i--){
			fact = fact * i;
		}
		return fact;
	}
	
	public int reverseNumber(int r){
		int revnum  = 0;
		while (r!=0){
			int digit = r % 10; //getting last digit
			revnum = revnum * 10 + digit;
			r /= 10;
		}
		return revnum;
	}
	
	public int sumOfDigits(int r){
		int sum = 0;
		while (r!=0){
			sum = r%10 +sum;
			r = r/10;
		}
		return sum;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Day 04 Methods Demo");
		Day04Methods dy = new Day04Methods();
		
		//Addition
		System.out.println("Enter two integers to add (A+B):");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Sum of " + a + " and " + b + " is " + add(a,b));
		
		// isEven, isPrime, factorial, reverseNumber, sumOfDigits on same number
		System.out.println("Enter an inteher to test (isEven, isPrime, factorial): ");
		long n = sc.nextInt();
		System.out.println( n + " is even ? " + isEven(n));
		System.out.println( n + " is prime ? " + dy.isPrime(n));
		long fct = dy.factorial(n);
		if (fct >=0){
			System.out.println(n + "!= " + fct);
		}else{
			System.out.println("Factorial(" + n + ") is not defined for negative numbers");
		}
		
		//reverse number
		System.out.println("Enter an Integer to test reverseNumber and sumOfDigits: ");
		long r = sc.nextInt();
		System.out.println("Reverse " + r + " = " + dy.reverseNumber(r));
		System.out.println("Sum of digit  " + r + " = " + dy.sumOfDigits(r));
		
		//Max of 3 Number
		System.out.print("Enter three integers to find max (x y z): ");
		int x = sc.nextInt();
		int y = sc.nextInt(); 
		int z =  sc.nextInt();
		System.out.println("Max of 3 (" + x + "," + y + "," + z + ") = " + maxOf3(x,y,z));
		
		
		//Is LeapYear
		System.out.print("Enter a year to check if it is a leap year:");
		int lpyear = sc.nextInt();
		System.out.println(lpyear + " is a leap year ? " + isLeapYear(lpyear));
		
		sc.close();
	}
}
