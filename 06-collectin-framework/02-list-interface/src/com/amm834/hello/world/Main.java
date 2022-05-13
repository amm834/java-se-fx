package com.amm834.hello.world;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        var animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Snake");
        animals.add("Shake");

        System.out.println(animals.get(1));

        animals.add(1, "Bird");

        System.out.println(animals.get(1));

        System.out.println("Iterating animals");
        animals.forEach(System.out::println);

        System.out.println("After sorting");
        Collections.sort(animals);
        animals.forEach(System.out::println);


    }
}