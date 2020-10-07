package com.example;

public class LuckyTicketProvider implements LuckyProvider {

    @Override
    public Lucky get(int n) {
        return new LuckyImpl(n);
    }
}
