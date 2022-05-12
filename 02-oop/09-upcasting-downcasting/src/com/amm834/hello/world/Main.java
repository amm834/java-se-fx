package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        Machine machine1 = new Machine();
//        machine1.start();
//        machine1.stop();

        Car car1 = new Car();
//        car1.start();
//        car1.stop();
//        car1.changeGear();

        Machine mac2 = car1; // up casting -> change child to parent type -> impure machine -> cast as a car
//        mac2.start();
//        mac2.stop();

//        Car car2 = (Car) machine1; // pure machine cannot be down cast
        Car car2 = (Car) mac2; // down cast -> impure mac2
        car2.start();
        car2.stop();
        car2.changeGear();

    }
}

