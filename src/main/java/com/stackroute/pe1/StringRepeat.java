package com.stackroute.pe1;
import java.util.*;
public class StringRepeat {
    public static void main(String[] args) {
        int len;
        Scanner sc = new Scanner(System.in);
        String g = sc.next();
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();

    }
    public String concateString(int inputNumber,String inputString) {
        if (inputString == null) {
            return null;
        } else {
            int stringlength;
            String x = "";
            String d = "";
            stringlength = inputString.length();
            for (int i = 0; i < inputNumber; i++) {
                for (int j = stringlength - inputNumber; j < inputString.length(); j++) {

                    x = x + (inputString.charAt(j));
                }

            }
            System.out.println(inputString + x);
            return inputString + x;

        }
    }

}