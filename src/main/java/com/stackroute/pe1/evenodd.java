package com.stackroute.pe1;

import java.util.*;
public class evenodd {
    public static void main(String[] args){
        System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>20 && n<30){
            if(n%2==0){
                System.out.println("Jerry");
            }
            else{
                System.out.println("Tom");
            }
        }
    }
}