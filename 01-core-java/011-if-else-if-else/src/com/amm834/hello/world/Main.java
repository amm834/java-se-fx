package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        var mark = 83;
        if (mark > 75) {
            System.out.println("Distinction");
        } else if (mark >= 40) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
