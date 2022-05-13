package com.amm834.hello.world;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        var countries = new LinkedHashMap<String, String>();
        countries.put("mm", "Myanmar");
        countries.put("my", "Malaysia");
        countries.put("en", "English");

        System.out.println(countries.get("mm"));
        System.out.println(countries.size());

        var keys = countries.keySet();
        for (String key : keys) {
            System.out.println(countries.get(key));
        }
    }
}
