package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        int x = 128;

        // round value
        // -128,127--------0-------127
        byte y = (byte) x;
        System.out.println(y);
    }
}
