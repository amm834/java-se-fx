package com.amm834.hello.world;

class Util {
    public static <T> void printAll(T[] arr) {
        for (T t : arr) {
            System.out.println(t);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        var numbers = new Integer[]{1, 2, 3, 4, 5};
        var names = new String[]{"Mg Mg", "Aung Aung", "Hla Hla"};

        Util.printAll(numbers);
        Util.<String>printAll(names);
    }
}
