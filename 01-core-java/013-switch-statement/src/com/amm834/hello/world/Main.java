package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        var x = 10;
        switch (x) {
            case 1 -> System.out.println("x is 1");
            case 2 -> System.out.println("x is 2");
            case 3 -> System.out.println("x is 3");
            default -> System.out.println("You entered " + x);
        }
    }
}
