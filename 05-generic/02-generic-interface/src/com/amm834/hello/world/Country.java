package com.amm834.hello.world;

public class Country<TKey, TValue> implements Pair<TKey, TValue> {

    private TKey key;
    private TValue value;

    public Country(TKey key, TValue value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public TKey getKey() {
        return this.key;
    }

    @Override
    public TValue getValue() {
        return this.value;
    }
}

