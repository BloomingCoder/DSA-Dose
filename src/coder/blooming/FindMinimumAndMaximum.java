package coder.blooming;

import java.util.Scanner;

public class FindMinimumAndMaximum {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int arr[] = new int[len];

        //taking the input of array
        for(int i = 0; i < len; i++) arr[i] = in.nextInt();
        Helper nums = findMinMax(arr, len);

        System.out.println("Minimum Number : "+ nums.min);
        System.out.println("Maximum Number : "+ nums.max);
    }

    //method for finding min and max
    public static Helper findMinMax(int arr[], int len){
        Helper nums = new Helper();
        if(len == 1){
            nums.min = arr[0];
            nums.max = arr[0];
            return nums;
        }
        if(arr[0] < arr[1]) {
            nums.min = arr[0];
            nums.max = arr[1];
        }
        else if (arr[0] > arr[1]){
            nums.max = arr[0];
            nums.min = arr[1];
        }
        for(int i = 2; i < len; i++){
            if(nums.min > arr[i]) nums.min = arr[i];
            else if(nums.max < arr[i]) nums.max = arr[i];
        }

        return nums;
    }
}

//class for storing and returning the min and max value
class Helper{
    public int min;
    public int max;
}