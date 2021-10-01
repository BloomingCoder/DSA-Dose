package coder.blooming;

import java.util.Scanner;

public class LargestSumContagiousSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) arr[i] = in.nextInt();
        showArray(arr, "Array is : ");
        System.out.println(largestSumSubarray(arr, n));
    }

    private static long largestSumSubarray(int[] arr, int n) {
        long max = Long.MIN_VALUE;
        long max_temp = 0;
        for(int i : arr){
            max_temp += i;
            max = Math.max(max, max_temp);

            max_temp = Math.max(max_temp, 0);
        }
        return max;
    }

    private static void showArray(int arr[], String msg){
        System.out.println(msg);
        for(int i : arr ) System.out.print(i + " ");
        System.out.println();
    }
}
