package com.amm834.hello.world;

import java.io.Console;

public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Car is staring");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    public void changeGear() {
        System.out.println("Gear was changed");
    }
}
