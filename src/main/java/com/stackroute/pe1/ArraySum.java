package com.stackroute.pe1;
import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
    }

    public int arrayAddition(int n, int array[]) {
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum:" + sum);
        return sum;
    }
    }
