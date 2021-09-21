package coder.blooming;

import java.util.Scanner;

public class MovingNegativeToBegining {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int arr[] = new int[len];
        //taking input of the array
        for(int i = 0; i < len; i++) arr[i] = in.nextInt();

        showArray(arr, "Before Moving : ");
        int neg = 0;

        for(int i = 0; i < len; i++){
            if(arr[i] < 0){
                arr = swapElemnts(arr, neg, i);
                neg++;
            }
        }

        showArray(arr, "After Moving : ");
    }
    //for showing the array
    public static void showArray(int arr[], String msg){
        System.out.println(msg);
        for(int i : arr) System.out.print(i+" ");
        System.out.println();
    }
    // method for swapping elements
    public static int[] swapElemnts(int arr[], int f, int l){
        arr[f] += arr[l];
        arr[l] = arr[f] - arr[l];
        arr[f] = arr[f] - arr[l];
        return arr;
    }
}
