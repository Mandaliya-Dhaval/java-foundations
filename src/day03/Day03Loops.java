import java.util.Scanner;
public class Day03Loops{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//1 Print 1 to N (input N)
		System.out.println("==============================================");
		System.out.println("=======1. Print 1 to N =======");
		System.out.print("Enter an Number:");
		int N = sc.nextInt();
		System.out.print("Printing Number from 1 to " + N + " ");
		for (int i=1; i<=N;i++){
				System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println();
		
		//2 Sum 1 to N (Using same N for sum)
		System.out.println("=======2. Sum of N Numbers =======");
		int sum=0;
		for (int i=1; i<=N;i++){
			sum += i;
		}
		System.out.println("Sum of 1 to " + N + " is  " + sum);
		System.out.println();
		
		//3 Factorial of N
		System.out.println("=======3. Factorial of N =======");
		int fact = 1;
		for (int i=N; i>=1;i--){
			fact = fact * i;
		}
		System.out.println("Factorial of " + N + " is " + fact);
		System.out.println();
		
		//4 Prime check
		System.out.println("=======4. Prime Number Check =======");
            System.out.print("Enter a Number to Check Prime or not:");
            int prime = sc.nextInt();

            boolean isPrime; // compute result first, then print once
            if (prime <= 1) {
                isPrime = false;
            } else if (prime == 2) {
                isPrime = true;
            } else if (prime % 2 == 0) {
                isPrime = false;
            } else {
                isPrime = true;
                for (int i = 3; i * i <= prime; i += 2) {
                    if (prime % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            System.out.println(prime + (isPrime ? " is Prime" : " is not Prime"));

		
		
		//5 Fibonacci first N numbers
		System.out.println("=======5. Fibonacci Series =======");
		System.out.println("Enter the Number for Fibo Series:");
		int fibo = sc.nextInt();
		int first = 0;
		int second = 1;
		for (int i = 1;i<=fibo;i++){
			System.out.print(first + " ");
			int next = first+second;
			first=second;
			second = next;
		}
		System.out.println();
		
		//6 Reverse a number + sum of digits
		System.out.println("=======6. Reverse Num+ sum of digits =======");
		System.out.println("Enter the Number :");
		int revsum = sc.nextInt();
		int reverse = 0; int digitsum=0;
		while (revsum != 0) {
            int digit = revsum % 10;     // Get the last digit
            digitsum += digit;             // Add digit to sum
            reverse = reverse * 10 + digit; // Build the reversed number
            revsum /= 10;                // Remove the last digit
        }
		System.out.println("Sum of digits: " + digitsum);
        System.out.println("Reversed number: " + reverse);
		sc.close();
	}
}