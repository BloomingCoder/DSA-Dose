package coder.blooming;

import java.util.Scanner;

public class CyclicallyRotateArrayByOne {
    public static void main(String[] args) {
//        Scanner object for taking inputs
        Scanner in = new Scanner(System.in);
//        taking inputs
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) arr[i] = in.nextInt();
        showArray(arr, "Before rotate:");
        rotate(arr, n);
        showArray(arr, "After rotate:");
    }
//    showing the array
    public static void showArray(int arr[], String msg){
        System.out.println(msg+"\n");
        for(int i : arr) System.out.print(i+" ");
        System.out.println();
    }
//    rotating the array
    public static void rotate(int arr[], int n){
        int buffer = arr[n-1];
        for(int i = n-1; i > 0; i--) arr[i] = arr[i-1];
        arr[0] = buffer;
    }
}
