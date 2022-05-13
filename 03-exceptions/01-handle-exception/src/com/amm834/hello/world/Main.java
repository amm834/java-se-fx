package com.amm834.hello.world;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var file = new File("D:\\foo\\some.txt");
        try {
            var scanner = new Scanner(file);
            System.out.println("Good to go");
        } catch (FileNotFoundException e) {
            System.out.println("Found error");
            e.printStackTrace();
        }
    }
}
