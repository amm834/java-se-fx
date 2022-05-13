package com.amm834.hello.world;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
//        var numbers = new HashSet<Integer>();
//        var numbers = new LinkedHashSet<Integer>();
        var numbers = new TreeSet<Integer>();

        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println(numbers.contains(30));
        numbers.forEach(System.out::println);
    }
}
