package com.stackroute.pe1;
import java.util.*;
public class ReverseStringChecker {
    public static void main(String[] args){

        System.out.println("Enter a string to revere it: ");
        Scanner sc = new Scanner(System.in);
        String g = sc.nextLine();
        ReverseStringChecker n = new ReverseStringChecker();
        n.reverse(g);}

    public String reverse(String stringInput){
        if(stringInput == null){
            return "Should Not Be Null";
        }
        String reverseString="";
        for(int j=stringInput.length()-1;j>=0;j--){
            reverseString=reverseString+stringInput.charAt(j);
        }System.out.println(reverseString);
        return reverseString;
    }
}