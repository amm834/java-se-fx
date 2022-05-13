package com.amm834.hello.world;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            var file = new FileReader("d:/tmp/input.txt");
            var reader = new BufferedReader(file);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            file.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
