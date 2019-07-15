package com.stackroute.pe1;

import java.util.*;
public class NumberRepeat {
    public static void main(String[] args){
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NumberRepeat x=new NumberRepeat();
        x.numberrepeater(n);
    }

        public int numberrepeater(int inputNumber) {
            int i, j,count=0;
            for (i = 1; i <= inputNumber; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.println(i);
                    count++;

                }
            }
            System.out.println(count);
            return count;
        }

}