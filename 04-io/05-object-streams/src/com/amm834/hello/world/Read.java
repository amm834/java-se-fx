package com.amm834.hello.world;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {
    public static void main(String[] args) {
        try {
            var input = new ObjectInputStream(new FileInputStream("d:/tmp/obj"));
            var student = (Student) input.readObject();
            System.out.println(student.id);
            System.out.println(student.name);

            input.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
