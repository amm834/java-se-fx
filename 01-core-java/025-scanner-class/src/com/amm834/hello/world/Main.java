package com.amm834.hello.world;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        var ageString = scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name " + name);
        int age = Integer.parseInt(ageString);
        if (age > 18) {
            System.out.print("You are adult");
        } else {
            System.out.print("You are child");
        }

    }
}
