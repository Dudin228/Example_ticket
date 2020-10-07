package com.example;

import java.util.Iterator;

public class AnotherLuckyIterator implements Iterator<Lucky> {
    private static int MAX = 10000;
    private LuckyProvider provider = new AnotherLuckyProvider();
    private int current = 0;
    @Override
    public boolean hasNext() {
        return current<MAX;
    }

    @Override
    public Lucky next() {
        Lucky lucky = provider.get(current);
        current++;
        return lucky;
    }

}