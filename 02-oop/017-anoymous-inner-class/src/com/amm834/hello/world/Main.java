package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        var car = new Machine() {
            @Override
            public void start() {
                System.out.println("Car is starting");
            }

            @Override
            public void stop() {
                System.out.println("Car is stopping");
            }
        };
        car.start();
        car.stop();
    }
}

