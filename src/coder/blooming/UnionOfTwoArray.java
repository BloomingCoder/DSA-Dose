package coder.blooming;

import java.util.HashSet;
import java.util.Scanner;

public class UnionOfTwoArray {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i = 0; i < n; i++) a[i] = in.nextInt();
        for(int i = 0; i < m; i++) b[i] = in.nextInt();
        showArray(a,"First Array");
        showArray(b, "Second Array");
        System.out.println("Union of two array");
        findUnion(a, b, n, m);
    }
    private static void showArray(int a[], String msg){
        System.out.println(msg);
        for(int i : a) System.out.print(i+" ");
        System.out.println();
    }
    private static void findUnion(int a[], int b[], int n, int m){
        HashSet<Integer> num = new HashSet<Integer>();
        for(int i : a) num.add(i);
        for(int i : b) num.add(i);
        System.out.println("Union is : "+ num);
    }
}
