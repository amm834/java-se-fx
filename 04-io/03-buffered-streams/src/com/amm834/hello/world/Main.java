package com.amm834.hello.world;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            var file = new FileWriter("d:\\tmp\\output.txt");
            var writer = new BufferedWriter(file);
            var lines = new String[]{"Hello", "Hi", "Ha Ha"};
            writer.write("Hello");

//            for (String line : lines) {
//                writer.write(line);
//                writer.newLine();
//            }

            file.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
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
