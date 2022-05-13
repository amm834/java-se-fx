package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        var person = new Person<Integer>();
        var student = new Student<Person>();

        invokeMe(person);
        invokeMe(student);
    }

    public static void invokeMe(Box<? extends Person> box) {

    }
}

