package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
//        System.out.println(numbers[0][0]);

        System.out.println("For loop");
        for (var i = 0; i < numbers.length; i++) {
            for (var j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }

        System.out.println("For each loop");
        for (int[] number : numbers) {
            for (int i = 0; i < number.length; i++) {
                System.out.println(number[i]);
            }
        }
    }
}
