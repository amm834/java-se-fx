package com.amm834.hello.world;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.sort((num1, num2) -> {
            if (num1 > num2) return -1;
            return 1;//change position first and last
        });

        numbers.forEach(System.out::println);
    }
}
