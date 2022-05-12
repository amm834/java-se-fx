package com.amm834.hello.world;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // public, non-modifier and age can be accessible
        var person = new Person();
        person.age = 20;
        person.date = new Date();
        person.job = "Programmer";
    }
}

