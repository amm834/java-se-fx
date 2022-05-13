package com.amm834.hello.world;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        var people = new ArrayList<Person>();
        people.add(new Person(2, "Mg Mg"));
        people.add(new Person(1, "Aung Aung"));
        people.add(new Person(3, "Hla Hla"));

        Collections.sort(people);
        people.forEach(person -> System.out.println(person.id + " " + person.name));

    }
}

