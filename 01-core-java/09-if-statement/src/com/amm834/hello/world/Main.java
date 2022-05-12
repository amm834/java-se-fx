package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        var age = 17;

        if (age < 18) {
            System.out.println("Hello kid, drink a cup of coffee.");
        }

        if (age >= 18) {
            System.out.println("Hey, you have no access to enter this bar.");
        }
    }
}
