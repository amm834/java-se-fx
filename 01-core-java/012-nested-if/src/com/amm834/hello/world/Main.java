package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        var input = -10;
        if (input >= 0 && input <= 100) {
            var mark = input;
            if (mark > 80) {
                System.out.println("Distinction");
            } else if (mark >= 40 && mark < 80) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Wrong Input");
        }
    }
}
