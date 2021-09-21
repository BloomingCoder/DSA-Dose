package coder.blooming;

import java.util.Scanner;

public class Arrange012 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int arr[] = new int[len];
        //for taking the inputs from users
        for(int i = 0; i < len; i++) arr[i] = in.nextInt();

        showArray(arr, "Before sorting : ");
        int start = 0;
        int end = len -1;
        int mid = 0;
        while(mid <= end){
            switch(arr[mid]){
                case 0:
                    if(mid != start){
                        arr = swapElements(arr, start, mid);
                        start ++;
                    } else mid++;
                    break;
                case 1: mid++; break;
                case 2:
                    if(mid != end){
                        arr = swapElements(arr, mid, end);
                        end --;
                    } else mid ++;
                    break;
            }
        }
        showArray(arr, "After sorting : ");
    }
    //for showing the array
    public static void showArray(int arr[], String msg){
        System.out.println(msg);
        for(int d : arr) System.out.print(d+" ");
        System.out.println();
    }
    //for swapping the elements
    public static int[] swapElements(int[] a, int f, int l){
        a[f] = a[f] + a[l];
        a[l] = a[f] - a[l];
        a[f] = a[f] - a[l];
        return a;
    }
}
