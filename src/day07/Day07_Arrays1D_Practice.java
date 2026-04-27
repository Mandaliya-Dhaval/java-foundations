package day07;

import java.util.Arrays;
import java.util.Scanner;
public class Day07_Arrays1D_Practice {

	static  void reverseInPlace(int[] arr){
		int left =0, right = arr.length-1;
		while(left<right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
	static boolean isSortedAscending(int[] arr){
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[i-1]){
				return false;
			}
		}
		return true;
	}
	static int countOccurrences(int[] arr, int target){
		int count = 0;
		for(int i =0;i<arr.length;i++){
			if(arr[i]==target){
				count++;
			}
		}
		return count;
	}
	static void moveZerosToEnd(int[] arr){
		int n = arr.length;
		int j =0;
		for(int i =0;i<n;i++){
			if(arr[i]!=0){
				int temp = arr[i];
				arr[i] = arr[j];;
				arr[j] = temp;
				j++;
			}
		}
	}
	static int linearSearch(int[] arr, int target){
		for(int i =0;i<arr.length;i++){
			if(arr[i]==target){
				return i;
			}
		}
		return -1;
	}

	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		int[] a = {1, 0, 2, 0, 0, 3, 4};

		System.out.println("isSortedAscending: " + isSortedAscending(a));
		System.out.println("countOccurrences(0): " + countOccurrences(a, 0));
		System.out.println("linearSearch(3): " + linearSearch(a, 3));

		moveZerosToEnd(a);
		System.out.println("After moveZerosToEnd: " + Arrays.toString(a));

		reverseInPlace(a);
		System.out.println("After reverseInPlace: " + Arrays.toString(a));
	}
	
}