package com.stackroute.pe1;

import java.util.*;
public class PalindromeChecker {
    public static void main(String args[]) {
        int x = 0, sum = 0, temp, rem;
        System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }



        public String palindromeChecker(int m){
            int evensum=0,sum=0,rem,temp;
            temp = m;
            while (m > 0) {
                rem = m % 10;
                if (rem % 2 == 0) {
                    evensum = evensum + rem;
                }
                sum = (sum * 10) + rem;
                m = m / 10;
            }
            if (temp == sum){
                System.out.println("palindrome number ");
                return "Palindrome Number";}
            else {
                System.out.println("not palindrome");
                return "Not Palindrome";
            }
        }
}