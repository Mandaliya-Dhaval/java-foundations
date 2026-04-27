import java.util.Arrays;
import java.util.Scanner;

public class Day06ArraysBasics {

	public static int min(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array is null or empty");
		}
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) min = arr[i];
		}
		return min;
	}

	public static int max(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array is null or empty");
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) max = arr[i];
		}
		return max;
	}

	public static void printArray(int[] arr) {
		System.out.println("Array contents: " + Arrays.toString(arr));

	}

	public static int sum(int[] arr) {
		if (arr == null) return 0;
		int sum = 0;
		for (int x : arr) sum += x;
		return sum;
	}

	public static void countEvenOdd(int[] arr) {
		int even = 0, odd = 0;
		for (int x : arr) {
			if (x % 2 == 0) even++;
			else odd++;
		}
		System.out.println("Even: " + even);
		System.out.println("Odd : " + odd);
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the size of the array: ");
			int n = sc.nextInt();

			if (n <= 0) {
				System.out.println("Array is empty");
				return;
			}

			int[] arr = new int[n];
			System.out.println("Enter " + n + " elements:");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			printArray(arr);
			System.out.println("Minimum number is " + min(arr));
			System.out.println("Maximum number is " + max(arr));
			System.out.println("Sum of all numbers is " + sum(arr));
			countEvenOdd(arr);
		}
	}
}