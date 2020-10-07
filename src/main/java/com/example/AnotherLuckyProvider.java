package com.example;

public class AnotherLuckyProvider implements LuckyProvider{
    @Override
    public Lucky get(int n) {
        return new AnotherLuckyImpl(n);
    }
}
