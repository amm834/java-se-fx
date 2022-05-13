package com.amm834.hello.world;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        var reader = new Reader();
        try {
            reader.read(1);
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

