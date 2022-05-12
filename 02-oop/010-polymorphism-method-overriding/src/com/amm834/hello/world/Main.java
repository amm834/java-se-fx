package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        var person = new Person();
        // method overloading polymorphic behavior
        person.showInfo("Mg Mg");
        person.showInfo(2, "Hla Hla");
    }
}

