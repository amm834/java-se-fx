package com.amm834.hello.world;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var arrayList = new ArrayList<Integer>();
        var linkedList = new LinkedList<Integer>();

        addToList(arrayList);
        addToList(linkedList);
    }

    private static void addToList(List<Integer> list) {
        for (var i = 0; i < 100000; i++) {
            list.add(i);
        }

        var t1 = System.currentTimeMillis();
        for (var i = 0; i < 100000; i++) {
            list.add(0, i);
        }

        var t2 = System.currentTimeMillis();
        System.out.println("Time Taken: " + (t2 - t1) + "ms");
    }


}
