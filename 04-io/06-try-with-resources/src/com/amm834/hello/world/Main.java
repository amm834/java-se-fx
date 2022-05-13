package com.amm834.hello.world;

public class Main {

    public static void main(String[] args) {
        try(var reader = new MyReader();) {
            System.out.println("Processing ...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

