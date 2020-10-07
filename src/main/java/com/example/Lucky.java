package com.example;

/**
 * Предоставляет метод определения счастливого билета
 */
public interface Lucky {

    boolean getLucky();

    String getNormalChars();

    String addChars(Integer number);

    boolean isLucky(int digit);

    boolean comparable(int... digits);



}
