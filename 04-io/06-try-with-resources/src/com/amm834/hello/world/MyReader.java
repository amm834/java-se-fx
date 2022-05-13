package com.amm834.hello.world;

public class MyReader implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closed");
    }
}
