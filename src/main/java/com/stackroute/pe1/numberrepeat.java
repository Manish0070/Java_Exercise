package com.stackroute.pe1;

import java.util.*;
public class numberrepeat {
    public static void main(String[] args){
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberrepeat x=new numberrepeat();
        x.numberrepeater(n);
    }

        public int numberrepeater(int m) {
            int i, j,count=0;
            for (i = 1; i <= m; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.println(i);
                    count++;

                }
            }
            System.out.println(count);
            return count;
        }

}