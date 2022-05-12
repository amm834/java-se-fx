package com.amm834.hello.world;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter mile: ");
        var mileString = scanner.nextLine();

        var mile = Integer.parseInt(mileString);
        var km = convertToKilometer(mile);
        System.out.println(km);
    }

    public static double convertToKilometer(double mile) {
        return mile * 1.60934;
    }
}
