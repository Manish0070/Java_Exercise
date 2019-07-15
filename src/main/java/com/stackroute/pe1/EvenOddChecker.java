package com.stackroute.pe1;

import java.util.*;
public class EvenOddChecker {
    public static void main(String[] args){
        System.out.println("Enter an Integer :");
        Scanner sc= new Scanner(System.in);
        int x =sc.nextInt();
        EvenOddChecker t=new EvenOddChecker();
        t.compareeven(x);
    }

    public int compareeven(int inputNumber){
        if(inputNumber>20 && inputNumber<30){
            if(inputNumber%2==0){
                System.out.println("jerry");
            }
            else{
                System.out.println("tom");
            }
        }
        return inputNumber;
    }
}