package com.amm834.hello.world;

import java.io.*;

public class Exercise {
    public static void main(String[] args) {
        try {
            var output = new ObjectOutputStream(new FileOutputStream("d:/tmp/std_arr"));
            Student[] students = {
                    new Student("Aung Aung", 3),
                    new Student("Hla Hla", 2),
            };
            output.writeObject(students);
            output.close();

            var input = new ObjectInputStream(new FileInputStream("d:/tmp/std_arr"));
            var stds = (Student[]) input.readObject();
            for (Student std : stds) {
                System.out.println(std.id);
                System.out.println(std.name);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
