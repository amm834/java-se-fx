package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        var numbers = new int[]{1, 2, 3, 4, 5};

        System.out.println("Iterating with for loop");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Iterating with for each loop");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
