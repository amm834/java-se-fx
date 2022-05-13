package com.amm834.hello.world;

import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> numbers = new LinkedList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.addFirst(10);
        numbers.addLast(20);

        numbers.forEach(System.out::println);
    }
}
