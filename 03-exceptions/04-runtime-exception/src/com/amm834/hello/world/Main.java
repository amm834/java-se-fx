package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        try {
            var result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided by 0");
        }

        var numbers = new int[]{1, 2, 3, 4, 5};
        try {
            var number = numbers[10];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is not exists");
        }
    }
}
