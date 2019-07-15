package com.stackroute.pe1;

import java.util.*;
public class VowelConsonantChecker {
    public static void main(String[] args) {
        int j = 0;
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
    }

    public  String vowelConsonantChecker(String wordInput) {
        for (int i = 0; i < wordInput.length(); i++) {
            if (wordInput.charAt(i) == 'a' ||wordInput.charAt(i) == 'e' || wordInput.charAt(i) == 'i' || wordInput.charAt(i) == 'o' || wordInput.charAt(i) == 'u') {
                System.out.println(wordInput.charAt(i) + " vowel");

            } else {
                System.out.println(wordInput.charAt(i) + " consonant");

            }
        }
        return wordInput;
    }
}
