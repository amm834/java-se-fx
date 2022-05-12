package com.amm834.hello.world;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var random = new Random();
        var num1 = random.nextInt();
        var num2 = random.nextDouble();
        var bound = random.nextInt(100); // 0 - 100

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(bound);
    }
}
