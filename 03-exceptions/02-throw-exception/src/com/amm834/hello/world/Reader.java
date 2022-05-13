package com.amm834.hello.world;

import java.io.File;
import java.io.FileNotFoundException;

public class Reader {
    public void read(File file) throws FileNotFoundException {
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            throw new FileNotFoundException("ဖိုင်မရှိပါ");
        }
    }
}
