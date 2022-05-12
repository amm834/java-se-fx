package com.amm834.hello.world;

public class Motorbike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorbike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Motorbike is stopping");
    }
}
