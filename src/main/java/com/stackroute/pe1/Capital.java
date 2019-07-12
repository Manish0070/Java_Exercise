package com.stackroute.pe1;
import java.util.Scanner;
public class Capital {
    public static void main(String[] args) {
        System.out.println("Enter Character");
        char charac='A';
        Capital cap=new Capital();
        cap.CharacterCheck(charac);
    }


   public String CharacterCheck(char c) {

        int x = (int)c;
        if (x >= 65 && x <= 90)
            return ("Capital Letter");
        else
            return ("Small Letter");


}}
