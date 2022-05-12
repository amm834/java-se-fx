package com.amm834.hello.world;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        showInfo("Mg Mg", 18, new Date());
    }

    public static void showInfo(String name, int age) {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }

    public static void showInfo(String name, int age, Date birthDate) {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My birthdate is " + birthDate);
    }
}
