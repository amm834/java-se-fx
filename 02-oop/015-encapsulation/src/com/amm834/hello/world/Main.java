package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        var person = getPersonInfo();

        System.out.println("ID " + person.getId());
        System.out.println("Name " + person.getName());
    }

    private static Person getPersonInfo() {
        var person = new Person(2, "Mg Mg");
        return person;
    }
}


