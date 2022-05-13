package com.amm834.hello.world;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        var file = new File("D:\\some\foo.txt");
        var reader = new Reader();
        try {
            reader.read(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

