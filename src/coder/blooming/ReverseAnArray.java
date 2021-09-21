package coder.blooming;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        showArray(arr, "Before Reversing the array.");
        int temp = 0;
        for(int i = 0; i < n / 2; i++){
            temp = arr[i];
            arr[i] = arr[n -i -1];
            arr[n -i -1] = temp;
        }
        showArray(arr, "After Reversing the array.");
    }

    public static void showArray(int arr[], String msg){
        System.out.println(msg);
        for(int d : arr) System.out.print(d + " ");
    }
}
