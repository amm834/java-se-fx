package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        var country = new Country<>("mm", "Myanmar");

        System.out.println(country.getKey());
        System.out.println(country.getValue());
    }
}

