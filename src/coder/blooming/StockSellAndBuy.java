package coder.blooming;

import java.util.Scanner;

public class StockSellAndBuy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) arr[i] = in.nextInt();


        System.out.println("Maximum Profit is : "+ findMaxProfit(arr,n));
    }
    private static int findMaxProfit(int arr[], int n){
        int profit = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for(int i : arr){
            minimum = Math.min(minimum, i);
            profit = Math.max(profit, i - minimum);
        }
        return profit;
    }
}
