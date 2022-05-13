package com.amm834.hello.world;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        var input = new File("d:/tmp/input.txt");
        var output = new File("d:/tmp/output.txt");
        try {
            var reader = new FileReader(input);
            var writer = new FileWriter(output);

            int code;
            while ((code = reader.read()) != -1) {
                writer.write(code);
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
