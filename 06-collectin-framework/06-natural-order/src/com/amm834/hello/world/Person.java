package com.amm834.hello.world;

public class Person implements Comparable<Person> {
    public final int id;
    public final String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person person) {
        if (this.id > person.id)
            return -1;
        return 1;
    }
}
