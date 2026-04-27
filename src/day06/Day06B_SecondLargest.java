import java.util.Scanner;
public class Day06B_SecondLargest {
    public static int secondLargestWithDuplicates(int [] arr){
        int n = arr.length;
        if (n<2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            if(arr[i]>largest) {
                // this is where I am getting error

                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static int secondLargestDistinct(int [] arr) {
        int m = arr.length;
        if (m<2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int j=0;j<m;j++) {
            if (arr[j] > largest) {
                // this is where I am getting error
                secondLargest = largest;
                largest = arr[j];
            } else if (arr[j] > secondLargest && arr[j]!=largest) {
                secondLargest = arr[j];
            }
        }
        if (secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int arraySize = sc.nextInt();

        if (arraySize <= 0) {
            System.out.println("Array is empty");
            return;
        }

        int[] arr = new int[arraySize];
        System.out.println("Enter " + arraySize + " elements:");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Second Largest Number with duplicates: " +secondLargestWithDuplicates(arr));
        System.out.println("Second Largest Number with distinct: " +secondLargestDistinct(arr));
        sc.close();
    }
}