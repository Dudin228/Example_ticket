package com.example;

import java.util.Iterator;

public class LuckyIterator implements Iterator<Lucky> {
    private static int MAX = 1000000;
    private LuckyProvider provider = new LuckyTicketProvider();
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
