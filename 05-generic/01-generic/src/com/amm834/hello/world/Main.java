package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        var box = new Box<Integer>();
        box.setValue(10);
        System.out.println(box.getValue());

        var box2 = new Box<String>();
        box2.setValue("Mg Mg");
        System.out.println(box2.getValue());

    }
}

