package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        System.out.println("0 to 9");
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("10 to 0");
        for (var i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
