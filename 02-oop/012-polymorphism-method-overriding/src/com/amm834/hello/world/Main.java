package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.showInfo();

        Student std1 = new Student();
//        std1.showInfo();

        Person std2 = std1; // up casting
        std1.showInfo();
    }
}


