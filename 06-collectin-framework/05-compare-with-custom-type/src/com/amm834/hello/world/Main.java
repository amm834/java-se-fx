package com.amm834.hello.world;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var people = new ArrayList<Person>();
        people.add(new Person(2, "Mg Mg"));
        people.add(new Person(1, "Aung Aung"));
        people.add(new Person(3, "Hla Hla"));

        people.sort((p1, p2) -> {
//            if (p1.id > p2.id) {
//                return -1;
//            }
//            return 1;

            return -p1.name.compareTo(p2.name);
        });

        people.forEach(person -> System.out.println(person.id + " " + person.name));

    }
}

