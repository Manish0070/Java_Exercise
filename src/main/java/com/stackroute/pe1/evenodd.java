package com.stackroute.pe1;

import java.util.*;
public class evenodd {
    public static void main(String[] args){
        System.out.println("Enter an Integer :");
        Scanner sc= new Scanner(System.in);
        int x =sc.nextInt();
        evenodd t=new evenodd();
        t.compareeven(x);
    }

    public int compareeven(int g){
        if(g>20&&g<30){
            if(g%2==0){
                System.out.println("jerry");
            }
            else{
                System.out.println("tom");
            }
        }
        return g;
    }
}