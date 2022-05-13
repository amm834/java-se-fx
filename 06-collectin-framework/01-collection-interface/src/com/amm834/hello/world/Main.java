package com.amm834.hello.world;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(20);
        numbers.add(5);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("--------------");

        var iterators = numbers.iterator();
        while (iterators.hasNext()) {
            System.out.println(iterators.next());
        }
    }
}
