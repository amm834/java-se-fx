package com.amm834.hello.world;

import java.io.FileNotFoundException;

public class Reader {
    public void read(int code) throws FileNotFoundException, ClassNotFoundException {
        if (code == 1)
            throw new FileNotFoundException("File ma shi boo ha");
        if (code == 2)
            throw new ClassNotFoundException("Class ma shi boo ha");
    }
}
