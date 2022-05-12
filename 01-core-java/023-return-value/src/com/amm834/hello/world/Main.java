package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        var square = calculateArea(2, 2);
        System.out.println("Area of square is " + square);
        
    }

    public static int calculateArea(int x, int y) {
        return x * y;
    }
}
