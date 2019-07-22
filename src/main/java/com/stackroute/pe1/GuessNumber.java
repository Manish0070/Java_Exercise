package com.stackroute.pe1;
import java.util.*;
public class GuessNumber {
    public static void main(String[] args) {
        int x = 34;
        System.out.println("Guess a Number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
    }

  public  String numberGuessedCorrectly(int input, int guessedInput) {
            if (input == guessedInput)
                return "Number Guessed correctly";
            else
                return "none";

    }

   public String guessedIntegerSmaller(int input, int guessedInput) {
        if (input > guessedInput)
            return "Guessed Input Is Smaller";
        else
            return "none";

    }

    public String guessedIntegerGreater(int input, int guessedInput) {
        if (input < guessedInput)
            return "Guessed Input Is Greater";
        else
            return "none";

    }
}