package com.amm834.hello.world;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var random = new Random();
        var scanner = new Scanner(System.in);

        var secretNumber = random.nextInt(6);
        String inputString;
        int guessingNumber;

        System.out.println("Guessing Game");
        do {
            System.out.print("> ");
            inputString = scanner.nextLine();
            guessingNumber = Integer.parseInt(inputString);

            if (guessingNumber > secretNumber) {
                System.out.println("Too high");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Too low");
            } else {
                System.out.println("Congrats!");
            }
        } while (guessingNumber != secretNumber);
    }
}
