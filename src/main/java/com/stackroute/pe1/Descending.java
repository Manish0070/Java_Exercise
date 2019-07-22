package com.stackroute.pe1;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Descending {
    public static void main(String[] args) {
        int n, m, temp, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter elements in array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }


    }

    public int descendingOrder(int n, int data[]) {
        int temp, sumTemp, sum = 0;
        if(data==null){
            return 0;
        }
        else {

            for (int i = 0; i < n; i++) {

                for (int j = i + 1; j < n; j++) {
                    if (data[i] < data[j]) {
                        temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;
                    }
                }

                sumTemp = data[i];
                if (sumTemp % 2 == 0) {
                    sum = sum + sumTemp;
                }


            }
        }

        System.out.print("Descending Order:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(data[i] + ",");
        }

        System.out.print(data[n - 1]);
        System.out.println("\n");
        System.out.println("Sum of even numbers:" + sum);
        return sum;
    }
}


