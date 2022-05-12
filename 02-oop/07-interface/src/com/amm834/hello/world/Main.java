package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        var car = new Car();
        var motorbike = new Motorbike();
        ignite(car);
        ignite(motorbike);
    }

    // polymorphic here
    public static void ignite(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
    }
}
