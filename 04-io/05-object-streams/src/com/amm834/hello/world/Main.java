package com.amm834.hello.world;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        try {
            var output = new ObjectOutputStream(new FileOutputStream("d:/tmp/obj"));
            var student = new Student("Mg Mg", 1);
            output.writeObject(student);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

