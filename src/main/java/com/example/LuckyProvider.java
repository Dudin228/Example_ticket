package com.example;

/**
 * Предоставляет метод, возвращающие обьекты реализующие интерфейс (@Link Lucky)
 */
public interface LuckyProvider {
    /**
     *
     * @param n номер обьекта кандидата
     * @return обьект-кандидат
     */
    default Lucky get(int n){
        return new LuckyImpl(n);
    };
}
